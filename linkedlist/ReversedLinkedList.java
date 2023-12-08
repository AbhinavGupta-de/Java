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
  ListNode dummy = new ListNode(0); // Create a dummy node to simplify code
  dummy.next = head;
  ListNode currentNode = dummy;
  int index = 1;

  // Move to the node just before the start index
  while (index < start) {
   currentNode = currentNode.next;
   index++;
  }

  // Reverse the sublist from start to end
  currentNode.next = reverse(currentNode.next, end - start + 1);

  return dummy.next; // Return the updated list
 }

 public ListNode reverse(ListNode head, int k) {
  ListNode prev = null;
  ListNode curr = head;

  // Reverse the sublist with k nodes
  for (int i = 0; i < k; i++) {
   ListNode nextNode = curr.next;
   curr.next = prev;
   prev = curr;
   curr = nextNode;
  }

  // Connect the reversed sublist back to the original list
  head.next = curr;

  return prev; // Return the new head of the reversed sublist
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