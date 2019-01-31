package counter;

public class Counter {


    public static void main(String[] args) {
        int n = 10;
        
        countdown(n);

    }

    public static void countdown (int n) {
        if (n > -100) {
            System.out.println(n);
            countdown(n-1);
        }

    }
}
