import java.util.Scanner;

public class Question22SmithNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int remaining = number;
        int factorSum = 0;
        int factorCount = 0;

        for (int factor = 2; factor <= remaining / factor; factor++) {
            // Count the factor again if it divides the remaining number.
            while (remaining % factor == 0) {
                factorSum += digitSum(factor);
                factorCount++;
                remaining /= factor;
            }
        }

        if (remaining > 1) {
            factorSum += digitSum(remaining);
            factorCount++;
        }

        // A prime has only one prime factor, so exclude it.
        if (factorCount > 1 && factorSum == digitSum(number)) {
            System.out.println("Smith number");
        } else {
            System.out.println("Not a Smith number");
        }
    }

    private static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}