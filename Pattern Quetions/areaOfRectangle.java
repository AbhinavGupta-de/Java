import java.util.*;

public class areaOfRectangle {
    public static double areaRectangle(double length, double breadth) {
        double area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        double area = areaRectangle(length, breadth);
        System.out.println();
        System.out.println("The area of the Rectangle is: " + area);
        sc.close();
    }
}
