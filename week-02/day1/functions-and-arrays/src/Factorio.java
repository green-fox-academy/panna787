public class Factorio {

    public static void main(String[] args) {

        factorio(9);

    }

    public static int factorio(int number) {
        int factorial = 1;

        for (int i = 1; i <= number ; i++) {

            factorial *= i;
        }

        return factorial;
    }
}
