package trees;

public class TreeNode {
 public Object value;

 public TreeNode left;
 public TreeNode right;

 public TreeNode() {
  value = null;
  left = null;
  right = null;
 }

 public TreeNode(Object value) {
  this.value = value;
 }

 public TreeNode(TreeNode left, TreeNode right) {
  this.left = left;
  this.right = right;
 }

 public TreeNode(Object value, TreeNode left, TreeNode right) {
  this.value = value;
  this.left = left;
  this.right = right;
 }

}
