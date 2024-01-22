package trees;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {

 public List<List<Integer>> levelOrder(TreeNode root) {

  List<List<Integer>> result = new ArrayList<>();
  levelOrderTraversal(root, 0, result);
  return result;
 }

 public void levelOrderTraversal(TreeNode root, int level, List<List<Integer>> result) {

  if (root == null)
   return;

  if (result.size() == level) {
   List<Integer> list = new ArrayList<>();
   list.add((Integer) root.value);
   result.add(list);
  } else {
   result.get(level).add((Integer) root.value);
  }

  levelOrderTraversal(root.left, level + 1, result);
  levelOrderTraversal(root.right, level + 1, result);

 }

}
