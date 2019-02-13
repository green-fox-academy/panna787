package rotatematrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedMatrix = RotateMatrix.rotateMatrix(matrix);

        Arrays.stream(rotatedMatrix)
                .forEach(row -> System.out.println(Arrays.toString(row)));
    }
}
