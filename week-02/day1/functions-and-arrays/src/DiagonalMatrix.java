public class DiagonalMatrix {

    public static void main(String[] args) {

        int[][] m = new int[4][4];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
                System.out.print(m[i][j]);

            }

            System.out.println();

        }


    }
}
