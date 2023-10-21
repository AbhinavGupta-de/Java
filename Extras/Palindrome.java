import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.Scanner;

public class Palindrome {
 public static boolean isPalindrome(String s) {
  String reverse = new StringBuffer(s).reverse().toString();
  if (s.equals(reverse)) {
   return true;
  }
  return false;
 }

 public static void main(String[] args) {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String s = "";
  try {
   s = br.readLine();
  } catch (Exception e) {
   System.out.println("Error! Please enter valid string!");
  }

  if (isPalindrome(s)) {
   System.out.println("Yes! The string is a palindrome!");
  } else {
   System.out.println("No! The string is not a palindrome!");
  }
 }
}
