package trees;

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class InOrder {
 public void inOrderTriversal(TreeNode root) {

  if (root == null)
   return;

  inOrderTriversal(root.left);
  System.out.println(root.value + " ");
  inOrderTriversal(root.right);
 }

 public ArrayList<Integer> inorderTraversal(TreeNode A) {
  ArrayList<Integer> result = new ArrayList<>();
  inOrderTriversal(A, result);
  return result;
 }

 public void inOrderTriversal(TreeNode root, ArrayList<Integer> result) {

  if (root == null)
   return;

  inOrderTriversal(root.left, result);
  result.add((Integer) root.value);
  inOrderTriversal(root.right, result);
 }

 // InOrder without recurssion
 public List<Integer> inOrderTraversalIteratevely(TreeNode root) {

  if (root == null)
   return new ArrayList<Integer>();

  Stack<TreeNode> stack = new Stack<>();
  List<Integer> list = new ArrayList<>();
  TreeNode current = root;

  while (current != null || !stack.isEmpty()) {
   while (current != null) {
    stack.push(current);
    current = current.left;
   }

   current = stack.pop();
   list.add((Integer) current.value);
   current = current.right;

  }

  return list;

 }

 public List<Integer> inOrderTraversalConstantSpace(TreeNode root) {

  List<Integer> result = new ArrayList<>();
  TreeNode current = root;
  TreeNode pre = null;

  while (current != null) {
   if (current.left == null) {
    result.add((Integer) current.value);
    current = current.right;
   } else {
    pre = current.left;
    while (pre.right != null && pre.right != current) {
     pre = pre.right;
    }

    if (pre.right == null) {
     pre.right = current;
     current = current.left;
    } else {
     pre.right = null;
     result.add((Integer) current.value);
     current = current.right;
    }
   }
  }

  return result;

 }

}
