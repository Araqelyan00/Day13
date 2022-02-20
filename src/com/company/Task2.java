package com.company;

import java.util.Scanner;

/*
Create an n × n array and fill it according to the following rule:
- the numbers on the diagonal going from the upper right to the lower left
corner are equal to 1;
- numbers above this diagonal are equal to 0;
- the numbers below this diagonal are equal to 2
Input n from console
*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of matrix: ");
        int size = scanner.nextInt();
        boolean diaganal;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            diaganal = false;
            for (int j = 0; j < size; j++) {
                if (j == size - 1 - i) {
                    array[i][j] = 1;
                    diaganal = true;
                } else if (diaganal) {
                    array[i][j] = 2;
                }
            }
        }
        printMatrix(array);
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
