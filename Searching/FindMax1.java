package Searching;

public class FindMax1 {

 // * Find the row the maximum number of 1s in it
 public int max1Row(int[][] A) {
  int maxRow = 0;
  int maxCount = 0;
  int count = 0;

  // Binary search in each row
  for (int i = 0; i < A.length; i++) {
   int start = 0;
   int end = A[i].length - 1;
   int mid = 0;
   count = 0;
   while (start <= end) {
    mid = (start + end) / 2;
    if (A[i][mid] == 1) {
     count += end - mid + 1;
     end = mid - 1;
    } else {
     start = mid + 1;
    }
   }
   if (count > maxCount) {
    maxCount = count;
    maxRow = i;
   }
  }

  return maxRow;
 }

}
