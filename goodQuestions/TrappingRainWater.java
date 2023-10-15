package goodQuestions;

public class TrappingRainWater {

 public static int rainWaterTrapped(int[] nums) {
  int n = nums.length;
  // int[] left = new int[n];
  // int[] right = new int[n];
  int water = 0;

  // left[0] = nums[0];
  // for (int i = 1; i < n; i++) {
  // left[i] = Math.max(left[i - 1], nums[i]);
  // }

  // right[n - 1] = nums[n - 1];
  // for (int i = n - 2; i >= 0; i--) {
  // right[i] = Math.max(right[i + 1], nums[i]);
  // }

  // for (int i = 0; i < n; i++) {
  // water += Math.min(left[i], right[i]) - nums[i];
  // }

  int leftMax = 0;
  int leftMaxIndex = 0;
  int rightMax = 0;
  for (int i = 0; i < n; i++) {
   if (nums[i] > leftMax) {
    leftMax = nums[i];
    leftMaxIndex = i;
   } else {
    water += leftMax - nums[i];
   }
  }

  for (int i = n - 1; i > leftMaxIndex; i--) {
   if (nums[i] > rightMax) {
    rightMax = nums[i];
   } else {
    water += rightMax - nums[i];
   }
  }

  for (int i = leftMaxIndex; i < n; i++) {
   water -= leftMax - nums[i];
  }

  return water;
 }

 public static void main(String[] args) {
  int[] nums = { 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
  System.out.println(rainWaterTrapped(nums));
  // System.out.println(rainWaterTrapped(nums));
  // System.out.println(rain
 }
}
