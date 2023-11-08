package Searching;

public class FindInRotatedArray {

 public int find(int[] nums, int target) {

  if (nums.length < 4) {
   for (int i = 0; i < nums.length; i++) {
    if (nums[i] == target)
     return i;
   }
  }

  int pivot = findPivot(nums);

  if (pivot == -1) {
   return (int) binarySearch(nums, target, 0, nums.length - 1);
  }

  if (nums[pivot] == target) {
   return pivot;
  }

  if (target >= nums[0]) {
   return (int) binarySearch(nums, target, 0, pivot - 1);
  }

  return (int) binarySearch(nums, target, pivot + 1, nums.length - 1);

 }

 public int findPivot(int[] nums) {
  int start = 0, end = nums.length - 1;

  while (start < end) {
   int mid = start + (int) ((long) end - (long) start) / 2;

   if ((long) nums[mid] > (long) nums[mid + 1]) {
    return mid;
   } else if ((long) nums[mid] < (long) nums[mid + 1]) {
    start = mid + 1;
   } else {
    end = mid;
   }
  }

  return -1;
 }

 public long binarySearch(int[] nums, int target, int start, int end) {

  while (start <= end) {
   int mid = start + (end - start) / 2;

   if (nums[mid] == target)
    return (long) mid;
   else if (nums[mid] > target) {
    end = mid - 1;
   } else if (nums[mid] < target) {
    start = mid + 1;
   }
  }
  return -1;
 }

}
