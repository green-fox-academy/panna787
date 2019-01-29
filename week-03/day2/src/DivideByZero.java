import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Divide 10 by: ");

        try {
            int divider = scanner.nextInt();
            int result = 10 / divider;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException ex) {
            System.err.println("fail");

        }

    }
}