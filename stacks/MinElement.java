package stacks;

import java.util.*;

public class MinElement {

 Stack<Object> stack = new Stack<>();
 int min = Integer.MAX_VALUE;
 Stack<Object> minStack = new Stack<>();

 public void push(int val) {
  if (min > val)
   min = val;

  stack.push(val);
  minStack.push(min);
 }

 public void pop() {
  stack.pop();
  minStack.pop();
 }

 public int getMin() {
  return (int) minStack.peek();
 }

}
