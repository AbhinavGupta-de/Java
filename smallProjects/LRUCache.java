package smallProjects;

import java.util.HashMap;

import linkedlist.DoubliLinkedList;
import linkedlist.DoubliNode;

public class LRUCache {

 // First check if it is present in cache or not -> HashMap
 // Check if the space is full or not -> just a space property along with length
 // If it is present return it
 // it is not present and the space is not full just add it

 // Have to change the hashmap to store the node, key, value

 private class Item {
  DoubliNode node;
  Object val;

  public Item(DoubliNode node, Object val) {
   this.node = node;
   this.val = val;
  }
 }

 HashMap<Long, Item> map1 = new HashMap<>();
 DoubliLinkedList list = new DoubliLinkedList();
 long size;
 long len;

 public LRUCache(long size) {
  this.size = size;
  this.len = 0;
 }

 public Object get(long key) {
  if (map1.containsKey(key)) {
   Item item = map1.get(key);
   if (len != 1) {
    DoubliNode node = item.node;
    list.deleteNode(node);
    list.addAtHead(node);
    return item.val;
   } else {
    return item.val;
   }
  }

  return -1;
 }

 public void set(Long key, Object value) {

  if (map1.containsKey(key)) {
   Item item = map1.get(key);
   DoubliNode node = item.node;
   list.deleteNode(node);
   DoubliNode newNode = new DoubliNode(key, value);
   list.addAtHead(newNode);
   item.node = newNode;
   item.val = value;
   return;
  }

  if (this.len < this.size) {

   DoubliNode node = new DoubliNode(key, value);
   list.addAtHead(node);
   node = list.head;
   Item newItem = new Item(node, value);
   map1.put(key, newItem);
   len++;

  } else {
   map1.remove(list.tail.key);
   list.removeLast();
   DoubliNode newNode = new DoubliNode(key, value);
   list.addAtHead(newNode);
   newNode = list.head;
   Item newItem = new Item(newNode, value);
   map1.put(key, newItem);
  }

 }

 public static void main(String[] args) {
  LRUCache cache = new LRUCache(2);

  Object val = 6;
  cache.set(2L, val);
  System.out.println("The Value of the key: " + 2L + " is: " + cache.get(2L));// 1
  System.out.println("The Value of the key: " + 1 + " is: " + cache.get(1L));// 3

  val = 5;
  cache.set(1L, val);
  System.out.println("The Value of the key: " + 2L + " is: " + cache.get(2L));// 1

  val = 2;
  cache.set(1L, val);
  System.out.println("The Value of the key: " + 1 + " is: " + cache.get(1L));// 3

  // val = 4;
  // cache.set(4L, val);
  System.out.println("The Value of the key: " + 2 + " is: " + cache.get(2L));// 4

 }

}