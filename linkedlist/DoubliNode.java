package linkedlist;

public class DoubliNode {
 public Object value;
 public Object key;
 DoubliNode prev;
 DoubliNode next;

 public DoubliNode(Object key, Object val) {
  this.key = key;
  this.value = val;
  this.prev = null;
  this.next = null;
 }
}
