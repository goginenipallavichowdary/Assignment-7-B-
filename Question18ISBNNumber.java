import java.util.Scanner;

public class Question18ISBNNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ISBN: ");

        // Read text to keep leading zeros and allow a final X.
        String isbn = input.nextLine().replaceAll("[\\s-]", "").toUpperCase();
        boolean valid = false;
        int sum = 0;

        if (isbn.matches("[0-9]{9}[0-9X]")) {
            for (int index = 0; index < 10; index++) {
                char character = isbn.charAt(index);
                int digit = character == 'X' ? 10 : character - '0';
                sum += digit * (10 - index); // Use weights 10 down to 1.
            }
            valid = sum % 11 == 0;

        } else if (isbn.matches("(978|979)[0-9]{10}")) {
            for (int index = 0; index < 13; index++) {
                int digit = isbn.charAt(index) - '0';
                int weight = index % 2 == 0 ? 1 : 3;
                sum += digit * weight;
            }
            valid = sum % 10 == 0;
        }

        if (valid) {
            System.out.println("ISBN checksum is valid.");
        } else {
            System.out.println("Invalid ISBN.");
        }
    }
}