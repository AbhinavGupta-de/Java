package linkedlist;

public class SortedList {

 public int sorted(ListNode head) {

  ListNode prev = null;
  ListNode current = head;

  while (current != null) {

   if (prev != null && current != null) {
    if (prev.val > current.val)
     return 0;
   }

   prev = current;
   current = current.next;

  }

  return 1;

 }

}
