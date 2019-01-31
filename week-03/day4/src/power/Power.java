package power;

public class Power {

    public static void main(String[] args) {
        int n = 5;
        int p = 3;

        System.out.println(power(n, p));
    }

    public static int power(int n, int p) {
        int result = n;
        if (p > 1) {
            result = n * power(n, p - 1);
        }
       return result;
    }

}
