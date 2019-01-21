public class Sum {


    public static void main(String[] args) {

        System.out.println(sum(15));

    }

    public static int sum(int number) {

        int sumNumber = 0;

        for (int i = 0; i <= number; i++) {

            sumNumber += i;
        }

        return sumNumber;

        }
}
