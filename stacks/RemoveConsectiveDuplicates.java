package stacks;

import java.util.*;

/**
 * RemoveConsectiveDuplicates
 */
public class RemoveConsectiveDuplicates {

 Stack<Integer> stack = new Stack<>();

 public void push(int val) {
  if (stack.peek() == val) {
   stack.pop();
  } else
   stack.push(val);
 }

 public void pop() {
  stack.pop();
 }

 public int peek() {
  return stack.peek();
 }

}