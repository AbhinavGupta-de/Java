package linkedlist;

/**
 * ReverseAdjacent
 */
public class ReverseAdjacent {

 public ListNode reverse(ListNode head) {

  if (!check(head, 2))
   return head;

  ListNode prev = null;
  ListNode curr = head;
  ListNode next = null;
  int count = 2;

  while (count > 0 && curr != null) {
   next = curr.next;
   curr.next = prev;
   prev = curr;
   curr = next;
   count--;
  }

  if (next != null) {
   head.next = reverse(next);
  }

  return prev;

 }

 public boolean check(ListNode head, int k) {
  ListNode temp = head;
  int count = 0;

  while (temp != null) {
   temp = temp.next;
   count++;
  }

  return count == k;

 }

}