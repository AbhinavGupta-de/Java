package queues;

import java.util.*;

public class ReversingElementsOfQueue {
 public ArrayList<Integer> reverseNElements(ArrayList<Integer> nums, int N) {
  Stack<Integer> stack = new Stack<>();
  int index = 0;
  while (index < N) {
   stack.push(nums.get(index++));
  }
  index = 0;
  while (!stack.isEmpty()) {
   nums.remove(index);
   nums.add(index++, stack.pop());
  }

  return nums;
 }

 public int[] reverseNElements(int[] nums, int N) {
  Stack<Integer> stack = new Stack<>();
  int index = 0;
  while (index < N) {
   stack.push(nums[index++]);
  }

  index = 0;
  while (!stack.isEmpty()) {
   nums[index++] = stack.pop();
  }

  return nums;
 }
}
