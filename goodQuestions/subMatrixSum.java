package goodQuestions;

public class subMatrixSum {
 public int sum(int[][] A, int[][] queries) {
  int sum = 0;
  int[][] prefixSum = new int[A.length][A[0].length];
  prefixSum[0][0] = A[0][0];
  for (int i = 1; i < A.length; i++) {
   prefixSum[i][0] = prefixSum[i - 1][0] + A[i][0];
  }
  for (int i = 1; i < A[0].length; i++) {
   prefixSum[0][i] = prefixSum[0][i - 1] + A[0][i];
  }
  for (int i = 1; i < A.length; i++) {
   for (int j = 1; j < A[0].length; j++) {
    prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1] + A[i][j];
   }
  }
  for (int i = 0; i < queries.length; i++) {
   int x1 = queries[i][0];
   int y1 = queries[i][1];
   int x2 = queries[i][2];
   int y2 = queries[i][3];
   if (x1 == 0 && y1 == 0) {
    sum = prefixSum[x2][y2];
   } else if (x1 == 0) {
    sum = prefixSum[x2][y2] - prefixSum[x2][y1 - 1];
   } else if (y1 == 0) {
    sum = prefixSum[x2][y2] - prefixSum[x1 - 1][y2];
   } else {
    sum = prefixSum[x2][y2] - prefixSum[x1 - 1][y2] - prefixSum[x2][y1 - 1] + prefixSum[x1 - 1][y1 - 1];
   }
  }

  return sum;
 }

 public static void main(String[] args) {
  int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
  int[][] queries = { { 0, 0, 1, 2 } };
  subMatrixSum s = new subMatrixSum();
  System.out.println(s.sum(A, queries));
 }
}
