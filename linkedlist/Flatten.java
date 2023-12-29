package linkedlist;

public class Flatten {

 private class ListNode {
  int val;
  ListNode right;
  ListNode down;

  ListNode(int x) {
   val = x;
  }
 }

 ListNode flatten(ListNode head) {
  ListNode current = toFlat(head);
  while (current.right != null) {
   current = current.right;
  }

  return current;
 }

 ListNode toFlat(ListNode head) {
  if (head.right == null) {
   return head;
  }

  ListNode last = getLast(toFlat(head.right));
  last.down = head;
  return head;
 }

 ListNode getLast(ListNode head) {
  ListNode current = head;
  while (current.down != null) {
   current = current.down;
  }

  return current;
 }

 ListNode sort(ListNode head) {
  if (head == null || head.down == null) {
   return head;
  }

  ListNode mid = getMid(head);
  ListNode right = sort(mid.down);
  mid.down = null;
  ListNode left = sort(head);

  return merge(left, right);
 }

 ListNode getMid(ListNode head) {
  ListNode slow = head;
  ListNode fast = head.down;
  while (fast != null && fast.down != null) {
   slow = slow.down;
   fast = fast.down.down;
  }

  return slow;
 }

 ListNode merge(ListNode l1, ListNode l2) {
  ListNode result = new ListNode(0);
  ListNode current = result;

  ListNode current1 = l1;
  ListNode current2 = l2;

  while (current1 != null && current2 != null) {
   if (current1.val > current2.val) {
    current.down = current2;
    current2 = current2.down;
   } else {
    current.down = current1;
    current1 = current1.down;
   }
   current = current.down;
  }

  while (current1 != null) {
   current.down = current1;
   current1 = current1.down;
   current = current.down;
  }

  while (current2 != null) {
   current.down = current2;
   current2 = current2.down;
   current = current.down;
  }

  return result.down;
 }

}
