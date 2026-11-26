import java.util.Scanner;

public class Question2NumberToWords {
    private static final String[] SMALL = {
        "zero", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine", "ten", "eleven", "twelve", "thirteen",
        "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
        "", "", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = input.nextInt();

        if (number < 0) {
            System.out.println("minus " + toWords(-number));
        } else {
            System.out.println(toWords(number));
        }
    }

    private static String toWords(long number) {
        if (number < 20) {
            return SMALL[(int) number];
        }

        if (number < 100) {
            String tens = TENS[(int) (number / 10)];
            long ones = number % 10;
            return ones == 0 ? tens : tens + "-" + toWords(ones);
        }

        // Break a large number into a named group and a remainder.
        if (number < 1000) {
            return group(number, 100, "hundred");
        }
        if (number < 1000000) {
            return group(number, 1000, "thousand");
        }
        if (number < 1000000000) {
            return group(number, 1000000, "million");
        }
        return group(number, 1000000000, "billion");
    }

    private static String group(long number, long size, String label) {
        String words = toWords(number / size) + " " + label;
        long remainder = number % size;

        if (remainder > 0) {
            words += " " + toWords(remainder);
        }
        return words;
    }
}