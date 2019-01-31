package bunnies;

public class Bunny1 {

    public static void main(String[] args) {
        int bunnies = 16;

        System.out.println(countBunnyEars(bunnies));
    }

    public static int countBunnyEars(int numberOfBunnies) {
        int numberOfEars = 0;
        if (numberOfBunnies > 0) {
            numberOfEars = 2 + countBunnyEars(numberOfBunnies-1);
        }

        return numberOfEars;
    }
}
