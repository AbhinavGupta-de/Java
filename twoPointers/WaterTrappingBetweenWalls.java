package TwoPointers;

public class WaterTrappingBetweenWalls {

 public int trap(int[] heights) {

  int left = 0;
  int right = heights.length - 1;

  int ans = 0;

  while (left < right) {
   int sol = (right - left) * Math.min(heights[left], heights[right]);
   ans = Math.max(ans, sol);

   if (heights[left] < heights[right]) {
    left++;
   } else {
    right--;
   }
  }

  return ans;

 }

 public static void main(String[] args) {
  int[] heights = { 3, 7, 4, 5, 2 };
  WaterTrappingBetweenWalls obj = new WaterTrappingBetweenWalls();
  System.out.println(obj.trap(heights));

 }

}
