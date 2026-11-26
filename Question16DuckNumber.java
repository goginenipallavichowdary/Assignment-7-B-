import java.util.Scanner;

public class Question16DuckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Reading an int removes leading zeros before we check the digits.
        String digits = String.valueOf(number);

        if (number > 0 && digits.contains("0")) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not a Duck number");
        }
    }
}