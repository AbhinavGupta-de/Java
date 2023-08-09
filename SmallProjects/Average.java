package SmallProjects;

import java.util.Scanner;

public class Average {

  public static double sum(double[] nums) {
    double sum = 0;
    for (double num : nums) {
      sum += num;
    }
    return sum;
  }

  public static double average(double[] nums) {
    double sum = sum(nums);
    return sum / nums.length;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("How many numbers you want to get average of: ");
    int n = scan.nextInt();
    double[] marks = new double[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter the number: ");
      marks[i] = scan.nextDouble();
    }
    System.out.println(average(marks));
    scan.close();
  }

}
