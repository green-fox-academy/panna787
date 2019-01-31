package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int element = 10;

        System.out.println(fibonacci(element));
    }

    public static int fibonacci(int n) {
        int valueAtN = 0;

        if(n > 0) {
            if (n == 1) {
                valueAtN = 0;
            } else if (n == 2) {
                valueAtN = 1;
            } else {
                valueAtN = fibonacci(n - 1) + fibonacci(n - 2);
            }

        }
        return valueAtN;
    }
}
