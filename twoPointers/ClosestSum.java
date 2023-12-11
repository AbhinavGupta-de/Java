package twoPointers;

public class ClosestSum {

 public int[] closestSum(int[] nums1, int[] nums2, int target) {
  int start = 0;
  int end = nums2.length - 1;

  int[] ans = { 0, 0 };

  int minDiff = Integer.MAX_VALUE;

  while (start < nums1.length && end >= 0) {
   int sum = nums1[start] + nums2[end];
   int diff = Math.abs(sum - target);

   if (diff == minDiff) {

    if (nums1[start] < ans[0]) {
     ans[0] = nums1[start];
     ans[1] = nums2[end];
    } else if (nums1[start] == ans[0]) {
     if (nums2[end] < ans[1]) {
      ans[0] = nums1[start];
      ans[1] = nums2[end];
     }
    }

   }

   if (diff < minDiff) {
    minDiff = diff;
    ans[0] = nums1[start];
    ans[1] = nums2[end];
   }

   if (sum < target) {
    start++;
   } else {
    end--;
   }

  }

  return ans;
 }

}
