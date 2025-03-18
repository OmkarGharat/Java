import java.util.Scanner;

public class Practice {
    // 🚀 Next Challenge: "User Menu System using Scanner & While Loop"

    public static void mainMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Add two numbers ");
        System.out.println("2. Find Square of a number");
        System.out.println("3. Exit ");
    }

    public static void main(String[] args) {

        try {
            Scanner optionScanner = new Scanner(System.in);

            while (true) {
                Practice.mainMenu();
                System.out.println("Your choice:");

                if (!optionScanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    optionScanner.nextLine();
                    continue;
                }
                int option = optionScanner.nextInt();


                if (option == 1) {
                    System.out.println("Enter first number: ");
                    int num1 = optionScanner.nextInt();

                    System.out.println("Enter second number: ");
                    int num2 = optionScanner.nextInt();

                    System.out.println("Sum: " + (num1 + num2));
                } else if (option == 2) {
                    System.out.println("Enter a number: ");
                    int num3 = optionScanner.nextInt();
                    System.out.println("The square of " + num3 + " is " + Math.pow(num3, 2));

                } else if (option == 3) {
                    optionScanner.close();
                    System.out.println("Goodbye!");
                    break;
                } else {
                    System.out.println("Invalid choice!");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid choice");
        }

    }
}
