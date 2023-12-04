package linkedlist;

public class LinkedList {
 public Node head;
 public Node tail;
 public int size;

 public LinkedList() {
  this.head = null;
  this.tail = null;
  this.size = 0;
 }

 public boolean isEmpty() {
  return this.size == 0;
 }

 public void addFirst(Object data) {
  Node newNode = new Node(data);
  if (isEmpty()) {
   this.head = newNode;
   this.tail = newNode;
  } else {
   newNode.next = this.head;
   this.head = newNode;
  }
  this.size++;
 }

 public void addLast(Object data) {
  Node newNode = new Node(data);
  if (isEmpty()) {
   this.head = newNode;
   this.tail = newNode;
  } else {
   this.tail.next = newNode;
   this.tail = newNode;
  }
  this.size++;
 }

 public void add(Object data, int index) {
  // Check if the index is valid
  if (index < 0 || index > this.size) {
   throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
  }
  // Check size of the list
  if (isEmpty() || index == 0) {
   addFirst(data);
  } else if (index == this.size) {
   addLast(data);
  } else {
   Node newNode = new Node(data);
   Node current = this.head;
   for (int i = 0; i < index - 1; i++) {
    current = current.next;
   }
   newNode.next = current.next;
   current.next = newNode;
   this.size++;
  }
 }

 public Object removeFirst() {
  if (isEmpty()) {
   throw new IndexOutOfBoundsException("Index: 0, Size: " + this.size);
  }
  Node removedNode = this.head;
  this.head = this.head.next;
  removedNode.next = null;
  this.size--;
  return removedNode.data;
 }

 public Object removeLast() {
  if (isEmpty()) {
   throw new IndexOutOfBoundsException("Index: 0, Size: " + this.size);
  }
  Node removedNode = this.tail;
  Node current = this.head;
  for (int i = 0; i < this.size - 2; i++) {
   current = current.next;
  }
  this.tail = current;
  this.tail.next = null;
  this.size--;
  return removedNode.data;
 }

 public Object remove(int index) {
  if (index < 0 || index >= this.size) {
   throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
  }

  if (index == 0) {
   return removeFirst();
  } else if (index == this.size - 1) {
   return removeLast();
  } else {
   Node current = this.head;
   for (int i = 0; i < index - 1; i++) {
    current = current.next;
   }
   Node removedNode = current.next;
   current.next = removedNode.next;
   removedNode.next = null;
   this.size--;
   return removedNode.data;
  }
 }

 public Object get(int index) {
  if (index < 0 || index >= this.size) {
   throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
  }
  Node current = this.head;
  for (int i = 0; i < index; i++) {
   current = current.next;
  }
  return current.data;
 }

 public void set(Object data, int index) {
  if (index < 0 || index >= this.size) {
   throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
  }
  Node current = this.head;
  for (int i = 0; i < index; i++) {
   current = current.next;
  }
  current.data = data;
 }

 // Assuming that the data is unique
 public int indexOf(Object data) {
  Node current = this.head;
  for (int i = 0; i < this.size; i++) {
   if (current.data.equals(data)) {
    return i;
   }
   current = current.next;
  }
  return -1;
 }

 public boolean contains(Object data) {
  return indexOf(data) != -1;
 }

 public void clear() {
  // This is not necessary
  // Node current = this.head;
  // while (current != null) {
  // Node next = current.next;
  // current.next = null;
  // current.data = null;
  // current = next;
  // }
  this.head = null;
  this.tail = null;
  this.size = 0;
 }

 public void print() {
  Node current = this.head;
  while (current != null) {
   System.out.print(current.data + " ");
   current = current.next;
  }
  System.out.println();
 }

 public int getSize() {
  return this.size;
 }

 public static void main(String[] args) {
  LinkedList list = new LinkedList();
  list.addFirst(1);

  list.print();
 }

}
