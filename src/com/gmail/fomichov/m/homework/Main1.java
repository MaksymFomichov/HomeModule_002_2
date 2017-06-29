package com.gmail.fomichov.m.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mfomi on 29.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data[] = new int[4];
        for (int i = 0; i < data.length; i++) {
            System.out.println("Введите " + (i + 1) + " число:");
            data[i] = scanner.nextInt();
        }
        Arrays.sort(data);
        System.out.println("Максимально введенное число: " + data[3]);
    }
}