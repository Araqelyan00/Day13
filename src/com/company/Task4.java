package com.company;

import java.util.Random;
import java.util.Scanner;

/*
There are n athletes competing in hammer throw. Each of them made
m throws. The winner is the athlete who has the maximum result for all
throws.
If the athletes are renumbered from 0 to n-1, and the attempts of each of
them are from 0 to m-1, then the program receives an array A [n] [m],
consisting of non-negative integers, as input. The program should
determine the maximum amount of numbers in one line and display this
amount and the line number for which this amount is reached.
Input` The program receives as input two numbers n and m, which are
the number of rows and columns in the array. Then in the input stream
there are n lines containing m numbers each, which are the elements of
the array.
Output` The program should display 2 numbers: the amount and the line
number for which this amount is reached. If there are several such lines,
then the number of the smallest of them is displayed. Do not forget that
line numbering (for athletes) starts at 0.
*/
public class Task4 {
    public static int[][] generateArray(int n, int m) {
        Random random = new Random();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(10);
            }
        return array;
    }
    public static void printMaxAndIndex(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[index]) {
                index = i;
            }
        }
        System.out.println("max: " + array[index] + " index: " + index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = generateArray(n, m);
        printMatrix(array);
        int[] sumOfEachRow = new int[n];
        int sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
            }
            sumOfEachRow[i] = sum;
        }
        printMaxAndIndex(sumOfEachRow);
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


