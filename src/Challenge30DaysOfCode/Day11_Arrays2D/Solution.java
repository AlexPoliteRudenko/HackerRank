package Challenge30DaysOfCode.Day11_Arrays2D;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int max = hourGlassCount(hourGlass(arr, 0, 0));
        int temp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp = hourGlassCount(hourGlass(arr, i, j));
                max = temp > max ? temp : max;
            }
        }
        System.out.println(max);
    }

    private static int[][] hourGlass(int[][] matrix, int row, int column) {
        int[][] newMatrix = new int[3][3];
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix.length; j++) {
                newMatrix[i][j] = matrix[i + row][j + column];
            }
        }
        //TODO
        return newMatrix;
    }

    private static int hourGlassCount(int[][] matrix) {
        int sum = 0;
        //TODO
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0 || j == 2) {
                    sum += matrix[i][j];
                } else if (i == 1 && j == 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
