package linkedlist;

/**
 * ReversedLinkedList
 */

class ListNode {
 int val;
 ListNode next;

 ListNode(int x) {
  val = x;
 }
}

public class ReversedLinkedList {

 public ListNode reverseList(ListNode head) {
  ListNode currentNode = head;
  ListNode previousNode = null;
  ListNode nextNode = null;

  while (currentNode != null) {
   nextNode = currentNode.next;
   currentNode.next = previousNode;
   previousNode = currentNode;
   currentNode = nextNode;
  }

  return previousNode;
 }

 public ListNode reverseList(ListNode head, int start, int end) {
  // 1 based index of the linked list is given
  ListNode currentNode = head;

  while (currentNode != null) {
   if (currentNode.val == start) {
    currentNode = reverse(currentNode, end);
    break;
   }
   currentNode = currentNode.next;
  }

  return currentNode;
 }

 public ListNode reverse(ListNode head, int k) {
  ListNode currentNode = head;
  ListNode previousNode = null;
  ListNode nextNode = null;

  while (currentNode != null) {

   if (currentNode.val == k) {
    currentNode.next = previousNode;
    previousNode = currentNode;
    currentNode = nextNode;
    previousNode.next = currentNode;
    break;
   }

   nextNode = currentNode.next;
   currentNode.next = previousNode;
   previousNode = currentNode;
   currentNode = nextNode;
  }

  return previousNode;
 }

 public ListNode reverseKGroup(ListNode head, int k) {
  ListNode currentNode = head;
  ListNode previousNode = null;
  ListNode nextNode = null;

  if (!Check(head, k)) {
   return head;
  }

  int index = 0;

  while (currentNode != null && index < k) {
   nextNode = currentNode.next;
   currentNode.next = previousNode;
   previousNode = currentNode;
   currentNode = nextNode;
   index++;
  }

  if (nextNode != null) {
   head.next = reverseKGroup(nextNode, k);
  }

  return previousNode;

 }

 public boolean Check(ListNode node, int k) {
  ListNode currentNode = node;
  int index = 0;
  while (currentNode != null) {
   index++;
   currentNode = currentNode.next;
  }

  return index >= k;
 }

}