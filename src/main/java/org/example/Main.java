package org.example;
import java.util.Arrays;
import java.util.Scanner;


class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        int totalX = 0;
        int totalY = 0;
        int totalDig1 = 0;
        int totalDig2 = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                totalX += array[i][j];
                totalY += array[j][i];
                totalDig1 += array[j][j];
                totalDig2 += array[j][array.length - 1 - j];
            }
            if (totalX == totalY && totalY == totalDig1 && totalDig1 == totalDig2) {
                totalX = 0;
                totalY = 0;
                totalDig1 = 0;
                totalDig2 = 0;
            } else {
                flag = false;
            }
        }
        System.out.println(flag? "YES" : "NO");
    }
}
