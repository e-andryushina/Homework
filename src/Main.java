public class Main {
    public static void main(String[] args) {


        // Циклы. Часть 1.  Домашнее задание -1. Задание 1
        System.out.println("Циклы. Часть 1.  Домашнее задание -1. Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            }

        //Циклы. Часть 1.  Домашнее задание -1. Задание 2
        System.out.println("Циклы. Часть 1.  Домашнее задание -1.Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Циклы. Часть 1.  Домашнее задание -1. Задание 3
        System.out.println("Циклы. Часть 1.  Домашнее задание -1. Задание 3");
        for (int i = 0; i <= 17; i=i + 2) {
            System.out.println(i);
        }


        //Циклы. Часть 1.  Домашнее задание -1. Задание 4
        System.out.println("Циклы. Часть 1.  Домашнее задание -1. Задание 4");
        for (int i = 10; i >= - 10; i--) {
            System.out.println(i);
        }

        //Циклы. Часть 1.  Домашнее задание -2. Задание 1
        System.out.println("Циклы. Часть 1.  Домашнее задание -2. Задание 1");
        for (int i = 1904; i <= 2096; i=i + 4) {
            System.out.println(i + " год является високосным");
        }


        //Циклы. Часть 1.  Домашнее задание -2. Задание 2
        System.out.println("Циклы. Часть 1.  Домашнее задание -2. Задание 2");

        for (int i = 7; i <= 98; i=i + 7) {
            System.out.println(i);
        }

        //Циклы. Часть 1.  Домашнее задание -2. Задание 3
        System.out.println("Циклы. Часть 1.  Домашнее задание -2. Задание 3");
        for (int i = 1; i <= 512; i=i * 2) {
            System.out.println(i);
        }

        //Циклы. Часть 1.  Домашнее задание -3. Задание 1
        System.out.println("Циклы. Часть 1.  Домашнее задание -3. Задание 1");
        float deposit = 29000f;
        float total = 0f;
        for (int i = 1; i <=12; i++) {
            total = total + deposit;

            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей" );
        }

        //Циклы. Часть 1.  Домашнее задание -3. Задание 2
        System.out.println("Циклы. Часть 1.  Домашнее задание -3. Задание 2");
        deposit = 29000;
        total = 0;
        for (int i = 1; i <=12; i++) {
            total= total + total/100;
            total = total + deposit;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + String.format("%.2f", total) + " рублей" );
        }

    }
    }
