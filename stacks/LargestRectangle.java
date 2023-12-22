package stacks;

import java.util.*;

public class LargestRectangle {

 public static int[] closestMinLeft(int[] nums) {
  int[] result = new int[nums.length];
  Stack<Integer> stack = new Stack<>();

  for (int i = 0; i < nums.length; i++) {
   if (stack.isEmpty()) {
    result[i] = -1;
    stack.push(i);
   } else {
    while (!stack.isEmpty()) {
     if (nums[stack.peek()] < nums[i]) {
      result[i] = stack.peek();
      stack.push(i);
      break;
     }
     stack.pop();
    }

    if (stack.isEmpty()) {
     result[i] = -1;
     stack.push(i);
    }
   }
  }
  return result;
 }

 public static int[] closestMinRight(int[] nums) {
  int[] result = new int[nums.length];
  Stack<Integer> stack = new Stack<>();

  for (int i = nums.length - 1; i >= 0; i--) {
   if (stack.isEmpty()) {
    result[i] = nums.length;
    stack.add(i);
   } else {
    while (!stack.isEmpty()) {
     if (nums[stack.peek()] < nums[i]) {
      result[i] = stack.peek();
      stack.add(i);
      break;
     }

     stack.pop();
    }

    if (stack.isEmpty()) {
     result[i] = nums.length;
     stack.add(i);
    }
   }
  }
  return result;
 }

 public static int maxArea(int[] nums) {
  int[] x = closestMinLeft(nums);
  int[] y = closestMinRight(nums);

  // for (int i : x) {
  // System.out.print(i + " ");
  // }
  // System.out.println();
  // for (int i : y) {
  // System.out.print(i + " ");
  // }
  // System.out.println();

  int ans = 0;

  for (int i = 0; i < x.length; i++) {
   ans = Math.max(((y[i] - 1) - (x[i] + 1) + 1) * nums[i], ans);
  }

  return ans;
 }

 public static void main(String[] args) {
  int[] nums = { 2, 9, 8, 7, 3, 5, 10, 2 };
  System.out.println(maxArea(nums));
 }
}
