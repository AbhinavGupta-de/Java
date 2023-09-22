package goodQuestions;

// * Find the maximum sum of the contiguous subarray in a given array.
public class maxSumSubArray {
 public static int maxSum(int[] nums) {

  // * n^2 solution
  int maxSum = Integer.MIN_VALUE;
  // int[] prefixSum = new int[nums.length];
  // prefixSum[0] = nums[0];
  // for (int i = 1; i < nums.length; i++) {
  // prefixSum[i] = prefixSum[i - 1] + nums[i];
  // }

  // for (int i = 0; i < nums.length; i++) {
  // for (int j = i; j < nums.length; j++) {
  // int subArraySum = prefixSum[j] - prefixSum[i] + nums[i];
  // maxSum = Math.max(maxSum, subArraySum);
  // }
  // }
  // if (maxSum < prefixSum[prefixSum.length - 1]) {
  // maxSum = prefixSum[prefixSum.length - 1];
  // }

  // * n solution
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
   sum += nums[i];
   if (sum > maxSum) {
    maxSum = sum;
   }
   if (sum < 0) {
    sum = 0;
   }
  }

  return maxSum;
 }
}
