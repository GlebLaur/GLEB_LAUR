package org.example.homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args){
        //Задание нр.4
        System.out.println("Task nr.4:");
        int month = -1;
        switch(month){

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");

        }
        //Задание нр.5
        System.out.println("");
        System.out.println("Task nr.5:");
        int number = 0;
        for(number = 100; number <= 1000; number += 5){
            System.out.println(number);

        }
        //Задание нр.6
        double sum = 0;
        for (double x = 1; x != 99; x += 2) {
            sum = sum + (x / (x + 2));
        }
        System.out.println("");
        System.out.println("Task nr.6:");
        System.out.println("1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99 = " + sum);

        //Задание нр.7
        System.out.println("");
        System.out.println("Task nr.7:");
        int a, b, c = 1;
        for(a = 0; a != 9; a++){
            for(b = 0; b < c; b++){
                System.out.print("*");
            }
            c = c + 1;
            System.out.println();
        }
    }
}

