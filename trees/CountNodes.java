package trees;

public class CountNodes {

 public int countNodes(TreeNode rootA) {
  return count(rootA);
 }

 public int count(TreeNode rootA) {
  if (rootA == null)
   return 0;

  return count(rootA.left) + count(rootA.right) + 1;
 }

}
