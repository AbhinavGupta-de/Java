import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

         for (int i = 0; i < n/2; i++) {
             int spaces = i * 2;
            int stars = (n - (2 * i));

            for (int k = 0; k < (stars / 2); k++) {
                System.out.print("*");
            }
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (stars / 2); k++) {
                System.out.print("*");
            }

            System.out.println();
         }
        for (int i = 1; i <= n / 2; i++) {
            int spaces = (n - (2 * i));
            int stars = (i * 2);
            for (int k = 0; k < (stars / 2); k++) {
                System.out.print("*");
            }
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (stars / 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
