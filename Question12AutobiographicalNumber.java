import java.util.Scanner;

public class Question12AutobiographicalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = input.next();

        if (!number.matches("[1-9][0-9]{0,9}")) {
            System.out.println("Enter a positive number with up to 10 digits.");
            return;
        }

        int[] counts = new int[10];

        // Count how many times each digit appears.
        for (int index = 0; index < number.length(); index++) {
            int digit = number.charAt(index) - '0';
            counts[digit]++;
        }

        for (int index = 0; index < number.length(); index++) {
            int expected = number.charAt(index) - '0';

            if (expected != counts[index]) {
                System.out.println("Not an Autobiographical number");
                return;
            }
        }

        System.out.println("Autobiographical number");
    }
}