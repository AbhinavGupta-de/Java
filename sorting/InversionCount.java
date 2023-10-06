package sorting;

public class InversionCount {
 public static int inversionCount(int[] arr, int l, int r) {
  // int count = 0;
  // for (int i = 0; i < arr.length; i++) {
  // for (int j = i + 1; j < arr.length; j++) {
  // if (arr[i] > arr[j]) {
  // count++;
  // }
  // }
  // }
  // return count;

  // Solve this in O(nlogn) time complexity
  if (l >= r) {
   return 0;
  }
  int mid = (l + r) / 2;
  int leftCount = inversionCount(arr, l, mid);
  int rightCount = inversionCount(arr, mid + 1, r);
  merge(arr, l, mid, r);
  return leftCount + rightCount;
 }

 public static void main(String[] args) {
  int[] arr = { 5, 4, 3, 2, 1 };
  int[] result = new int[arr.length];
  System.out.println(inversionCount(arr, 0, arr.length - 1, result));
 }

}
