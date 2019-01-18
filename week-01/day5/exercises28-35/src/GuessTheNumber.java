import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber = 11;
        int guessedNumber = 0;

        while (guessedNumber != myNumber) {
            System.out.println("Guess my number: ");
            guessedNumber = scanner.nextInt();
            if (guessedNumber < myNumber) {
                System.out.println("The stored number is higher");
            } else if (guessedNumber > myNumber) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: " + myNumber);
            }
        }
    }
}
