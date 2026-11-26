import java.util.Scanner;

public class Question1ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        long remaining = Math.abs((long) number);
        long reversed = 0;

        while (remaining > 0) {
            long digit = remaining % 10; // Take the last digit.
            reversed = reversed * 10 + digit;
            remaining /= 10; // Remove the last digit.
        }

        if (number < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed number: " + reversed);
    }
}