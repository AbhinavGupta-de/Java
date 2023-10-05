package sorting;

import java.util.Arrays;

public class MergeTwoSortedSubArrays {

 // We are given an array along with l, m and r.
 public static int[] sort(int[] arr, int l, int m, int r) {

  int[] result = new int[arr.length];

  for (int i = 0; i < l; i++) {
   result[i] = arr[i];
  }
  // Sub Array from l to m is sorted and array from m + 1 to r is also sorted we
  // have to merge them.
  int i = l;
  int j = m + 1;
  int k = l;
  while (i <= m && j <= r) {
   if (arr[i] < arr[j]) {
    result[k] = arr[i];
    i++;
   } else {
    result[k] = arr[j];
    j++;
   }
   k++;
  }

  if (i > m) {
   while (j <= r) {
    result[k] = arr[j];
    j++;
    k++;
   }
  } else {
   while (i <= m) {
    result[k] = arr[i];
    i++;
    k++;
   }
  }

  for (int d = r + 1; d < arr.length; d++) {
   result[d] = arr[d];
  }

  return result;
 }

 // now with O(1) space complexity
 public static void merge(int[] nums, int l, int m, int r) {
  int i = l;
  int j = m + 1;
  while (i <= m && j <= r) {
   if (nums[i] < nums[j]) {
    i++;
   } else {
    int temp = nums[j];
    for (int d = j; d > i; d--) {
     nums[d] = nums[d - 1];
    }
    nums[i] = temp;
    i++;
    j++;
    m++;
   }
  }
 }

 public static void main(String[] args) {
  int[] nums = { 8, 1, 3, 6, 11, 2, 4, 9, 7, 6 };
  int l = 2;
  int m = 4;
  int r = 7;
  int[] result = sort(nums, l, m, r);
  System.out.println("Sorted Array: " + Arrays.toString(result));

  merge(nums, l, m, r);
  System.out.println("Sorted Array: " + Arrays.toString(nums));
 }

}
