package org.example;
import java.util.Arrays;
import java.util.Scanner;


class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] array = new int[m][n];
        int[][] result = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[j][m - i - 1] = array[i][j];
                }
        }

        for (int i = 0; i < result.length; i ++) {
            for (int j = 0; j < result[i].length; j ++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
