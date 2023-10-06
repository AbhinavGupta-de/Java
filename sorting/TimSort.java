package sorting;

import java.util.Arrays;

public class TimSort {

 public static void sort(int[] arr, int start, int end) {
  if (start < end) {
   int mid = (start + end) / 2;
   sort(arr, start, mid);
   sort(arr, mid + 1, end);
   MergeTwoSortedSubArrays.merge(arr, start, mid, end);
  }
 }

 public static void main(String[] args) {
  int[] arr = { 5, 4, 3, 2, 1 };
  sort(arr, 0, arr.length - 1);

  System.out.println("Sorted Array: " + Arrays.toString(arr));
 }

}
