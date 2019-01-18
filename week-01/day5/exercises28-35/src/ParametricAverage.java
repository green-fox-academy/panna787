import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numberOfNumbers = scanner.nextInt();
        int sumNumbers = 0;
        System.out.println("Enter " + numberOfNumbers + " more numbers");

        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println((i + 1) + ". number: ");
            sumNumbers += scanner.nextInt();
        }

        double averageNum = sumNumbers / numberOfNumbers;

        System.out.println("Sum: " + sumNumbers + ", Average: " + averageNum);

    }

}
