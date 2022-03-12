package com.senla.task1;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Введите цифры : ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String str = input.replaceAll("\\D+\\s?", "");
        char[] chars = str.toCharArray();
        int[] ints = new int[str.length()];
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] - '0';
            sum = ints[i] + sum;
        }
        System.out.println("Сумма цифр : " + sum);
        scan.close();
    }
}
