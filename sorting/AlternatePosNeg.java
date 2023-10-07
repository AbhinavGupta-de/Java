package sorting;

import java.util.Arrays;

/*
 * Given an array of integers A, arrange them in an alternate fashion such that every non-negative number is followed by negative and vice-versa, starting from a negative number, maintaining the order of appearance. The number of non-negative and negative numbers need not be equal.

If there are more non-negative numbers, they appear at the end of the array. If there are more negative numbers, they also appear at the array's end.

Note: Try solving with O(1) extra space.
 * 
 */
public class AlternatePosNeg {

 public static int[] sort(int[] nums) {
  return nums;
 }

 public static void main(String[] args) {
  int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
  System.out.println(Arrays.toString(sort(arr)));
 }

}
