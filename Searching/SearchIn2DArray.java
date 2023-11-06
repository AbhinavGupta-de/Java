package Searching;

/**
 * SearchIn2DArray
 */
public class SearchIn2DArray {

 public int solve(int[][] arr, int target) {
  int row = 0;
  int col = arr[0].length - 1;
  int minVal = Integer.MAX_VALUE;

  while (row < arr.length && col >= 0) {
   if (arr[row][col] == target) {
    int val = ((row + 1) * 1009) + (col + 1);
    minVal = Math.min(minVal, val);
    col--;
   } else if (arr[row][col] > target) {
    col--;
   } else {
    row++;
   }
  }

  if (minVal == Integer.MAX_VALUE) {
   return -1;
  }
  return minVal;
 }

}