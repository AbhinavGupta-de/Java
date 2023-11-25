package Searching;

import java.util.Arrays;

public class AggressiveCow {

 public int maxDistance(int[] nums, int cows) {
  Arrays.sort(nums);
  int start = 0, end = nums[nums.length - 1] - nums[0];

  while (start <= end) {
   int mid = start + (end - start) / 2;

   if (isValid(nums, mid, cows))
    start = mid + 1;
   else
    end = mid - 1;
  }

  return end;
 }

 public boolean isValid(int[] nums, int mid, int cows) {
  int count = 1;
  int lastPlacedCow = nums[0];

  for (int i = 1; i < nums.length; i++) {
   if (nums[i] - lastPlacedCow >= mid) {
    count++;
    lastPlacedCow = nums[i];

    if (count == cows)
     return true;
   }
  }
  return false;
 }

}
