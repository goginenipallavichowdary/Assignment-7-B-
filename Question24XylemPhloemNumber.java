import java.util.Scanner;

public class Question24XylemPhloemNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer with at least two digits: ");
        int number = input.nextInt();

        if (number < 10) {
            System.out.println("Please enter a positive integer with at least two digits.");
            return;
        }

        String digits = String.valueOf(number);
        int lastIndex = digits.length() - 1;
        int outerSum = (digits.charAt(0) - '0') + (digits.charAt(lastIndex) - '0');
        int middleSum = 0;

        // Start after the first digit and stop before the last digit.
        for (int index = 1; index < lastIndex; index++) {
            middleSum += digits.charAt(index) - '0';
        }

        if (outerSum == middleSum) {
            System.out.println("Xylem number");
        } else {
            System.out.println("Phloem number");
        }
    }
}