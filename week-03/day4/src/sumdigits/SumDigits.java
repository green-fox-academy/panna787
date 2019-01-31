package sumdigits;

public class SumDigits {

    public static void main(String[] args) {
        int n = 196;

        System.out.println(sumDigits(n));
    }

    public static int sumDigits (int n) {
        int sum = 0;
        if(n > 0) {
            sum = n % 10 + sumDigits(n / 10);
            return sum;
        }
        return sum;
    }
}
