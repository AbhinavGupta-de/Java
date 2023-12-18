package linkedlist;

public class DoubliLinkedList {
 public DoubliNode head;
 public DoubliNode tail;
 long size;

 public DoubliLinkedList() {
  this.head = null;
  this.tail = null;
  this.size = 0;
 }

 public void addAtHead(DoubliNode node) {
  if (this.head == null) {
   this.head = node;
   this.tail = node;
   size++;
   return;
  }

  if (this.tail == null)
   this.tail = this.head;
  node.next = head;
  node.prev = null;
  head.prev = node;
  this.head = node;
  size++;
 }

 public void deleteNode(DoubliNode node) {
  if (node.prev == null) {
   node.next.prev = null;
   this.head = node.next;
  } else {
   node.prev.next = node.next;
  }
  removeLast();
 }

 public void removeLast() {
  this.tail = tail.prev;

 }
}
