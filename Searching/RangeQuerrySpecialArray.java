package Searching;

public class RangeQuerrySpecialArray {
 public int[] solve(int[][] querries, int[] arr) {
  int[] res = new int[querries.length];

  // Brute Force Approach
  // for (int i = 0; i < querries.length; i++) {
  // int l = querries[i][0];
  // int r = querries[i][1];
  // int count = 0;
  // for (int j = l; j <= r; j++) {
  // if (countDigits(arr[j]) < 15) {
  // count++;
  // }
  // }
  // res[i] = count;
  // }

  // Optimized Approach
  // Find the count of numbers with less than 15 digits
  int[] count = new int[arr.length];
  for (int i = 0; i < arr.length; i++) {
   if (countDigits(arr[i]) < 15) {
    count[i] = 1;
   } else {
    count[i] = 0;
   }
  }
  // Suffix
  int[] suffix = new int[arr.length];
  suffix[arr.length - 1] = (count[arr.length - 1] == 1) ? arr.length - 1 : -1;
  for (int i = arr.length - 2; i >= 0; i--) {
   if (count[i] == 1) {
    suffix[i] = i;
   } else {
    suffix[i] = suffix[i + 1];
   }
  }

  for (int i = 0; i < querries.length; i++) {
   int l = querries[i][0];
   int r = querries[i][1];
   if (suffix[l] == -1) {
    res[i] = -1;
   } else if (suffix[l] > r) {
    res[i] = -1;
   } else {
    res[i] = suffix[l];
   }
  }
  return res;
 }

 public int countDigits(int num) {
  int count = 0;
  while (num > 0) {
   count++;
   num /= 10;
  }
  return count;
 }

}
