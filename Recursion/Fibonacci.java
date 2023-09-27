package Recursion;

/**
 * Fibonacci
 */
public class Fibonacci {

 // Print fibonacci series using recursion
 // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
 // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14

 public static int fibonacci(int n) {
  if (n == 0) {
   return 0;
  }
  if (n == 1 || n == 2) {
   return 1;
  }
  return fibonacci(n - 1) + fibonacci(n - 2);
 }

 // public static void fibonacci(int n) {
 // if (n == 0) {
 // System.out.println(0);
 // }
 // if (n == 1 || n == 2) {
 // System.out.println(1);
 // }

 // }

 public static void main(String[] args) {

 }
}