package stacks;

import java.util.*;

public class BalancedParanthesis {
 Stack<Character> stack = new Stack<>();

 public int balancedParan(String str) {

  for (char i : str.toCharArray()) {
   if (i == '{' || i == '[' || i == '(')
    stack.push(i);

   else if (i == ')') {
    if (stack.peek().equals('(')) {
     stack.pop();
    } else
     return -1;
   }

   else if (i == ']') {
    if (stack.peek().equals('['))
     stack.pop();
    else
     return -1;
   }

   else if (i == '}') {
    if (stack.peek().equals('{'))
     stack.pop();
    else
     return -1;
   }
  }

  return 0;
 }

 public int solve(String A) {
  return balancedParan(A);
 }
}
