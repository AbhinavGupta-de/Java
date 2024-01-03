package hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Main {
 public static void main(String[] args) {
  HashMap<Character, Integer> map = new HashMap<>();

  map.put('a', generateRandomValue());
  map.put('b', generateRandomValue());
  map.put('c', generateRandomValue());
  map.put('d', generateRandomValue());
  map.put('e', generateRandomValue());

  Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
  while (iterator.hasNext()) {
   Map.Entry<Character, Integer> entry = iterator.next();
   Character key = entry.getKey();
   Integer value = entry.getValue();
  }
 }

 private static int generateRandomValue() {
  Random random = new Random();
  return random.nextInt(100); // Change 100 to the desired range of random values
 }
}
