import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines * 2; j++) {
                if (j >= lines - i & j <= lines + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
