import java.util.Scanner;

public class Question7FascinatingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        String combined = "" + number + (2L * number) + (3L * number);

        if (number < 100 || combined.length() != 9) {
            System.out.println("Not a Fascinating number");
            return;
        }

        boolean[] seen = new boolean[10];

        for (int index = 0; index < combined.length(); index++) {
            int digit = combined.charAt(index) - '0'; // Change a character to a digit.

            if (digit == 0 || seen[digit]) {
                System.out.println("Not a Fascinating number");
                return;
            }
            seen[digit] = true;
        }

        System.out.println("Fascinating number");
    }
}