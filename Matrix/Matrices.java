package Matrix;

public class Matrices {

  public static double[][] addmatrix(double[][] mattrix1, double[][] mattrix2) {
    int row1 = mattrix1.length;
    int row2 = mattrix2.length;

    if (row1 != row2) {
      System.out.println("The number of rows in the two matrices must be equal");
      return null;
    } else {

      for (int i = 0; i < row1; i++) {
        for (int j = 0; j < mattrix1[i].length; j++) {
          mattrix1[i][j] = mattrix1[i][j] + mattrix2[i][j];
        }
      }
      return mattrix1;
    }

  }

  public static double[][] productMatrix(double[][] mattrix1, double[][] mattrix2) {
    int row1 = mattrix1.length;
    int column1 = mattrix1[0].length;

    int row2 = mattrix2.length;
    int column2 = mattrix2[0].length;

    double[][] ans = new double[row1][column2];
    if (column1 == row2) {
      for (int i = 0; i < row1; i++) {
        for (int j = 0; j < column2; j++) {
          for (int k = 0; k < column1; k++) {
            ans[i][j] += mattrix1[i][k] * mattrix2[k][j];
          }
        }
      }
      return ans;
    } else {
      System.out.println(
          "The number of columns in the first matrix must be equal to the number of rows in the second matrix");
      return null;
    }
  }

  public static void main(String[] args) {
    // double[][] mattrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    // double[][] mattrix2 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
    // double[][] mattrix1 = { { 1, 2, 3 }, { 3, 4, 5 }, { 3, 4, 5 }, { 6, 7, 8 } };
    // double[][] mattrix2 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
    // double[][] mattrix1 = { { 1, 2, 3 }, { 3, 4, 5, 100 }, { 6, 7, 8 } };
    // double[][] mattrix2 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
    // double[][] ans = addmatrix(mattrix1, mattrix2);

    double[][] mattrix1 = { { 1, 3, }, { 5, 7 } };
    double[][] mattrix2 = { { 2, 4 }, { 6, 8 } };
    double[][] ans = productMatrix(mattrix1, mattrix2);

    if (ans == null) {
      System.out.println("The two matrices cannot be added");
    }

    else {
      System.out.println("The sum  of the two matrices is: ");
      for (int i = 0; i < ans.length; i++) {
        for (int j = 0; j < ans[0].length; j++) {
          System.out.print(ans[i][j] + " ");
        }
        System.out.println();
      }
    }

  }
}
