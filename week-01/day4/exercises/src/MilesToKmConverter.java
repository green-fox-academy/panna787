import java.util.Scanner;

public class MilesToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a distance in km-s: ");
        int distance = scanner.nextInt();
        double distanceInMiles = distance / 1.6;
        System.out.println("Distance in miles: " + distanceInMiles);
    }
}
