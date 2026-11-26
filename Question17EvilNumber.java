import java.util.Scanner;

public class Question17EvilNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Please enter zero or a positive integer.");
            return;
        }

        String binary = Integer.toBinaryString(number);
        int ones = 0;

        for (int index = 0; index < binary.length(); index++) {
            if (binary.charAt(index) == '1') {
                ones++;
            }
        }

        System.out.println("Binary: " + binary);
        if (ones % 2 == 0) {
            System.out.println("Evil number");
        } else {
            System.out.println("Not an Evil number");
        }
    }
}