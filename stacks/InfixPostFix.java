package stacks;

import java.util.Stack;

public class InfixPostFix {
  public int precedence(char c) {
    if (c == '^')
      return 3;
    if (c == '*' || c == '/')
      return 2;
    if (c == '+' || c == '-')
      return 1;

    return -1;
  }

  public String infixToPostfix(String s) {

    Stack<Character> stack = new Stack<>();
    String result = "";

    for (char c : s.toCharArray()) {
      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

        result += c;

      } else if (c == '(') {

        stack.push(c);

      } else if (c == ')') {

        while (!stack.empty() && stack.peek() != '(') {

          result += stack.peek();
          stack.pop();

        }
        if (!stack.empty())
          stack.pop();

      }

      else {

        while (!stack.empty() && precedence(stack.peek()) >= precedence(c)) {
          result += stack.peek();
          stack.pop();
        }

        stack.push(c);

      }
    }

    while (!stack.empty()) {
      result += stack.peek();
      stack.pop();
    }
    return result;
  }

}