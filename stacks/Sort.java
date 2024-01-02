package stacks;

import java.util.*;

public class Sort {
 public static int[] sort(int[] nums) {
  Stack<Integer> stack1 = new Stack<>();
  Stack<Integer> stack2 = new Stack<>();
  int[] result = new int[nums.length];

  for (int i : nums) {
   if (stack1.isEmpty() || stack1.peek() < i) {
    stack1.push(i);
   } else {
    while (!stack1.isEmpty() && stack1.peek() > i) {
     stack2.push(stack1.pop());
    }

    stack1.push(i);

    while (!stack2.isEmpty()) {
     stack1.push(stack2.pop());
    }
   }
  }

  int index = 0;
  while (!stack1.isEmpty()) {
   index++;
   result[nums.length - index] = stack1.pop();
  }

  return result;

 }

 public static void main(String[] args) {
  int[] nums = { 4, 5, 2, 3, 0, 9 };
  System.out.println(Arrays.toString(nums));
  System.out.println(Arrays.toString(sort(nums)));
 }
}
