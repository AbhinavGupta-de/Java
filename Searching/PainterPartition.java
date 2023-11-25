package Searching;

public class PainterPartition {
 public int splitArray(int[] nums, int k) {
  int start = 0;

  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
   sum += nums[i];
   start = Math.max(start, nums[i]);
  }

  if (k == 1)
   return sum;

  if (k == nums.length)
   return start;

  if (k > nums.length)
   return start;

  int end = sum;

  while (start <= end) {
   int mid = start + (end - start) / 2;

   if (isValid(nums, mid, k))
    end = mid - 1;
   else
    start = mid + 1;
  }

  return start;
 }

 public boolean isValid(int[] nums, int count, int k) {
  int painter = 1;
  int sum = 0;

  for (int i = 0; i < nums.length; i++) {
   sum += nums[i];

   if (sum > count) {
    painter++;
    sum = nums[i];
   }

   if (painter > k)
    return false;
  }

  return true;
 }

 public static void main(String[] args) {
  PainterPartition obj = new PainterPartition();
  int[] nums = { 10, 20, 30, 40 };
  int k = 2;
  System.out.println(obj.splitArray(nums, k));
 }
}
