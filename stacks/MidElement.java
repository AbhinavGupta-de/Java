package stacks;

public class MidElement {

 class Stack {
  private class Node {
   public int value;
   public Node next;
   public Node prev;

   public Node(int value) {
    this.value = value;
    next = null;
    prev = null;
   }
  }

  public Node head;
  public Node mid;
  public int size;

  public Stack() {
   this.size = 0;
   head = null;
   mid = null;
  }

  public void push(int value) {
   Node newNode = new Node(value);
   newNode.next = this.head;
   if (this.head != null)
    this.head.prev = newNode;
   this.head = newNode;
   this.size++;

   // Adjust the mid pointer when the size is 1 or even
   if (size == 1) {
    this.mid = this.head;
   } else if (size % 2 == 0) {
    this.mid = this.mid.prev;
   }
  }

  public int pop() {
   int val = this.head.value;

   if (this.head.next != null)
    this.head.next.prev = null;

   this.head = this.head.next;
   size--;

   // Adjust the mid pointer when the size is odd
   if (size % 2 == 1) {
    this.mid = this.mid.next;
   }

   return val;
  }

  public int getMid() {
   if (this.mid == null)
    return -1;
   return this.mid.value;
  }

  public void deleteMid() {
   if (this.mid == null)
    return;

   // If mid is the head, update both head and mid
   if (this.mid.prev == null) {
    this.mid = this.mid.next;
    this.head = this.head.next;
    if (this.head != null) {
     this.head.prev = null;
    }
   } else {
    // Update pointers when mid is not the head
    this.mid.prev.next = this.mid.next;
    this.mid = this.mid.next;
   }
  }
 }

 Stack stack = new Stack();

 void push(int x) {
  stack.push(x);
 }

 int pop() {
  return stack.pop();
 }

 int findMiddle() {
  return stack.getMid();
 }

 void deleteMiddle() {
  stack.deleteMid();
 }

}
