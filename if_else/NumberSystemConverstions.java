import java.util.Scanner;

public class NumberSystemConverstions {
    public static int BinaryToDecimal(int number) {
        int answer = 0;
        // TODO Make the program
        return answer;
    }

    public static int DecimalToBinarry(int number) {
        int remainder = 0;
        int power = 0;
        int answer = 0;
        int tenthPower = 0;
        while (number > 0) {
            remainder = number % 2;
            tenthPower = (int) Math.pow(10, power);
            answer = (remainder * tenthPower) + answer;
            power++;
            number /= 2;
        }
        return answer;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = DecimalToBinarry(number);
        System.out.println(answer);
        sc.close();
    }
}
