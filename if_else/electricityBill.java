import java.lang.*;
import java.util.*;

public class electricityBill {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        double bill = 0;

        bill = input * 0.50;
        input = input - 50;

        if (input > 0) {
            bill = bill + (input * 0.25);
            input = input - 100;

            if (input > 0) {
                bill = bill + (input * 0.25);
                input = input - 100;

                if (input > 0) {
                    bill = bill + (input * 0.30);
                }
            }
        }

        bill = bill * 0.2;
        System.out.println(bill);

    }

}
