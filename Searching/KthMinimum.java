package Searching;

public class KthMinimum {
 public int kthMin(int[] nums, int k) {
  k = nums.length - k;
  /*
   * 1. The array is not sorted
   * 2. We cannot make any changes to the array
   * 
   * How to solve
   * We have to use binary search to solve this problem
   *
   * [2, 0 , 6, 10, 9, 5, 4, 7], k = 3
   * ans = 4
   */

  int low = Integer.MAX_VALUE;
  int high = Integer.MIN_VALUE;

  for (int i = 0; i < nums.length; i++) {
   low = Math.min(low, nums[i]);
   high = Math.max(high, nums[i]);
  }

  while (low <= high) {
   int mid = low + (high - low) / 2;
   int count = 0;
   for (int i = 0; i < nums.length; i++) {
    if (nums[i] <= mid) {
     count++;
    }
   }
   if (count <= k) {
    low = mid + 1;
   } else {
    high = mid - 1;
   }
  }
  return low;
 }
}