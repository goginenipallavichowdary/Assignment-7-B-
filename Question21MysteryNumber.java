import java.util.Scanner;

public class Question21MysteryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        for (int first = 10; first <= 99; first++) {
            int tens = first / 10;
            int ones = first % 10;

            if (ones == 0) {
                continue; // Its reverse would only have one digit.
            }

            int reversed = ones * 10 + tens;

            if (first + reversed == number) {
                System.out.println("Mystery number: " + first + " + " + reversed);
                return;
            }
        }

        System.out.println("Not a Mystery number");
    }
}