package goodQuestions;

// * Find the maximum element till the ith index and store it in the ith index of the array.
public class maxTillI {
 public int[] maxEleTillI(int[] nums) {
  int n = nums.length;
  int[] maxTillI = new int[n];
  maxTillI[0] = nums[0];
  for (int i = 1; i < n; i++) {
   maxTillI[i] = Math.max(maxTillI[i - 1], nums[i]);
  }
  return maxTillI;
 }

}
