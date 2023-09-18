package goodQuestions;

public class evenNumsInRange {

 public static void main(String[] args) {
  int[] arr = { 3, 1, 5, 7, 5, 2 };
  int[][] queries = { { 0, 2 } };
  int[] result = sumQueries(arr, queries);
  for (int i = 0; i < result.length; i++) {
   System.out.println(result[i]);
  }
 }

 public static int[] sumQueries(int[] arr, int[][] queries) {
  int[] result = new int[queries.length];

  // * n solution
  int[] prefixSum = new int[arr.length];
  if (arr[0] % 2 == 0) {
   arr[0] = 1;
  } else {
   arr[0] = 0;
  }
  prefixSum[0] = arr[0];
  for (int i = 1; i < arr.length; i++) {
   if (arr[i] % 2 == 0) {
    arr[i] = 1;
   } else {
    arr[i] = 0;
   }
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

}
