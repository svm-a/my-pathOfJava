package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sizeArray = sc.nextInt();

        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        int a = sc.nextInt(), b = sc.nextInt() ;
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }
}