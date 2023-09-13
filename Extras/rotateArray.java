import java.util.Scanner;

public class rotateArray {

  public static double[] rotate(double[] a, int k) {
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      b[(i + k) % a.length] = a[i];
    }
    return b;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = scan.nextInt();
    double[] a = new double[size];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
      a[i] = scan.nextDouble();
    }
    System.out.println("Enter the number of rotations: ");
    int k = scan.nextInt();
    scan.close();
    double[] b = rotate(a, k);
    System.out.println("The rotated array is: ");
    for (int i = 0; i < size; i++) {
      System.out.print(b[i] + " ");
    }
  }
}
