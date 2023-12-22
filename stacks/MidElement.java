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
  public Node tail;
  public Node mid;
  public int size;

  public Stack() {
   this.size = 0;
   head = null;
   mid = null;
  }

  public void push(int value) {
   Node newNode = new Node(value);
   if (this.head == null) {
    this.head = newNode;
    this.tail = newNode;
    this.mid = newNode;
   }
  }

  public int pop() {

  }

  public int getMid() {

  }

  public void deleteMid() {

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
