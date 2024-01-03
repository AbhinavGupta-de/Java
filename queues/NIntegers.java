package queues;

import java.util.*;

/**
 * NIntegers
 */
public class NIntegers {

 public ArrayList<Integer> nIntegersFromList(int A) {
  Queue<Integer> queue = new LinkedList<>();
  ArrayList<Integer> result = new ArrayList<>();

  queue.add(1);
  queue.add(2);
  queue.add(3);

  while (A > 0) {
   int digit = queue.remove();
   queue.add(digit * 10 + 1);
   queue.add(digit * 10 + 2);
   queue.add(digit * 10 + 3);
   result.add(digit);
   A--;
  }

  return result;
 }
}