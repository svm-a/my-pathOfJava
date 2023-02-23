package org.example;
import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.printf("%d-%d-%d", (number + 1), (number + 2), (number + 3));
    }

}