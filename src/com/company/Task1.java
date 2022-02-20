package com.company;

import java.util.Scanner;

/*
Create an n × n array and fill it according to the following rule:
- the numbers on the diagonal going from the upper right to the lower left
corner are equal to 1;
- the other elements are 0;
- print matrix
*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of matrix: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1 - i) {
                    array[i][j] = 1;
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

