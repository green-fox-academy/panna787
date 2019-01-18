public class DrawChessTable {
    public static void main(String[] args) {
        int lines = 8;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j % 2 == 1) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                        }
                    }
            }
            System.out.println();
        }
    }
}
