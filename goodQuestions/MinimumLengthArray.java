package goodQuestions;

import java.util.*;

// * Have to find the minimum length of the subarray which contains both the largest and the smallest element of the array.
public class MinimumLengthArray {

 public int lengthOfSubArray(int[] nums) {

  // * n^2 solution
  // ArrayList<Integer> minList = new ArrayList<>();
  // ArrayList<Integer> maxList = new ArrayList<>();

  // int n = nums.length;
  // int[] B = new int[n];

  // for (int i = 0; i < n; i++)
  // B[i] = nums[i];

  // Arrays.sort(B);
  // int max = B[n - 1];
  // int min = B[0];

  // for (int i = 0; i < n; i++) {
  // if (nums[i] == min)
  // minList.add(i);
  // if (nums[i] == max)
  // maxList.add(i);
  // }

  // ArrayList<Integer> minMax = new ArrayList<>();

  // for (int i = 0; i < minList.size(); i++) {
  // for (int j = 0; j < maxList.size(); j++) {
  // minMax.add(Math.abs(minList.get(i) - maxList.get(j)));
  // }
  // }

  // Collections.sort(minMax);
  // return minMax.get(0) + 1;

  // * n solution

  int n = nums.length;
  int diff = Integer.MAX_VALUE;

  int max = Integer.MIN_VALUE;
  int min = Integer.MAX_VALUE;

  for (int i = 0; i < n; i++) {
   max = Math.max(max, nums[i]);
   min = Math.min(min, nums[i]);
  }

  int minLength = n;
  int minIndex = -1;
  int maxIndex = -1;
  for (int i = 0; i < n; i++) {

   if (nums[i] == min) {
    minIndex = i;
   }

   if (nums[i] == max) {
    maxIndex = i;
   }

   if (minIndex != -1 && maxIndex != -1) {
    diff = Math.min(diff, Math.abs(minIndex - maxIndex) + 1);
   }

   if (diff < minLength) {
    minLength = diff;
   }

  }

  return minLength;

 }

 public static void main(String[] args) {
  int[] nums = { 814, 761, 697, 483, 981 };
  MinimumLengthArray m = new MinimumLengthArray();
  System.out.println(m.lengthOfSubArray(nums));
 }

}
