import java.util.Scanner;

public class Question11ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long balance = 1000;

        while (true) {
            System.out.println("\n1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    int deposit = input.nextInt();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("New balance: $" + balance);
                    } else {
                        System.out.println("Enter a positive amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawal = input.nextInt();

                    // Only subtract money after checking the available balance.
                    if (withdrawal <= 0) {
                        System.out.println("Enter a positive amount.");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdrawal;
                        System.out.println("New balance: $" + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return; // Exit the program and stop showing the menu.

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}