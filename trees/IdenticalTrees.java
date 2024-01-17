package trees;

public class IdenticalTrees {

 public boolean checker(TreeNode rootA, TreeNode rootB) {

  if (rootA == null || rootB == null) {
   if (rootA == null && rootB == null)
    return true;
   return false;
  }

  if (rootA.value != rootB.value)
   return false;

  if (!checker(rootA.left, rootB.left))
   return false;
  if (!checker(rootA.right, rootB.right))
   return false;

  return true;

 }

 public boolean areIdentical(TreeNode rootA, TreeNode rootB) {

  return checker(rootA, rootB);

 }

}
