package goodQuestions;

import java.util.HashMap;

public class SubArraySumZeroLength {
 public int maxLength(int[] nums) {
  HashMap<Long, Long> map = new HashMap<>();
  long n = nums.length;

  long sum = 0;
  long maxLen = 0;

  for (int i = 0; i < n; i++) {
   sum += nums[i];

   if (sum == 0) {
    maxLen = i + 1;
   }

   if (map.containsKey(sum)) {
    maxLen = Math.max(maxLen, i - map.get(sum));
   } else {
    map.put(sum, (long) i);
   }
  }
  return (int) maxLen;
 }
}
