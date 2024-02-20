package trees;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrder {
 public void postOrderTriversal(TreeNode root) {
  if (root == null) {
   return;
  }
  postOrderTriversal(root.left);
  postOrderTriversal(root.right);
  System.out.println(root.value + " ");

 }

 public ArrayList<Integer> postorderTraversal(TreeNode A) {
  ArrayList<Integer> result = new ArrayList<>();
  postOrder(A, result);
  return result;
 }

 public void postOrder(TreeNode root, ArrayList<Integer> result) {

  if (root == null)
   return;

  postOrder(root.left, result);
  postOrder(root.left, result);

  result.add((Integer) root.value);

 }

 // post order without recurrsion

 /*
  * 
  * So to solve this question what I will recomment it is... think of what you do
  * in post order traversal.
  * Go to the left, go to the right... compare if it's the value that we have in
  * the right of the stack if it is then just put the current val in the result
  * and pop it out.
  * 
  * 
  */

 public ArrayList<Integer> postOrderTraversalIteration(TreeNode root) {

  if (root == null)
   return new ArrayList<Integer>();

  ArrayList<Integer> result = new ArrayList<>();
  TreeNode current = root;
  Stack<TreeNode> stack = new Stack<>();

  int lastVal = 0;

  while (current != null || !stack.isEmpty()) {
   while (current != null) {
    stack.push(current);
    current = current.left;
   }

   if (result.size() > 0)
    lastVal = result.get(result.size() - 1);

   if (stack.peek().right != null && (Integer) stack.peek().right.value != lastVal)
    current = stack.peek().right;
   else {
    result.add((Integer) stack.pop().value);
   }
  }
  return result;
 }
}
