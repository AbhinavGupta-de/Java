import java.util.Scanner;

public class dogPrefrence {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Which dog do you prefer? (Small/Large)");
            String sizeInput = scan.nextLine();
            if (sizeInput.toLowerCase().equals("small")) {
                System.out.println("Great you selected small dog!!");
                System.out.println("Are you willing to adopt a high maintaince dog? (Yes/No)");
                String maintainanceInput = scan.nextLine();

                if (maintainanceInput.toLowerCase().equals("yes")) {
                    System.out.println("Take Pug or Chihuahua");
                } else if (maintainanceInput.toLowerCase().equals("no")) {
                    System.out.println("Take Indian Kutta from any street would be suffice.");
                } else {
                    System.out.println("Sorry, I didn't understand that.");
                }
            } else if (sizeInput.toLowerCase().equals("large")) {
                System.out.println("Great you selected the large dog!");
                System.out.println("Do you want a guard dog? (Yes/No)");
                String guardInput = scan.nextLine();

                if (guardInput.toLowerCase().equals("yes")) {

                }
            }
        }
    }

