package numberadder;

public class NumberAdder {

    public static void main(String[] args) {
        int n = 12;

        System.out.println(addNumbers(n));

    }

    public static int addNumbers(int n) {
        int sum = 0;
        if (n > 0) {
            sum = n + addNumbers(n-1);
        }
        return sum;
    }



}
