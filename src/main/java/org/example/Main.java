package org.example;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0, total = 0;
        String x;
        boolean flag = false;

        for (x = scanner.nextLine(); !x.equals("СТОП"); x = scanner.nextLine()) {
            if ((x.equals("ээээ") || x.equals("потом"))) {
                counter--;
            }
            counter++;
            if (x.equals("Куб")) {
                flag = true;
                total += counter;
            }

        }
        System.out.println(flag? total : "NO");
    }
}
