package goodQuestions;

import java.util.*;

public class ColorfulNumber {

 /*
  * Given a number A, find if it is COLORFUL number or not.
  * 
  * If number A is a COLORFUL number return 1 else, return 0.
  * 
  * What is a COLORFUL Number:
  * 
  * A number can be broken into different consecutive sequence of digits.
  * The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45,
  * 324, 245 and 3245.
  * This number is a COLORFUL number, since the product of every consecutive
  * sequence of digits is different
  */
 public int colorful(int A) {

  String str = String.valueOf(A);

  HashSet<Integer> set = new HashSet<>();

  for (int i = 0; i < str.length(); i++) {
   int product = 1;
   for (int j = i; j < str.length(); j++) {
    product *= Integer.parseInt(String.valueOf(str.charAt(j)));
    if (set.contains(product)) {
     return 0;
    }
    set.add(product);
   }
  }

  return 1;

 }

}
