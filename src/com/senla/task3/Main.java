package com.senla.task3;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.println("Введи слова русскими буквами через пробел : ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] x = input.split(" ");
        int[] r = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            r[i] = x[i].length() - x[i].replaceAll("(?iu)[аеёиоуыэюяє]", "").length();
        }
        System.out.println("Список отсортированных слов :");
        for (int i = x.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((r[i] < r[j])) {
                    int t = r[i];
                    r[i] = r[j];
                    r[j] = t;
                    String p = x[i];
                    x[i] = x[j];
                    x[j] = p;
                }
            }
            System.out.println(upperCase(x[i]));
        }
        scan.close();
    }

    private static String upperCase(String str) {
        char[] c = str.toCharArray();
        String vowels = "аеёиоуыэюяє";
        for (int i = 0; i < vowels.length(); i++) {
            char chr = vowels.charAt(i);
            for (int j = 0; j < c.length; j++) {
                if (c[j] == chr) {
                    c[j] = Character.toUpperCase(c[j]);
                    break;
                }
            }
        }
        return new String(c);
    }
}
