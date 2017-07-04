package com.gmail.fomichov.m.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mfomi on 29.06.2017.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            while (true) {
                try {
                    System.out.println("Введите " + (i + 1) + " целое число:");
                    data[i] = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Введено не число!!!");
                    sc.nextLine();
                }
            }

        }
        Arrays.sort(data);
        System.out.println("Максимально введенное число: " + data[3]);
        scanner.close();
    }
}