package goodQuestions;

public class SumOfSubArray {
 public int sumOfSubArray(int[] nums) {
  int sum = 0;

  int[] prefixSum = new int[nums.length];
  prefixSum[0] = nums[0];
  for (int i = 1; i < nums.length; i++) {
   prefixSum[i] = prefixSum[i - 1] + nums[i];
  }

  // * n^2
  //
  // for (int i = 0; i < nums.length; i++) {
  // for (int j = i; j < nums.length; j++) {
  // if (i == 0) {
  // sum += prefixSum[j];
  // } else {
  // sum += prefixSum[j] - prefixSum[i - 1];
  // }
  // }
  // }

  // n
  for (int i = 0; i < nums.length; i++) {
   sum += nums[i] * (i + 1) * (nums.length - i);
  }

  return sum;
 }

 public static void main(String[] args) {
  int[] nums = { 1, 2, 3, 4, 5, 6 };
  SumOfSubArray s = new SumOfSubArray();
  System.out.println(s.sumOfSubArray(nums));
 }
}
