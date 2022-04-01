package com.company;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Задание 1
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        // Задание 2
        int client = 0;
        int clientyear = 2014;
        if (client == 0 && clientyear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (client == 0 && clientyear >= 2015) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (client == 1 && clientyear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (client == 1 && clientyear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        }
        // Задание 3
        int year = 2016;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Задание 4
        int deliveryDistance = 105;
        if (deliveryDistance <= 20) {
            System.out.println("Для доставки потебуется 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Для доставки потебуется 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Для доставки потебуется 3 дня");
        } else {
            System.out.println("Доставка не возможна");
        }
        // Задание 5
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Такого месяца не сществует");
        }
    }
}
