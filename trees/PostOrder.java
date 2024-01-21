package trees;

import java.util.ArrayList;

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

}
