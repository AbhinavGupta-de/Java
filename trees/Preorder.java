package trees;

public class Preorder {

 public void preOrderTriversal(TreeNode root) {

  if (root == null)
   return;

  System.out.println(root.value + " ");
  preOrderTriversal(root.left);
  preOrderTriversal(root.right);

 }

}
