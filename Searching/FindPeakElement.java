package Searching;

/**
 * FindPeakElement
 */
public class FindPeakElement {

 public int findPeakEle(int[] nums) {

  /*
   * Given an array of integers A, find and return the peak element in it.
   * An array element is considered a peak if it is not smaller than its
   * neighbors. For corner elements, we need to consider only one neighbor.
   * 
   * NOTE:
   * 
   * It is guaranteed that the array contains only a single peak element.
   * Users are expected to solve this in O(log(N)) time. The array may contain
   * duplicate elements.
   * 
   * 
   */

  int n = nums.length;
  int left = 0, right = n - 1;

  while (left < right) {
   int mid = left + (right - left) / 2;

   if (nums[mid] > nums[mid + 1]) {
    right = mid;
   } else {
    left = mid + 1;
   }
  }

  return nums[left];
 }

}