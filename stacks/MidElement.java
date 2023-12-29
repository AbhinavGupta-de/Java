package stacks;

public class MidElement {

 class Stack {
  private class Node {
   public int value;
   public Node next;
   public Node prev;

   public Node() {
   }

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
    this.size++;
   } else {
    this.tail.next = newNode;
    newNode.prev = this.tail;
    this.tail = this.tail.next;
    this.size++;

    if (this.size % 2 == 0) {
     this.mid = this.mid.next;
    }
   }
  }

  public int getMid() {
   return this.mid.value;
  }

  public int pop() {
   if (this.tail.prev != null) {
    this.tail = this.tail.prev;
    int val = this.tail.next.value;
    this.tail.next = null;
    this.size--;

    if (this.size % 2 == 1 && this.size != 0) {
     this.mid = this.mid.prev;
    }

    return val;
   } else {
    int val = this.tail.value;
    this.tail = null; // Corrected: set tail to null when size becomes 0
    this.head = null; // Corrected: set head to null when size becomes 0
    this.mid = null; // Corrected: set mid to null when size becomes 0
    this.size--;
    return val;
   }
  }

  public void deleteMid() {
   if (this.mid.prev != null || this.mid.next != null) {
    if (this.size % 2 == 0) {
     this.mid.prev.next = this.mid.next;
     this.mid.next.prev = this.mid.prev;
     this.mid = this.mid.prev;
    } else {
     this.mid.prev.next = this.mid.next;
     this.mid.next.prev = this.mid.prev;
    }
    this.size--;
   } else {
    if (this.mid.prev == null) {
     this.head = null; // Corrected: set head to null when mid is the only node
     this.tail = null; // Corrected: set tail to null when mid is the only node
     this.mid = null; // Corrected: set mid to null when mid is the only node
    } else {
     this.tail = this.tail.prev;
     this.mid = this.mid.prev;
    }

    this.size--;
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
