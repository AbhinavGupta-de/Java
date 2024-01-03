package queues;

import java.util.*;

public class ImplementQueueUsingStack {

 private class Queue {
  Stack<Integer> front = new Stack<>();
  Stack<Integer> reverse = new Stack<>();

  public Queue() {

  }

  public void enqueue(int x) {
   front.push(x);
  }

  public int dequeue() {
   if (reverse.isEmpty() && front.isEmpty())
    return Integer.MAX_VALUE;

   if (reverse.isEmpty()) {
    while (!front.isEmpty()) {
     reverse.push(front.pop());
    }
   }

   return reverse.pop();
  }

  public int front() {

   if (reverse.isEmpty() && front.isEmpty())
    return Integer.MAX_VALUE;

   if (reverse.isEmpty()) {
    while (!front.isEmpty()) {
     reverse.push(front.pop());
    }
   }
   return reverse.peek();
  }

  public boolean isEmpty() {
   if (reverse.isEmpty() && front.isEmpty())
    return true;

   return false;
  }

 }

 public static void main(String[] args) {
  ImplementQueueUsingStack QueueStack = new ImplementQueueUsingStack();
  ImplementQueueUsingStack.Queue queue = QueueStack.new Queue();

  queue.enqueue(0);
  queue.enqueue(1);
  queue.enqueue(2);
  queue.enqueue(3);
  queue.enqueue(4);
  queue.enqueue(5);

  System.out.println(queue.dequeue());
  System.out.println(queue.front());
  System.out.println(queue.isEmpty());

 }

}
