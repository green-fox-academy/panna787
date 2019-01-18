import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int lines = scanner.nextInt();
        String stars = "";

        for (int i = 0; i < lines; i++) {
            stars += "*";
            System.out.println(stars);
        }



    }
}
