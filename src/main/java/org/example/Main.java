package org.example;

import javax.sound.sampled.EnumControl;
import java.sql.Array;
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        boolean flag = true;
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && j != i) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(array[i]);
            }
            flag = true;
        }
    }
}