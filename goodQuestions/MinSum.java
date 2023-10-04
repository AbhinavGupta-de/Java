package goodQuestions;

import java.util.Arrays;

// Given a array, remove al lth eleements such that cost is minmum.
public class MinSum {

 public static int sumOfElements(int[] arr) {
  int sum = 0;
  for (int i = 0; i < arr.length; i++) {
   sum += arr[i];
  }
  return sum;
 }

 public static int minSum(int[] arr) {
  int sum = sumOfElements(arr);
  int ans = sum;
  Arrays.sort(arr);

  for (int i = arr.length - 1; i >= 0; i--) {
   sum -= arr[i];
   ans += sum;
  }

  return ans;
 }

 public static void main(String[] args) {
  int[] arr = { 1, 2, 4 };
  System.out.println(minSum(arr));
 }

}
