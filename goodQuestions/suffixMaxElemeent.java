package goodQuestions;

// * Find the maximum element in the suffix of the array.
public class suffixMaxElemeent {
 public static int[] maxSuffixElement(int[] nums) {
  int n = nums.length;
  int[] maxSuffix = new int[n];
  maxSuffix[n - 1] = nums[n - 1];
  for (int i = n - 2; i >= 0; i--) {
   maxSuffix[i] = Math.max(maxSuffix[i + 1], nums[i]);
  }
  return maxSuffix;
 }
}
