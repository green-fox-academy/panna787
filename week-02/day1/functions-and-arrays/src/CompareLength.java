public class CompareLength {

    public static void main(String[] args) {

        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5};

        boolean p2Greater = p2.length > p1.length;

        System.out.println("P2 has more elements: " + p2Greater);
    }
}
