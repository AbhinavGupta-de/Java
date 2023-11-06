package sorting;

public class QuickSort {

 public void sort(int[] arr) {
  sortArray(arr, 0, arr.length - 1);
 }

 public void sortArray(int[] arr, int start, int end) {

  int randomPivot = (int) (Math.random() * (end - start + 1)) + start;
  swap(arr, randomPivot, end);

  if (start <= end) {
   int pivot = partition(arr, start, end);
   sortArray(arr, start, pivot - 1);
   sortArray(arr, pivot + 1, end);
  }
 }

 public int partition(int[] arr, int start, int end) {
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

  return j;
 }

 public void swap(int[] arr, int i, int j) {
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
 }

 public static void main(String[] args) {
  int[] arr = { 5, 4, 3, 2, 1 };
  QuickSort qs = new QuickSort();
  qs.sort(arr);
  for (int i : arr) {
   System.out.print(i + " ");
  }
 }

}
