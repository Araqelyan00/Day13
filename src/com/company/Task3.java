package com.company;

import java.util.Random;

/*
Check if the two-dimensional array is symmetrical about the main
diagonal. The main diagonal is the one that goes from the upper left
corner of the two-dimensional array to the lower right.
Example` Input` 3 Input` 3
0 1 2             0 0 0
1 5 3             0 0 0
2 3 4             1 0 0
Output` YES       Output` NO
*/
public class Task3 {
    public static int[][] generateSymmetricArray(int n) {
        Random rand = new Random();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int value = rand.nextInt(10);
                array[i][j] = value;
                array[j][i] = value;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = generateSymmetricArray(4);
        printMatrix(array);
        System.out.println(checkSymmetric(array));
    }

    public static boolean checkSymmetric(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != array[j][i] ) {
                    return false ;
                }
            }
        }
        return true;
    }

    public static void printMatrix(int[][] array) {
        for (int[] arr : array) {
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
