package com.gmail.fomichov.m.homework;

import java.util.Scanner;

/**
 * Created by mfomi on 29.06.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        int floor = 9; // этажей
        int entrance = 4; // подъездов
        int flatOnFloor = 4; // квартир на этаже
        int flatOnEntrance = floor * entrance; // квартир в подъзде
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер квартиры:");
        int flat = scanner.nextInt();
        if (flat > (floor * entrance * flatOnFloor) || flat <= 0) {
            System.out.println("Квартиры с номером " + flat + " нет в этом доме!");
        } else {
            int realEntrance = (flat - 1) / flatOnEntrance + 1;
            int realFloor = (flat - flatOnEntrance * (realEntrance - 1) - 1) / 4 + 1;
            System.out.println("Квартира расположена на " + realFloor + " этаже " + realEntrance + " подьезда");
        }
        scanner.close();
    }
}
