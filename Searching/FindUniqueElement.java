package Searching;

/**
 * FindUniqueElement
 */
public class FindUniqueElement {

 public int findUniqueElement(int[] nums) {
  // Time Complexity: O(n)
  // int uniqueElement = 0;
  // for (int i = 0; i < nums.length; i++) {
  // uniqueElement ^= nums[i];
  // }
  // return uniqueElement;

  // Time Complexity: O(log n)

  int start = 0;
  int end = nums.length - 1;

  while (start < end) {
   int mid = start + (end - start) / 2;
   if (mid % 2 == 0) {
    if (nums[mid] == nums[mid + 1]) {
     start = mid + 2;
    } else {
     end = mid;
    }
   } else {
    if (nums[mid] == nums[mid - 1]) {
     start = mid + 1;
    } else {
     end = mid - 1;
    }
   }
  }

  return nums[start];

 }

 public static void main(String[] args) {
  int[] nums = { 5, 5, 3, 3, 7, 7, 0, 0, 6, 9, 9, 2, 2 };
  FindUniqueElement findUniqueElement = new FindUniqueElement();
  System.out.println(findUniqueElement.findUniqueElement(nums));
 }

}