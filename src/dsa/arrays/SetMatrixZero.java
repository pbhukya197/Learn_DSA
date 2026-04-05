package dsa.arrays;

import java.util.Scanner;

public class SetMatrixZero {

    public static void setZeros(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        // Step 1: Mark rows and columns
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, i, col);
                    markColumn(matrix, j, row);
                }
            }
        }
        // Step 2: Convert -1 to 0
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void markRow(int[][] matrix, int i, int col) {
        for (int j = 0; j < col; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }
    public static void markColumn(int[][] matrix, int j, int row) {
        for (int i = 0; i < row; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        setZeros(matrix);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}