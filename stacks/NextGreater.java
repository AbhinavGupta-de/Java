package stacks;

import java.util.*;

public class NextGreater {

 public static int[] nextGreater(int[] nums) {

  int[] result = new int[nums.length];

  Stack<Integer> stack = new Stack<>();

  for (int i = nums.length - 1; i >= 0; i--) {
   if (stack.isEmpty()) {
    result[i] = -1;
    stack.push(nums[i]);
   } else {
    while (!stack.isEmpty()) {
     if (stack.peek() > nums[i]) {
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
  int[] nums = { 34, 35, 27, 42, 5, 28, 39, 20, 28 };
  int[] result = nextGreater(nums);
  for (int i : result) {
   System.out.print(i + " ");
  }
 }
}
