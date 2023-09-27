package Recursion;

public class SumOfDigits {

 public static int sumOfDigitOfNumber(int n) {
  if (n == 0) {
   return 1;
  }
  return sumOfDigits(n);
 }

 public static int sumOfDigits(int n) {
  if (n == 0) {
   return 0;
  }

  return n % 10 + sumOfDigits(n / 10);
 }

 public static void main(String[] args) {
  System.out.println(sumOfDigits(23432));
 }
}
