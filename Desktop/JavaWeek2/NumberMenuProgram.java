// import scanner so the program can read user input
import java.util.Scanner;

// create the main class for the program
public class NumberMenuProgram {

    // create the main method where the program starts
    public static void main(String[] args) {

        // create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // create variables to store the two numbers
        int x = 0;
        int y = 0;

        // create a variable to check if the user entered numbers first
        boolean numbersEntered = false;

        // create a variable to store the menu choice
        int choice = 0;

        // repeat the menu until the user chooses to exit
        while (choice != 5) {

            // print the menu
            System.out.println();
            System.out.println("Menu");
            System.out.println("1 - Enter two numbers x and y.");
            System.out.println("2 - Print all numbers between x and y.");
            System.out.println("3 - Find the average of all numbers between x and y.");
            System.out.println("4 - Find all prime numbers between x and y.");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice: ");

            // get the user's choice
            choice = input.nextInt();

            // run code based on the user's choice
            switch (choice) {

                // option 1 lets the user enter two numbers
                case 1:
                    System.out.print("Enter the first number x: ");
                    x = input.nextInt();

                    System.out.print("Enter the second number y: ");
                    y = input.nextInt();

                    numbersEntered = true;

                    System.out.println("The numbers have been saved.");
                    break;

                // option 2 prints all numbers between x and y
                case 2:
                    if (!numbersEntered) {
                        System.out.println("Please enter two numbers first by choosing option 1.");
                    } else {
                        int start = Math.min(x, y);
                        int end = Math.max(x, y);

                        System.out.println("Numbers between " + x + " and " + y + ":");

                        for (int i = start; i <= end; i++) {
                            System.out.print(i + " ");
                        }

                        System.out.println();
                    }
                    break;

                // option 3 finds the average of all numbers between x and y
                case 3:
                    if (!numbersEntered) {
                        System.out.println("Please enter two numbers first by choosing option 1.");
                    } else {
                        int start = Math.min(x, y);
                        int end = Math.max(x, y);
                        int sum = 0;
                        int count = 0;

                        for (int i = start; i <= end; i++) {
                            sum = sum + i;
                            count++;
                        }

                        double average = (double) sum / count;

                        System.out.println("The average of all numbers between " + x + " and " + y + " is " + average + ".");
                    }
                    break;

                // option 4 finds all prime numbers between x and y
                case 4:
                    if (!numbersEntered) {
                        System.out.println("Please enter two numbers first by choosing option 1.");
                    } else {
                        int start = Math.min(x, y);
                        int end = Math.max(x, y);

                        System.out.println("Prime numbers between " + x + " and " + y + ":");

                        for (int i = start; i <= end; i++) {
                            if (isPrime(i)) {
                                System.out.print(i + " ");
                            }
                        }

                        System.out.println();
                    }
                    break;

                // option 5 exits the program
                case 5:
                    System.out.println("Program ended.");
                    break;

                // this handles invalid menu choices
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                    break;
            }
        }

        // close the scanner
        input.close();
    }

    // create a method to check if a number is prime
    public static boolean isPrime(int number) {

        // numbers less than 2 are not prime
        if (number < 2) {
            return false;
        }

        // check if the number has any divisor other than 1 and itself
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        // return true if the number is prime
        return true;
    }
}