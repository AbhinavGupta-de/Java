package trees;

import java.util.ArrayList;

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

}
