package RotateImageInPlace;

public class RotateImageInPlace {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        int[] r1 = new int[] { 15, 13, 2, 5 };
        int[] r2 = new int[] { 14, 3, 4, 1 };
        int[] r3 = new int[] { 12, 6, 8, 9 };
        int[] r4 = new int[] { 16, 7, 10, 11 };

        matrix[0] = r1;
        matrix[1] = r2;
        matrix[2] = r3;
        matrix[3] = r4;

        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = tmp;
            }
        }
    }
}
