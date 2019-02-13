package rotatematrix;

public class RotateMatrix {

    public static int[][] rotateMatrix(int[][] arr){

        //first change the dimensions vertical length for horizontal length
        //and viceversa
        int[][] newArray = new int[arr[0].length][arr.length];

        //invert values 90 degrees clockwise by starting from button of
        //array to top and from left to right
        int ii = 0;
        int jj = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=arr.length-1; j>=0; j--){
                newArray[ii][jj] = arr[j][i];

                jj++;
            }
            jj = 0;
            ii++;
        }

        return newArray;
    }
}
