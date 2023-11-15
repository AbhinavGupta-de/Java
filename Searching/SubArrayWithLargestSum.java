package Searching;

public class SubArrayWithLargestSum {
 // We to have return the largest length of subarray that is possible such that
 // all the
 // subarrays possible with that length have sum less than or equal to k
 // public int solve(int[] nums, int k) {
 // int start = 1;
 // int end = nums.length;

 // while (start <= end) {
 // int mid = start + (end - start) / 2;
 // if (isPossible(nums, mid, k)) {
 // start = mid + 1;
 // } else {
 // end = mid - 1;
 // }
 // }
 // return end;
 // }

 // public boolean isPossible(int[] nums, int len, int k) {
 // int sum = 0;
 // for (int i = 0; i < len; i++) {
 // sum += nums[i];
 // }
 // if (sum <= k) {
 // return true;
 // }
 // for (int i = len; i < nums.length; i++) {
 // sum += nums[i] - nums[i - len];
 // if (sum <= k) {
 // return true;
 // }
 // }
 // return false;
 // }

 public int minSubArrayLen(int target, int[] nums) {
  return solve(nums, target);
 }

 public int solve(int[] nums, int k) {
  int start = 1;
  int end = nums.length;
  int res = 0;

  while (start <= end) {
   int mid = start + (end - start) / 2;
   // System.out.println(mid);
   if (isPossible(nums, mid, k)) {
    res = mid;
    end = mid - 1;
   } else {
    start = mid + 1;
   }
  }
  return res;
 }

 public boolean isPossible(int[] nums, int len, int k) {
  int sum = 0;
  for (int i = 0; i < len; i++) {
   sum += nums[i];
  }
  if (sum >= k) {
   return true;
  }
  for (int i = 1; i < nums.length - len + 1; i++) {
   sum += nums[i + len - 1] - nums[i - 1];
   System.out.println(sum);
   if (sum >= k) {
    return true;
   }
  }

  return false;
 }

 public static void main(String[] args) {
  int[] nums = { 1, 1, 1, 1, 1, 1 };
  int k = 11;

  SubArrayWithLargestSum obj = new SubArrayWithLargestSum();
  System.out.println(obj.solve(nums, k));
 }
}
