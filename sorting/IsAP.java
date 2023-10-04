package sorting;

import java.util.Arrays;

public class IsAP {
 public static int isAp(int[] nums) {
  Arrays.sort(nums);

  int diff = nums[1] - nums[0];
  for (int i = 2; i < nums.length; i++) {
   if (nums[i] - nums[i - 1] != diff) {
    return 0;
   }
  }

  return 1;
 }
}
