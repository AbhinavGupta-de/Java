import java.util.Scanner;

public class traingleDots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Simple triangle pattern
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Reverse traingle pattern
        // for (int i = 0; i < n; i++) {
        // for (int j = n - i; j > 0; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Printing stars at odd places and number at even place traingle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if (j % 2 == 0) {
        // System.out.print(j + " ");
        // } else {
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // ;
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if (j % 2 == 0) {
        // System.out.print("* ");
        // } else {
        // System.out.print((j / 2) + 1 + " ");
        // }
        // }
        // System.out.println();
        // ;
        // }

        // Reverse traingle pattern with spaces in between
        // for (int i = 0; i < n; i++) {
        // for (int j = n - i; j >= 0; j--) {
        // if (j == 0 || j == n - i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");

        // }
        // }
        // System.out.println();

        // }

        // for (int i = n; i >= 2; i--) {
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i)
        // System.out.print("*");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // print basic traingle pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
