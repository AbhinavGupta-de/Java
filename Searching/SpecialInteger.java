package Searching;

public class SpecialInteger {
 public int solve(int[] A, int B) {
  return kthMax(A, B);
 }

 public int kthMax(int[] nums, int k) {

  int start = 0;
  int end = nums[nums.length - 1];

  while (start <= end) {
   int mid = start + (end - start) / 2;

   if (isValid(nums, mid, k))
    start = mid + 1;
   else
    end = mid - 1;
  }

  return end;
 }

 public boolean isValid(int[] nums, int len, int k) {
  int sum = 0;

  for (int i = 0; i < len; i++) {
   sum += nums[i];
  }

  if (sum > k)
   return false;

  for (int i = len; i < nums.length; i++) {
   sum += nums[i];
   sum -= nums[i - len];

   if (sum > k)
    return false;
  }

  return true;
 }

 public static void main(String[] args) {
  SpecialInteger obj = new SpecialInteger();
  int[] nums = { 1, 2, 3, 4, 5 };
  int k = 10;
  System.out.println(obj.solve(nums, k));
 }

}
