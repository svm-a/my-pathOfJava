package org.example;

import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, counter = 0, item;

        while ((item = scanner.nextInt()) != 0) {
            counter++;
            total += item;
        }
        System.out.println((double) total/ counter);
    }
}