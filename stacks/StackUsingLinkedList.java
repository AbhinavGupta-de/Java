package stacks;

public class StackUsingLinkedList {
 private class Node {
  int val;
  Node next;

  Node(int val) {
   this.val = val;
  }
 }

 Node head;
 int size;
 int top;

 public StackUsingLinkedList(int size) {
  this.size = size;
 }

 public int pop() {
  if (!isEmpty()) {
   head = head.next;
   top--;
   if (!isEmpty()) {
    return head.val;
   }
  }
  return -1;
 }

 public void push(int val) {
  if (top < size) {
   Node newNode = new Node(val);
   newNode.next = this.head;
   this.head = newNode;
   top++;
  } else {
   // Handle stack overflow, e.g., throw an exception
  }
 }

 public boolean isEmpty() {
  return top == 0;
 }

 public int size() {
  return top;
 }

 public int top() {
  if (!isEmpty()) {
   return head.val;
  }

  return -1;
 }

}
