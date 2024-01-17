package trees;

public class InOrder {
 public void inOrderTriversal(TreeNode root) {

  if (root == null)
   return;

  inOrderTriversal(root.left);
  System.out.println(root.value + " ");
  inOrderTriversal(root.right);
 }
}
