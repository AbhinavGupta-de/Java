package sorting;

public class Merge2SortedArray {
 // Given two storted array merge both of them and return the sorted array
 public static int[] merge2SortedArray(int[] arr1, int[] arr2) {
  int[] arr = new int[arr1.length + arr2.length];
  int i = 0, j = 0, k = 0;
  while (i < arr1.length && j < arr2.length) {
   if (arr1[i] < arr2[j]) {
    arr[k] = arr1[i];
    i++;
   } else {
    arr[k] = arr2[j];
    j++;
   }
   k++;
  }
  while (i < arr1.length) {
   arr[k] = arr1[i];
   i++;
   k++;
  }
  while (j < arr2.length) {
   arr[k] = arr2[j];
   j++;
   k++;
  }
  return arr;
 }
}
