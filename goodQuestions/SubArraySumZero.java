package goodQuestions;

import java.util.HashSet;

public class SubArraySumZero {
 public static int subArraySumZero(int[] nums) {

  long[] prefixSum = new long[nums.length];
  prefixSum[0] = nums[0];
  for (int i = 1; i < nums.length; i++) {
   prefixSum[i] = prefixSum[i - 1] + nums[i];
  }

  HashSet<Long> set = new HashSet<>();

  for (int i = 0; i < nums.length; i++) {
   if (set.contains(prefixSum[i]) || prefixSum[i] == 0) {
    return 1;
   }
   set.add((long) prefixSum[i]);
  }

  return 0;
 }
}
