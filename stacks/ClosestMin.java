package stacks;

import java.util.Stack;

public class ClosestMin {

 public static int[] closestMin(int[] nums) {
  // n^2
  // for (int i = 1; i < nums.length; i++) {
  // if (nums[i - 1] < nums[i])
  // result[i] = nums[i - 1];
  // else {
  // int j = i - 1;
  // while (j >= 0) {
  // if (result[j] < nums[i]) {
  // result[i] = result[j];
  // break;
  // }
  // j--;
  // }
  // }
  // }

  // return result;

  int[] result = new int[nums.length];

  Stack<Integer> stack = new Stack<>();
  for (int i = 0; i < nums.length; i++) {
   if (stack.isEmpty()) {
    result[i] = -1;
    stack.push(nums[i]);
   } else {
    while (!stack.isEmpty()) {
     if (stack.peek() < nums[i]) {
      result[i] = stack.peek();
      stack.push(nums[i]);
      break;
     }
     stack.pop();
    }

    if (stack.isEmpty()) {
     result[i] = -1;
     stack.push(nums[i]);
    }
   }
  }
  return result;
 }

 public static void main(String[] args) {
  int[] nums = { 4, 1, 2, 5, 2, 8 };
  int[] result = closestMin(nums);
  for (int i : result) {
   System.out.print(i + " ");
  }
 }
}
