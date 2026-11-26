import java.util.Scanner;

public class Question23StrontioNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit positive integer: ");
        int number = input.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a number from 1000 to 9999.");
            return;
        }

        int doubled = number * 2;

        // Divide to move the digit to the ones place, then take % 10.
        int tens = (doubled / 10) % 10;
        int hundreds = (doubled / 100) % 10;

        if (tens == hundreds) {
            System.out.println("Strontio number");
        } else {
            System.out.println("Not a Strontio number");
        }
    }
}