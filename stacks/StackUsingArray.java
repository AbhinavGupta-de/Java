package stacks;

public class StackUsingArray {

 int size;
 int[] nums;
 int top;

 public StackUsingArray(int capacity) {
  nums = new int[capacity];
 }

 public int pop() {
  if (!isEmpty())
   return nums[--top];

  return -1;
 }

 public void push(int val) {
  nums[top++] = val;
 }

 public boolean isEmpty() {
  if (top == 0)
   return true;

  return false;
 }

 public int size() {
  return top;
 }

 public int top() {
  if (!isEmpty())
   return nums[top - 1];

  return -1;
 }

}
