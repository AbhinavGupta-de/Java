package arrays;

// import java.util.ArrayList;

/**
 * SortLastElement
 */
public class SortLastElement {

 public void sortAccordingToLastElement(int[] arr) {
  // ArrayList<Integer> mins = new ArrayList<>();
  // ArrayList<Integer> maxs = new ArrayList<>();

  // for (int i = 0; i < arr.length - 1; i++) {
  // if (arr[i] < arr[arr.length - 1]) {
  // mins.add(arr[i]);
  // } else {
  // maxs.add(arr[i]);
  // }
  // }

  // int[] sorted = new int[arr.length];
  // int i = 0;
  // for (int min : mins) {
  // sorted[i++] = min;
  // }
  // sorted[i++] = arr[arr.length - 1];
  // for (int max : maxs) {
  // sorted[i++] = max;
  // }

  // return sorted;

  int lastElement = arr[arr.length - 1];
  int i = 0;
  int j = 0;

  while (i < arr.length - 1) {
   if (arr[i] < lastElement) {
    swap(arr, i, j);
    j++;
   }

   i++;
  }

  swap(arr, j, arr.length - 1);
 }

 public void swap(int[] arr, int i, int j) {
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
 }

 // Overloading the method so that it works on portion of the array
 public void sortAccordingToLastElement(int[] arr, int start, int end) {
  int lastElement = arr[end];
  int i = start;
  int j = start;

  while (i < end) {
   if (arr[i] < lastElement) {
    swap(arr, i, j);
    j++;
   }

   i++;
  }

  swap(arr, j, end);
 }

 public static void main(String[] args) {
  SortLastElement sle = new SortLastElement();
  int[] arr = { 9, 8, 1, 6, 5, 11, 4, 7 };
  sle.sortAccordingToLastElement(arr);
  for (int i : arr) {
   System.out.print(i + " ");
  }
 }
}