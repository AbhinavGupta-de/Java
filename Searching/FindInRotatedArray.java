package Searching;

public class FindInRotatedArray {

  public int find(int[] nums, int target) {

    // if (nums.length < 4) {
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] == target)
    // return i;
    // }

    // return -1;
    // }

    int pivot = findPivot(nums);
    // System.out.println(pivot);

    if (pivot == -1) {
      return binarySearch(nums, 0, nums.length - 1, target); // Added return statement
    }

    if (target > nums[pivot])
      return -1;

    if (nums[pivot] == target)
      return pivot;

    if (target >= nums[0]) {
      return binarySearch(nums, 0, pivot - 1, target);
    }

    int num = binarySearch(nums, pivot + 1, nums.length - 1, target);

    return num;
  }

  public int findPivot(int[] nums) {
    int start = 0, end = nums.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      // System.out.println(mid);
      if (nums[mid] >= nums[0]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return end;

  }

  public int binarySearch(int[] nums, int start, int end, int target) { // Changed the order of parameters

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] == target)
        return mid;
      else if (nums[mid] > target) {
        end = mid - 1;
      } else if (nums[mid] < target) {
        start = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    FindInRotatedArray obj = new FindInRotatedArray();
    int[] nums = { 3, 1 };
    System.out.println(obj.find(nums, 1));
  }

}
