package goodQuestions;

public class maxSumInPrefix {
 public int maxSum(int[] A) {
  int maxSum = 0;
  int[] prefixSum = new int[A.length];
  prefixSum[0] = A[0];
  for (int i = 1; i < A.length; i++) {
   prefixSum[i] = prefixSum[i - 1] + A[i];
  }

  return maxSum;
 }
}
