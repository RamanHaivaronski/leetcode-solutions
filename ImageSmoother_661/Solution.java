package ImageSmoother_661;


public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                sum = img[i][j];
                count++;
                if (i != 0) {
                    sum += img[i - 1][j];
                    count++;
                }
                if (i != img.length - 1) {
                    sum += img[i + 1][j];
                    count++;
                }
                if (j != 0) {
                    sum += img[i][j-1];
                    count++;
                }
                if (j != img[0].length - 1) {
                    sum += img[i][j + 1];
                    count++;
                }
                //right top diagonal
                if (i != 0 && j != img[0].length - 1) {
                    sum += img[i - 1][j + 1];
                    count++;
                }
                // left top diagonal
                if (i != 0 && j != 0) {
                    sum += img[i - 1][j - 1];
                    count++;
                }
                // right bot diagonal
                if (i != img.length - 1 && j != img[0].length - 1) {
                    sum += img[i + 1][j + 1];
                    count++;
                }
                // left bot diagonal
                if (i != img.length - 1 && j != 0) {
                    sum += img[i + 1][j - 1];
                    count++;
                }

                result[i][j] = (int) Math.floor(sum / count);
                sum = 0;
                count = 0;
            }
        }
        return result;
    }
}