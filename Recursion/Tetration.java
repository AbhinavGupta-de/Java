package Recursion;

/*
 * A tetration of the form a↑↑b is the result of iteratively exponentiating a by itself b times.
 * 
 */
public class Tetration {
 // Writing a recursive function to calculate tetration

 public static long tetration(int n, int m) {
  if (m == 0) {
   return 1;
  }

  return (long) Math.pow(n, tetration(n, m - 1));
 }

 public static void main(String[] args) {
  System.out.println(tetration(2, 3));
 }
}