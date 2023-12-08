package linkedlist;

class ListNode {
 public int val;
 public ListNode next;

 public ListNode(int val) {
  this.val = val;
  this.next = null;
 }
}

public class MergeSortLinkedList {

 public ListNode sort(ListNode head) {
  if (head == null || head.next == null) {
   return head;
  }

  ListNode mid = getMid(head);
  ListNode left = sort(head);
  ListNode right = sort(mid);

  return merge(left, right);
 }

 public ListNode getMid(ListNode head) {
  ListNode midPrev = null;
  while (head != null && head.next != null) {
   midPrev = (midPrev == null) ? head : midPrev.next;
   head = head.next.next;
  }

  ListNode mid = midPrev.next;
  midPrev.next = null;

  return mid;
 }

 public ListNode merge(ListNode left, ListNode right) {
  if (left == null || right == null) {
   if (left == null && right != null) {
    return right;
   } else if (right == null && left != null) {
    return left;
   } else {
    return null;
   }
  }

  ListNode result = null;
  if (left.val > right.val) {
   result = right;
   right = right.next;
  } else {
   result = left;
   left = left.next;
  }

  result.next = merge(left, right);

  return result;

 }

 public static void main(String[] args) {
  ListNode head = new ListNode(5);
  head.next = new ListNode(4);
  head.next.next = new ListNode(3);
  head.next.next.next = new ListNode(2);
  head.next.next.next.next = new ListNode(1);

  MergeSortLinkedList m = new MergeSortLinkedList();
  ListNode result = m.sort(head);

  while (result != null) {
   System.out.print(result.val + " ");
   result = result.next;
  }
  System.out.println();
  System.out.println("Done");
 }

}
