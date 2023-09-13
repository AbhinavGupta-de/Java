import java.util.Scanner;

public class infiniteArray {

  public static int[] addElement(int[] a, int element) {
    int[] b = new int[a.length + 1];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
    }
    b[a.length] = element;
    return b;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the elements of the array or if you want to quit just type anything but a number: ");

    while (true) {
      int[] array = new int[1];
      try {

        int element = scan.nextInt();
        array = addElement(array, element);

      } catch (Exception e) {

        System.out.println("The array is: ");
        for (int i : array) {
          System.out.print(i + " ");
        }
        scan.close();
        break;
      }

    }

  }
}
