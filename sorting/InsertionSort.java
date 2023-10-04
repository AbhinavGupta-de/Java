package sorting;

import java.util.ArrayList;

public class InsertionSort {

 public static ArrayList<Integer> insertionSort(ArrayList<Integer> nums, int k) {
  int i = nums.size() - 1;

  // Handle case when k needs to be inserted at the beginning
  if (i >= 0 && nums.get(i) > k) {
   nums.add(i + 1, nums.get(i));
   i--;
  }

  // Move elements greater than k one position to the right
  while (i >= 0 && nums.get(i) > k) {
   nums.set(i + 1, nums.get(i));
   i--;
  }

  // Insert k in the correct position
  nums.set(i + 1, k);

  return nums;
 }

 public static void main(String[] args) {
  ArrayList<Integer> nums = new ArrayList<Integer>();
  nums.add(1);
  nums.add(220);
  nums.add(3012);
  nums.add(43);
  nums.add(51);

  ArrayList<Integer> result = insertionSort(nums, 2);

  for (int i = 0; i < result.size(); i++) {
   System.out.print(result.get(i) + " ");
  }
 }
}
