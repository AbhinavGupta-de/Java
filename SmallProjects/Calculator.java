package SmallProjects;

/**
 * Calculator
 */
public class Calculator {

  public static double add(double a, double b) {
    return a + b;
  }

  public static double subtract(double a, double b) {
    return a - b;
  }

  public static double multiply(double a, double b) {
    return a * b;
  }

  public static double divide(double a, double b) {
    return a / b;
  }

  public static double modulo(double a, double b) {
    return a % b;
  }

  public static double power(double a, double b) {
    int num = 1;
    for (int i = 0; i < b; i++) {
      num *= a;
    }
    return num;
  }

  public static void main(String[] args) {
    System.out.println("Hello World");
  }

}