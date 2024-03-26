package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int x = 0;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        x = scanner.nextInt();
        if (x >= 0) {
            y = 2 * x;
        } else {
            y = -2 * x;
        }
        System.out.println("your result " + y);
    }

}