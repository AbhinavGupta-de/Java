package sorting;

import java.util.Arrays;

public class InsertionSort {

 // static void sort(int arr[]) {
 // int n = arr.length;
 // for (int i = 1; i < n; ++i) {
 // int key = arr[i];
 // int j = i - 1;

 // /*
 // * Move elements of arr[0..i-1], that are
 // * greater than key, to one position ahead
 // * of their current position
 // */
 // while (j >= 0 && arr[j] > key) {
 // arr[j + 1] = arr[j];
 // j = j - 1;
 // }
 // arr[j + 1] = key;
 // }
 // }

 public static void inserstionSort(int[] nums) {
  int n = nums.length;
  for (int i = 0; i < n - 1; i++) {
   for (int j = i + 1; j > 0; j--) {
    if (nums[j] < nums[j - 1]) {
     swap(nums, j, j - 1);
    } else {
     break;
    }
   }
  }
 }

 public static void swap(int[] nums, int i, int j) {
  int temp = nums[i];
  nums[i] = nums[j];
  nums[j] = temp;
 }

 public static void main(String[] args) {
  int[] nums = { 1, 343, 23, 987, 7, 2, 1, 0, 12, 3, 4, 5, 6, 7, 8, 9, 10 };
  inserstionSort(nums);
  System.out.println("Sorted array: " + Arrays.toString(nums));
 }
}
