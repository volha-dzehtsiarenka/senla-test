package com.senla.task2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Введите целое число : ");
        Scanner scan = new Scanner(System.in);
        int x = 2;
        if (scan.hasNextInt()) {
            System.out.print("Простые множители : ");
            int numb = scan.nextInt();
            while (x * x <= numb) {
                if (numb % x == 0) {
                    System.out.print(x);
                    numb = numb / x;
                    System.out.print(' ');
                } else if (x == 2) {
                    x = 3;
                } else {
                    x = x + 2;
                }
            }
            System.out.println(numb);
        } else {
            System.out.println("Введеное число не целое");
        }
        scan.close();
    }
}
