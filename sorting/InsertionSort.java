package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

 static void sort(int arr[]) {
  int n = arr.length;
  for (int i = 1; i < n; ++i) {
   int key = arr[i];
   int j = i - 1;

   /*
    * Move elements of arr[0..i-1], that are
    * greater than key, to one position ahead
    * of their current position
    */
   while (j >= 0 && arr[j] > key) {
    arr[j + 1] = arr[j];
    j = j - 1;
   }
   arr[j + 1] = key;
  }
 }

 public static void main(String[] args) {
  int[] nums = { 1, 343, 23, 987, 7, 2, 1, 0, 12, 3, 4, 5, 6, 7, 8, 9, 10 };
  sort(nums);
  System.out.println("Sorted array: " + Arrays.toString(nums));
 }
}
