import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int lines = scanner.nextInt();


        int midLine = (lines + 1) / 2;

        for (int i = 0; i < midLine; i++) {
                for (int j = midLine - (i + 1); j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = i * 2 + 1; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
        }

        if (lines % 2 == 1) {
            for (int i = midLine; i < lines; i++) {
                for (int j = 0; j < i - midLine + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = (lines - i) * 2 - 1; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = midLine; i < lines; i++) {
                for (int j = 1; j < i - midLine + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = (lines - i) * 2 - 1; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


    }
}
