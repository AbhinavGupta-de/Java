package Searching;

public class MedianTwoSortedArray {
 public int median(int[] nums1, int[] nums2) {
  int n = nums1.length;
  int m = nums2.length;

  if (n > m) {
   return median(nums2, nums1);
  }

  int start = 0;
  int end = n - 1;

  while (start <= end) {
   int partitionA = start + (end - start) / 2;
   int partitionB = (n + m + 1) / 2 - partitionA;

   int maxLeftA = partitionA == 0 ? Integer.MIN_VALUE : nums1[partitionA - 1];
   int minRightA = partitionA == n ? Integer.MAX_VALUE : nums1[partitionA];

   int maxLeftB = partitionB == 0 ? Integer.MIN_VALUE : nums2[partitionB - 1];
   int minRightB = partitionB == m ? Integer.MAX_VALUE : nums2[partitionB];

   if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
    if ((n + m) % 2 == 0) {
     return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2;
    } else {
     return Math.max(maxLeftA, maxLeftB);
    }
   } else if (maxLeftA > minRightB) {
    end = partitionA - 1;
   } else {
    start = partitionA + 1;
   }
  }

  return -1;
 }
}
