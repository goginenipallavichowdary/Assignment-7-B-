import java.util.Scanner;

public class Question6TechNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        String digits = String.valueOf(number);

        if (number <= 0 || digits.length() % 2 != 0) {
            System.out.println("Not a Tech number");
            return;
        }

        // Split the digits at the middle.
        int middle = digits.length() / 2;
        int left = Integer.parseInt(digits.substring(0, middle));
        int right = Integer.parseInt(digits.substring(middle));
        long sum = left + right;

        if (sum * sum == number) {
            System.out.println("Tech number");
        } else {
            System.out.println("Not a Tech number");
        }
    }
}