package Recursion;

/**
 * CheckPallindrome
 */
public class CheckPallindrome {

 // To Check if a string is a palindrome or not using recursion
 public static boolean isPallindrome(String str) {
  if (str.length() == 0 || str.length() == 1) {
   return true;
  }
  if (str.charAt(0) == str.charAt(str.length() - 1)) {
   return isPallindrome(str.substring(1, str.length() - 1));
  }
  return false;
 }

}