import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                if (i == 0 | i == lines-1) {
                    System.out.print('%');
                } else {
                    if (j == 0 | j == lines - 1) {
                        System.out.print('%');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}
