package trees;

import java.util.ArrayList;

public class Preorder {

 public void preOrderTriversal(TreeNode root) {

  if (root == null)
   return;

  System.out.println(root.value + " ");
  preOrderTriversal(root.left);
  preOrderTriversal(root.right);

 }

 public ArrayList<Integer> preOrderTraversal(TreeNode A) {
  ArrayList<Integer> result = new ArrayList<>();
  preOrder(A, result);
  return result;
 }

 public void preOrder(TreeNode root, ArrayList<Integer> result) {

  if (root == null)
   return;

  result.add((Integer) root.value);

  preOrder(root.left, result);
  preOrder(root.right, result);
 }

}
