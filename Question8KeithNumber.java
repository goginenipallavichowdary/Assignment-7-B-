import java.util.Scanner;

public class Question8KeithNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer with at least two digits: ");
        int number = input.nextInt();

        if (number < 10) {
            System.out.println("Not a Keith number");
            return;
        }

        String digits = String.valueOf(number);
        long[] terms = new long[digits.length()];

        for (int index = 0; index < terms.length; index++) {
            terms[index] = digits.charAt(index) - '0';
        }

        long next = 0;
        while (next < number) {
            next = 0;
            for (long term : terms) {
                next += term;
            }

            // Drop the oldest term and place the new term at the end.
            for (int index = 0; index < terms.length - 1; index++) {
                terms[index] = terms[index + 1];
            }
            terms[terms.length - 1] = next;
        }

        if (next == number) {
            System.out.println("Keith number");
        } else {
            System.out.println("Not a Keith number");
        }
    }
}