package linkedlist;

public class LongestPalindromeList {
 public int longPalindrome(ListNode head) {
  int ans = 1;

  ListNode rev = head;
  head = head.next;
  rev.next = null;

  while (head != null) {
   ListNode headCurrent = head;
   ListNode revCurrent = rev;
   int count = 0;

   while (revCurrent != null && headCurrent != null && revCurrent.val == headCurrent.val) {
    count += 2;
    revCurrent = revCurrent.next;
    headCurrent = headCurrent.next;
   }

   ans = Math.max(count, ans);

   count = 1;
   headCurrent = head.next;
   revCurrent = rev;

   while (revCurrent != null && headCurrent != null && revCurrent.val == headCurrent.val) {
    count += 2;
    headCurrent = headCurrent.next;
    revCurrent = revCurrent.next;
   }

   ans = Math.max(ans, count);

   ListNode temp = head;
   head = head.next;
   temp.next = rev;
   rev = temp;

  }

  return ans;
 }

 public static void main(String[] args) {
  ListNode node = new ListNode(2);
  ListNode newNode = new ListNode(3);
  ListNode newNode2 = new ListNode(3);
  ListNode newNode3 = new ListNode(3);

  node.next = newNode;
  newNode.next = newNode2;
  newNode2.next = newNode3;

  LongestPalindromeList lpl = new LongestPalindromeList();
  System.out.println(lpl.longPalindrome(node));
 }

}
