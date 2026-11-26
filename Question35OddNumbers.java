public class Question35OddNumbers {
    public static void main(String[] args) {
        // Start at the first odd number and add 2 each time.
        for (int number = 1; number <= 100; number += 2) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}