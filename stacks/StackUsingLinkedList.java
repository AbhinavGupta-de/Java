package stacks;

public class StackUsingLinkedList {
 private class Node {
  int val;
  Node next;
  Node prev;

  Node(int val) {
   this.val = val;
  }
 }

 Node head;
 Node mid = head;
 int size;
 int top;

 public StackUsingLinkedList(int size) {
  this.size = size;
 }

 public int pop() {
  if (!isEmpty()) {
   head = head.next;
   head.prev = null;
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
   this.head.prev = newNode;
   this.head = newNode;
   top++;
   if(top % 2 == 1) mid = mid.next;
  } else {
   // could throw an exception but don't wanna
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

 public int getMid(){
  return mid.val;
 }

 public void removeMid(){
  if(mid.prev == null) {
   this.head = mid.next;
  }
  mid.prev.next = mid.next;
 }

}
