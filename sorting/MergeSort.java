package sorting;

// Going to sort Merge Sort
public class MergeSort {
 public static int[] mergeSort(int[] A) {
  return sorting(A, 0, A.length - 1);
 }

 public static int[] sorting(int[] A, int start, int end) {
  if (start == end) {
   return new int[] { A[start] };
  }

  int mid = (start + end) / 2;
  int[] left = sorting(A, start, mid);
  int[] right = sorting(A, mid + 1, end);
  return merge(left, right);

 }

 public static int[] merge(int[] A, int[] B) {
  int[] result = new int[A.length + B.length];

  int i = 0, j = 0, k = 0;
  while (i < A.length && j < B.length) {
   if (A[i] < B[j]) {
    result[k++] = A[i++];
   } else {
    result[k++] = B[j++];
   }
  }

  while (i < A.length) {
   result[k++] = A[i++];
  }

  while (j < B.length) {
   result[k++] = B[j++];
  }

  return result;
 }

 public static void mergeSort_2(int[] A) {
  sorting2(A, 0, A.length - 1);
 }

 public static void sorting2(int[] A, int start, int end) {
  if (start == end) {
   return;
  }

  int mid = (start + end) / 2;
  sorting2(A, start, mid);
  sorting2(A, mid + 1, end);
  merge(A, start, mid, end);
 }

 public static void merge(int[] nums, int start, int mid, int end) {
  int i = start;
  int j = mid + 1;
  while (i <= mid && j <= end) {
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
    mid++;
   }
  }
 }
}
