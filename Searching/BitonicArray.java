package Searching;

public class BitonicArray {
 public int solve(int[] A, int B) {

  int pivot = findPivot(A);

  if (A[pivot] == B)
   return pivot;

  if (A[pivot] < B)
   return -1;

  int index = binarySearchA(A, B, 0, pivot - 1);

  if (index == -1)
   return binarySearchD(A, B, pivot + 1, A.length - 1);

  return index;
 }

 public int findPivot(int[] nums) {
  int start = 0;
  int end = nums.length - 1;

  int ans = -1;

  while (start < end) {
   int mid = start + (end - start) / 2;

   if (mid == 0 || mid == nums.length - 1)
    return ans;

   if (nums[mid] > nums[mid + 1]) {
    ans = mid;
    if (mid > 0)
     end = mid - 1;
    else
     return ans;
   } else if (nums[mid] > nums[mid - 1])
    start = mid + 1;
   else
    end = mid - 1;
  }

  return ans;
 }

 public int binarySearchA(int[] nums, int target, int start, int end) {
  while (start <= end) {
   int mid = start + (end - start) / 2;

   if (nums[mid] == target)
    return mid;
   if (nums[mid] < target)
    start = mid + 1;
   else
    end = mid - 1;
  }
  return -1;
 }

 public int binarySearchD(int[] nums, int target, int start, int end) {
  // Binary search for decreasing array
  while (start <= end) {
   int mid = start + (end - start) / 2;

   if (nums[mid] == target)
    return mid;
   if (nums[mid] > target)
    start = mid + 1;
   else
    end = mid - 1;
  }

  return -1;
 }

 public static void main(String[] args) {
  int[] nums = { 1, 20, 50, 40, 10 };
  int target = 5;

  BitonicArray bitonicArray = new BitonicArray();
  System.out.println(bitonicArray.solve(nums, target));

 }
}
