package sorting;

public class InversionCount {

 public static int inversionCount(int[] arr, int start, int end, int count) {
  if (start == end) {
   return count;
  } else {
   int mid = (start + end) / 2;
   int leftCount = inversionCount(arr, start, mid, count);
   int rightCount = inversionCount(arr, mid + 1, end, count);
   int mergeCount = merge(arr, start, mid, end, leftCount + rightCount);
   count += mergeCount;
  }
  return count;
 }

 public static int merge(int[] nums, int start, int mid, int end, int count) {

  for (int i = mid + 1; i <= end; i++) {
   for (int j = start; j <= mid; j++) {
    if (nums[j] > nums[i]) {
     count += mid - j;
     break;
    }
   }
  }

  nums = sort(nums, start, mid, end);

  return count;
 }

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

 public static void main(String[] args) {
  int[] arr = { 5, 4, 3, 2, 1 };
  System.out.println(inversionCount(arr, 0, arr.length - 1, 0));
 }

}
