package goodQuestions;

public class SumOfEvenIndices {
 public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
  int[] result = new int[queries.length];
  int[] sumEvens = new int[A.length];
  sumEvens[0] = A[0];
  for (int i = 1; i < A.length; i++) {
   if (i % 2 == 0) {
    sumEvens[i] = sumEvens[i - 1] + A[i];
   }
  }

  for (int i = 0; i < queries.length; i++) {
   int left = queries[i][0];
   int right = queries[i][1];
   if (left == 0) {
    result[i] = sumEvens[right];
   } else {
    result[i] = sumEvens[right] - sumEvens[left - 1];
   }
  }
  return result;
 }
}
