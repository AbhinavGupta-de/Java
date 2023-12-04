import java.util.HashMap;

public class CheckPallindrome {
 public static boolean checkPallindrome(String str) {
  // * Checking Pallindrome using HashMap
  HashMap<Character, Integer> map = new HashMap<>();
  for (int i = 0; i < str.length(); i++) {
   if (!map.containsKey(str.charAt(i))) {
    map.put(str.charAt(i), 1);
   } else {
    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
   }
  }

  int oddCount = 0;
  for (char key : map.keySet()) {
   if (map.get(key) % 2 != 0) {
    oddCount++;
   }
  }

  if (oddCount > 1) {
   return false;
  }

  return true;
 }

 public static void main(String[] args) {
  String str = "abba";
  System.out.println(checkPallindrome(str));
 }
}
