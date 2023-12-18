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

  if (this.len < this.size) {
   // System.out.println("Size is less: ");
   if (map1.containsKey(key)) {
    Item item = map1.get(key);
    DoubliNode node = item.node;
    list.deleteNode(node);
    node.value = value;
    node = list.head;
    list.addAtHead(node);
   } else {
    // System.out.println("Putting in the stack: ");
    DoubliNode node = new DoubliNode(value);
    list.addAtHead(node);
    node = list.head;
    // System.out.println(list.tail.value);
    Item newItem = new Item(node, value);
    map1.put(key, newItem);
    len++;
   }
  } else {
   list.removeLast();
   map1.remove(key);
   DoubliNode newNode = new DoubliNode(value);
   list.addAtHead(newNode);
   newNode = list.head;
   Item newItem = new Item(newNode, value);
   map1.put(key, newItem);
  }

 }

 public static void main(String[] args) {
  LRUCache cache = new LRUCache(4);

  Object val = 45;

  cache.set(1L, val);
  System.out.println(cache.get(1L));

  val = 56;
  cache.set(5L, val);
  System.out.println(cache.get(5L));

  System.out.println(cache.get(9));

  val = 77;
  cache.set(8L, val);
  System.out.println(cache.get(8L));

  val = 66;
  cache.set(11L, val);
  System.out.println(cache.get(11L));

  val = 100;
  cache.set(19L, val);
  System.out.println(cache.get(19L));
 }

}