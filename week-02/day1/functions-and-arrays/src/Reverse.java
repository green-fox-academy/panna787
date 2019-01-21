import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};
        int[] reversed = new int[5];

        for (int i = 0; i < aj.length; i++) {
            reversed[i] = aj[aj.length - i - 1];
        }

        System.out.println(Arrays.toString(reversed));
    }
}
