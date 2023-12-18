package linkedlist;

public class DoubliLinkedList {
 public DoubliNode head;
 public DoubliNode tail;
 public long size;

 public DoubliLinkedList() {
  this.head = null;
  this.tail = null;
  this.size = 0;
 }

 public void addAtHead(DoubliNode node) {
  if (this.head == null) {
   this.head = node;
   this.tail = node;
  } else {
   node.next = head;
   head.prev = node;
   this.head = node;
  }
  size++;
 }

 public void deleteNode(DoubliNode node) {
  if (node == null)
   return;

  if (node == this.head) {
   this.head = node.next;
   if (this.head != null) {
    this.head.prev = null;
   }
  } else if (node == this.tail) {
   this.tail = node.prev;
  } else {
   node.prev.next = node.next;
   if (node.next != null) {
    node.next.prev = node.prev;
   }
  }

  size--;
 }

 public void removeLast() {
  if (this.tail != null) {
   this.tail = this.tail.prev;
   if (this.tail != null)
    this.tail.next = null;
   else
    this.head = null;
   size--;
  }
 }
}
