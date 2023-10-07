package sorting;

import java.util.Arrays;

public class MaxMinMagic {

 public static int[] sort(int[] nums) {
  Arrays.sort(nums);
  // int[] result = new int[2];
  // for (int i = 0; i < nums.length / 2; i++) {
  // long temp = (result[0] + nums[nums.length - 1 - i] - nums[i]) % (long)
  // (Math.pow(10, 9) + 7);
  // result[0] = (int) temp;
  // }
  // for (int i = 0; i < nums.length; i += 2) {
  // long temp = (result[1] + nums[i + 1] - nums[i]) % (long) (Math.pow(10, 9) +
  // 7);
  // result[1] = (int) temp;
  // }
  // return result;

  long min = 0;
  long max = 0;

  for (int i = 0; i < nums.length; i += 2) {
   min = (min + nums[nums.length - 1 - i] - nums[i]);
   min %= (long) (Math.pow(10, 9) + 7);
  }

  for (int i = 0; i < nums.length / 2; i++) {
   max = (max + nums[i + 1] - nums[i]) % (long) (Math.pow(10, 9) + 7);
  }

  int[] result = new int[2];
  result[0] = (int) min;
  result[1] = (int) max;

  return nums;
 }

}
