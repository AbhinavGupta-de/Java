package hashing;

import java.util.HashMap;

/*
 * 
 * Given two strings A and B, determine if they are isomorphic.
 * A and B are called isomorphic strings if all occurrences of each character in A can be replaced with another character to get B and vice-versa.
 * 
 */

public class IsomorphicString {

 public static int isIsomorphic(String A, String B) {

  // * Check the most easy case that if the length of the two strings are not
  // equal, then they are not isomorphic
  if (A.length() != B.length()) {
   return 0;
  }

  // ? This is the array method to solve this problem
  // * Create two arrays of size 256, to store the position of the characters in
  // the strings
  // int[] first = new int[256];
  // int[] second = new int[256];

  // * Iterate through the strings and check if the position of the characters are
  // same in both the strings
  // for (int i = 0; i < A.length(); i++) {
  // * If the position of the characters are not same, then return 0
  // if (first[A.charAt(i)] != second[B.charAt(i)]) {
  // return 0;
  // }

  // * If the position of the characters are same, then store the position of the
  // characters in the arrays
  // first[A.charAt(i)] = i + 1;
  // second[B.charAt(i)] = i + 1;
  // }

  // * Now with the help of HashMaps, to solve this problem
  // * Create two HashMaps to store the position of the characters in the strings
  HashMap<Character, Character> mapingAB = new HashMap<>();
  HashMap<Character, Character> mapingBA = new HashMap<>();

  for (int i = 0; i < A.length(); i++) {
   char charA = A.charAt(i);
   char charB = B.charAt(i);

   if (mapingAB.containsKey(charA)) {
    // * If the character is present in the HashMap, then check if the character
    // * is same as the character in the string B
    if (mapingAB.get(charA) != charB) {
     return 0;
    }
   }

   // * If the character is not present in the HashMap, then add the character in
   // * the HashMap
   else {
    mapingAB.put(charA, charB);
   }

   if (mapingBA.containsKey(charB)) {
    // * If the character is present in the HashMap, then check if the character
    // * is same as the character in the string A
    if (mapingBA.get(charB) != charA) {
     return 0;
    }
   } else {
    // * If the character is not present in the HashMap, then add the character in
    // * the HashMap
    mapingBA.put(charB, charA);
   }

  }

  return 1;
 }

 public static void main(String[] args) {
  String a = "aab";
  String b = "xzy";
  System.out.println(isIsomorphic(a, b));
 }
}
