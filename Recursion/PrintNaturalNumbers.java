package Recursion;

/**
 * PrintNaturalNumbers
 */
public class PrintNaturalNumbers {

 // Print natural Numbers using recursion
 // 1 to n-1

 public int[] nNaturalNumbers(int n) {
  int[] arr = new int[n];
  for (int i = 0; i < n; i++) {
   arr[i] = i + 1;
  }
  return arr;
 }

 public static void printNaturalNumbers(int n) {
  if (n == 0) {
   return;
  }
  printNaturalNumbers(n - 1);
  System.out.println(n);
 }

 public static void main(String[] args) {
  printNaturalNumbers(5);
 }
}
