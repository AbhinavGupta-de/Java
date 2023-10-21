import java.util.Scanner;

public class maxInt {
    public static double greatestInt(double[] nums) {
        double answer = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (answer < nums[i]) {
                answer = nums[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // Scanner Object
        Scanner sc = new Scanner(System.in);

        // Finding out the number of inputs
        System.out.print("Enter the number of numbers you want to compare: ");
        int size = sc.nextInt();

        // Intitializing the input array
        double[] inputNums = new double[size];

        // Taking input for the n numbers
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number: ");
            inputNums[i] = sc.nextDouble();
            System.out.println();
        }

        // Calling the method to check for the greatest num and storing the answer in a
        // var
        double answer = greatestInt(inputNums);

        // Printing the answer
        System.out.println("The maximum number is: " + answer);
        sc.close();
    }
}
