import java.util.Scanner;

public class Test {

 public int[][] solve(int[][] A) {
  // Transpose then inverse method

  int[][] B = new int[A.length][A[0].length];

  for (int i = 0; i < A.length; i++) {
   for (int j = 0; j < A[i].length; j++) {
    B[i][j] = A[j][i];
   }
  }

  int[][] C = new int[A.length][A[0].length];

  for (int i = 0; i < A.length; i++) {
   for (int j = 0; j < A[i].length; j++) {
    C[i][j] = B[i][A[i].length - 1 - j];
   }
  }

  A = C;

  return C;
 }

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int[][] A = { { 1, 2 }, { 3, 4 } };

  Test obj = new Test();
  A = obj.solve(A);

  for (int i = 0; i < A.length; i++) {
   for (int j = 0; j < A[i].length; j++) {
    System.out.print(A[i][j] + " ");
   }
   System.out.println();
  }

 }
}

/*
 * 
 * import java.lang.*;
 * import java.sql.SQLSyntaxErrorException;
 * import java.util.*;
 * 
 * public class Main {
 * public static void diagonalTraversal(int[][] matrix) {
 * int N = matrix.length;
 * int M = matrix[0].length;
 * ArrayList<Integer> result = new ArrayList<Integer>();
 * for (int k = N-1; k >= 0; k--) {
 * int i = k;
 * int j = 0;
 * while (i < N && j < M) {
 * System.out.print(matrix[i][j]+ " ");
 * i++;
 * j++;
 * }
 * }
 * for (int k = 1; k < M; k++) {
 * int i = 0;
 * int j = k;
 * while (i < N && j < M) {
 * System.out.print(matrix[i][j]+ " ");
 * i++;
 * j++;
 * }
 * }
 * }
 * public static void main(String[] args) {
 * // YOUR CODE GOES HERE
 * // Please take input and print output to standard input/output (stdin/stdout)
 * // DO NOT USE ARGUMENTS FOR INPUTS
 * // E.g. 'Scanner' for input & 'System.out' for output
 * Scanner nik = new Scanner(System.in);
 * int row = nik.nextInt(), col = nik.nextInt();
 * int [][] A = new int[row][col];
 * for (int i=0; i<row ; i++)
 * for (int j=0; j<col; j++)
 * A[i][j] = nik.nextInt();
 * diagonalTraversal(A);
 * }
 * }
 * 
 * 
 */
