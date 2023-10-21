import java.util.Scanner;

public class maxSumRow {

  public static int MaxSumRow(int[][] arr) {
    int maxSum = 0;
    int maxRow = 0;
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
      }
      if (sum > maxSum) {
        maxSum = sum;
        maxRow = i;
      }
    }
    return maxRow;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      int m = scan.nextInt();
      int[][] arr = new int[m][m];
      for (int j = 0; j < m; j++) {
        for (int k = 0; k < m; k++) {
          arr[j][k] = scan.nextInt();
        }
      }
      System.out.println(MaxSumRow(arr));
    }

    scan.close();
  }
}
