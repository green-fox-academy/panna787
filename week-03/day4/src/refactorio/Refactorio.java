package refactorio;

public class Refactorio {

    public static void main(String[] args) {
        int number = 7;

        System.out.println(refactorio(number));
    }

    public static int refactorio (int n) {
        int fact = n;
        if(n > 1) {
            fact = n * refactorio(n-1);
        }
        return fact;
    }
}
