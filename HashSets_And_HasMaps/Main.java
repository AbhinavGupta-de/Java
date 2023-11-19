package HashSets_And_HasMaps;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int n = sc.nextInt();
  sc.nextLine(); // Consume the newline character

  String s = sc.nextLine();

  HashMap<Character, Integer> map = new HashMap<>();

  char[] arr = s.toCharArray();

  for (int i = 0; i < arr.length; i++) {
   int countOccurrence = 1;
   while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
    countOccurrence++;
    i++;
   }
   if (map.containsKey(arr[i])) {
    map.put(arr[i], Math.max(map.get(arr[i]), countOccurrence));
   } else {
    map.put(arr[i], countOccurrence);
   }
  }

  // count the number of occurrences of each character
  int count = 0;
  for (Character c : map.keySet()) {
   count += map.get(c);
  }

  System.out.println(count);
 }
}
