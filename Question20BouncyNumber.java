import java.util.Scanner;

public class Question20BouncyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        String digits = String.valueOf(number);
        boolean goesUp = false;
        boolean goesDown = false;

        // Compare each digit with the one immediately before it.
        for (int index = 1; index < digits.length(); index++) {
            char previous = digits.charAt(index - 1);
            char current = digits.charAt(index);

            if (current > previous) {
                goesUp = true;
            } else if (current < previous) {
                goesDown = true;
            }
        }

        if (goesUp && goesDown) {
            System.out.println("Bouncy number");
        } else {
            System.out.println("Not a Bouncy number");
        }
    }
}