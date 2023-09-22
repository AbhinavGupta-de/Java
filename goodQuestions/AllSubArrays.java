package goodQuestions;

public class AllSubArrays {
 public int[][] allsubArrays(int[] A) {
  int n = A.length;
  int[][] allSubArrays = new int[n][n];
  for (int i = 0; i < n; i++) {
   for (int j = i; j < n; j++) {
    allSubArrays[i][j] = A[j];
   }
  }
  return allSubArrays;
 }
}
