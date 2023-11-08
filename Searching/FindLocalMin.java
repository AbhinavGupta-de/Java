package Searching;

public class FindLocalMin {

 public int localMin(int[] nums) {
  int start = 0;
  int end = nums.length - 1;

  while (start < end) {
   int mid = start + (end - start) / 2;
   if (mid > 0 && mid < nums.length - 1) {
    if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
     return nums[mid];
    } else if (nums[mid - 1] < nums[mid]) {
     end = mid;
    } else {
     start = mid;
    }
   } else if (mid == 0) {
    if (nums[mid] < nums[mid + 1]) {
     return nums[mid];
    } else {
     start = mid + 1;
    }
   } else if (mid == nums.length - 1) {
    if (nums[mid] < nums[mid - 1]) {
     return nums[mid];
    } else {
     end = mid - 1;
    }
   }
  }

  return -1;
 }

 public static void main(String[] args) {
  int[] nums = { 10, 3, 7, 4, 15, 11, 89, 13 };

  FindLocalMin findLocalMin = new FindLocalMin();
  System.out.println(findLocalMin.localMin(nums));
 }

}
