package trees;

public class PostOrder {
 public void postOrderTriversal(TreeNode root) {
  if (root == null) {
   return;
  }
  postOrderTriversal(root.left);
  postOrderTriversal(root.right);
  System.out.println(root.value + " ");

 }
}
