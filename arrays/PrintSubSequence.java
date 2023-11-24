package arrays;

public class PrintSubSequence {

 public void printSubSequence(int[] arr) {
  // 1. Find the number of subsequences - 2^n
  // 2. Loop from 0 to 2^n - 1
  // 3. Convert the number to binary
  // 4. For each bit, if it is 1, print the corresponding element
  int n = arr.length;
  int totalSubSequences = (int) Math.pow(2, n);
  for (int i = 0; i < totalSubSequences; i++) {

  }

 }

 public static void main(String[] args) {
  PrintSubSequence obj = new PrintSubSequence();
  int[] arr = { 1, 2, 3 };
  obj.printSubSequence(arr);
 }
}
