package RotateImage_48;

public class Solution {
    public void rotate1(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[matrix.length - j - 1][i];
            }
        }

        matrix = result;
    }

    // transpose the matrix
    // flip the matrix
    public void rotate(int[][] matrix) {
                for(int i = 0; i<matrix.length; i++){
                    for(int j = i; j<matrix[0].length; j++){
                        int temp = 0;
                        temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}