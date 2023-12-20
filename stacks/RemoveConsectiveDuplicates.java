package stacks;

import java.util.*;

/**
 * RemoveConsectiveDuplicates
 */
public class RemoveConsectiveDuplicates {

 Stack<Character> stack = new Stack<>();

 public void push(char val) {
  if (!stack.empty()) {
   if (stack.peek() == val) {
    stack.pop();
   } else
    stack.push(val);
  } else {
   stack.push(val);
  }
 }

 public void pop() {
  stack.pop();
 }

 public char peek() {
  return stack.peek();
 }

 public String toString() {
  String result = "";
  for (Object i : stack.toArray()) {
   result += i;
  }

  return result;
 }

 public String removeDuplicates(String s) {
  for (char i : s.toCharArray()) {
   push(i);
  }

  return toString();
 }
}