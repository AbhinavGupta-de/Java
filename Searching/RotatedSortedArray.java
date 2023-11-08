package Searching;

public class RotatedSortedArray {
 /*
  *
  * Given a sorted array of integers A of size N and an integer B,
  * where array A is rotated at some pivot unknown beforehand.
  * 
  * For example, the array [0, 1, 2, 4, 5, 6, 7] might become [4, 5, 6, 7, 0, 1,
  * 2].
  * 
  * Your task is to search for the target value B in the array. If found, return
  * its index; otherwise, return -1.
  * 
  * You can assume that no duplicates exist in the array.
  * 
  * NOTE: You are expected to solve this problem with a time complexity of
  * O(log(N)).
  *
  */

 /**
  * Searches for the target element in a rotated sorted array.
  * 
  * @param nums   the rotated sorted array to search in
  * @param target the element to search for
  * @return the index of the target element if found, -1 otherwise
  */
 public static int search(int[] nums, int target) {
  // Declare start and end indices
  int start = 0, end = nums.length - 1;

  // Binary search
  while (start <= end) {

   // Calculate the middle index
   int mid = start + (end - start) / 2;

   // If the middle element is the target, return its index
   if (nums[mid] == target)
    return mid;

   // If the left half is sorted
   if (nums[start] <= nums[mid]) {

    // If the target is in the left half
    if (target >= nums[start] && target < nums[mid])
     // Search in the left half
     end = mid - 1;
    else
     // Search in the right half
     start = mid + 1;
   }
   // If the right half is sorted
   else {
    // If the target is in the right half
    if (target > nums[mid] && target <= nums[end])
     start = mid + 1;
    else
     end = mid - 1;
   }
  }
  return -1;
 }
}
