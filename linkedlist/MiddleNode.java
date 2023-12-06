package linkedlist;

/**
 * MiddleNode
 * 
 */

class ListNode {
 int val;
 ListNode next;

 ListNode(int x) {
  val = x;
 }
}

public class MiddleNode {

 // Three approaches
 // 1. Traverse the list and count the number of nodes. Then traverse again and
 // stop at the middle node.

 // 2. Traverse the list and store the nodes in an array/arraylist/hashmap. Then
 // return the middle

 // 3. Use two pointers. One pointer moves one node at a time, the other moves
 // two nodes at a time.

 public ListNode middleNode(ListNode head) {

  ListNode slow = head;
  ListNode fast = head.next;

  while (fast != null && fast.next != null) {
   slow = slow.next;
   fast = fast.next.next;
  }

  return slow;

 }

 public static void main(String[] args) {
  MiddleNode mn = new MiddleNode();

  ListNode head = new ListNode(1);
  head.next = new ListNode(2);
  head.next.next = new ListNode(3);
  head.next.next.next = new ListNode(4);
  head.next.next.next.next = new ListNode(5);
  head.next.next.next.next.next = new ListNode(6);
  head.next.next.next.next.next.next = new ListNode(7);

  ListNode middle = mn.middleNode(head);

  System.out.println(middle.val);

 }
}