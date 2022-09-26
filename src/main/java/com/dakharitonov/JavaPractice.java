package com.dakharitonov;

public class JavaPractice {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;
        int c = 100;
        double d = 1.55;

        System.out.println(a * d);

        if (a > b && c == d){
            System.out.println("Успех");
        }
        else if (a != b && c < d) {
            System.out.println("Успех");
        }
        else {
            System.out.println("Провал");
        }

        int number = 5;
        switch (number){
            case 2:
                System.out.println("2");
                break;
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("Неверное число");
        }

        //Переполнение
        System.out.println(500 * 5 * 1000000000);

    }
}