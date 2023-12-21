package stacks;

import java.util.*;

public class BalancedParanthesis {
 Stack<Character> stack = new Stack<>();

 public int balancedParan(String str) {

  for (char i : str.toCharArray()) {
   if (i == '(' || i == '{' || i == '[') {
    stack.push(i);
   } else {
    if (!stack.isEmpty() && (i == stack.peek() + 2 || i == stack.peek() + 1))
     stack.pop();
    else
     return 0;
   }
  }

  if (stack.isEmpty())
   return 1;

  return 0;
 }

 public int solve(String A) {
  return balancedParan(A);
 }
}
