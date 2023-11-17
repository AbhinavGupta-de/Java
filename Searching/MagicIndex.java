package Searching;

/**
 * MagicNext
 */
public class MagicIndex {

 // Given a sorted array of distinct element. Find any magic index.
 // A magic index is an index such that A[i] = i

 public int magicIndex(int[] nums) {
  int start = 0;
  int end = nums.length - 1;

  while (start <= end) {
   int mid = start + (end - start) / 2;

   if (nums[mid] == mid) {
    return mid;
   } else if (nums[mid] < mid) {
    start = mid + 1;
   } else {
    end = mid - 1;
   }
  }

  return -1;
 }

 public static void main(String[] args) {
  MagicIndex magicIndex = new MagicIndex();
  int[] nums = { -1, 0, 1, 2, 4, 10 };
  System.out.println(magicIndex.magicIndex(nums));
 }
}