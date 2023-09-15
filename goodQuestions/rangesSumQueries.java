package goodQuestions;

public class rangesSumQueries {
 public static int[] sumQueries(int[] arr, int[][] queries) {
  int[] result = new int[queries.length];

  // * n^2 solution
  // int sum = 0;
  // for (int i = 0; i < queries.length; i++) {
  // for (int j = queries[i][0]; j <= queries[i][1]; j++) {
  // sum += arr[j];
  // }
  // result[i] = sum;
  // sum = 0;
  // }

  // * n solution
  int[] prefixSum = new int[arr.length];
  prefixSum[0] = arr[0];
  for (int i = 1; i < arr.length; i++) {
   prefixSum[i] = prefixSum[i - 1] + arr[i];
  }
  for (int i = 0; i < queries.length; i++) {
   int left = queries[i][0];
   int right = queries[i][1];
   if (left == 0) {
    result[i] = prefixSum[right];
   } else {
    result[i] = prefixSum[right] - prefixSum[left - 1];
   }
  }
  return result;
 }

 public static void main(String[] args) {
  int[] arr = { 1, 2, 3, 4, 5 };
  int[][] queries = { { 1, 3 }, { 0, 1 }, { 2, 4 } };
  int[] result = sumQueries(arr, queries);
  for (int i = 0; i < result.length; i++) {
   System.out.println(result[i]);
  }
 }
}
