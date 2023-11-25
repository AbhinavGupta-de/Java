package Searching;

public class FirstAndLastOccurence {
 public int[] searchRange(int[] nums, int target) {
  int[] ans = { -1, -1 };
  ans[0] = binarySearch(nums, target, true);
  if (ans[0] != -1)
   ans[1] = binarySearch(nums, target, false);
  return ans;
 }

 public int binarySearch(int[] nums, int target, boolean first) {
  int start = 0;
  int end = nums.length - 1;
  int ans = -1;

  while (start <= end) {
   int mid = start + (end - start) / 2;

   if (nums[mid] == target) {
    ans = mid;
    if (first)
     end = mid - 1;
    else
     start = mid + 1;
   } else if (nums[mid] < target)
    start = mid + 1;
   else
    end = mid - 1;
  }
  return ans;
 }
}
