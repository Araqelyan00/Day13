package com.company;

import java.util.Random;
import java.util.Scanner;

/*
There are n athletes competing in hammer throw. Each of them made
m throws. The winner of the competition is the athlete who has the best
result in all throws. Thus, the program must find the value of the
maximum element in the given array, as well as its indices (that is, the
number of the athlete and the number of the attempt).
Input `
The program receives as input two numbers n and m, which are the
number of rows and columns in the array. Then in the input stream there
are n lines containing m numbers each, which are the elements of the
array.
Output`
The program prints out the value of the maximum element, then the
row number and the column number in which it occurs. If there are
several maximum elements in the array, then you need to display the
minimum line number in which such an element occurs, and if there are
several such elements in this line, then you need to display the minimum
column number. Remember that all rows and columns are numbered
from 0.
*/
public class Task5 {
    public static int[][] generateArray(int n, int m) {
        Random random = new Random();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(10);
            }
        return array;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = generateArray(n, m);
        printMatrix(array);
        int max = 0;
        int row = 0, column = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    row = i;
                    column = j;
                }
            }
        System.out.println(max + "   " + row + "   " + column);
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
