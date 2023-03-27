package org.example.homework_nr_3;

public class Circle {
    double radius;
    double radius1;

    public static double calculateArea(double radius, double radius1) {
        double area = 3.14 * radius * radius1;
        return area;
        /*
        также здесь можно вместо вместо объявления переменной 'area',
        написать просто: return pi * radius * radius1;
         */
    }
    /*
    все переменные внутри метода являются изолированными.
    То есть им можно давать одинаковые названия
    */
    public static void main(String[] args) {
        double  ra;
        ra = calculateArea(15, 15);
        System.out.println("The area of the circle is: " + ra + "mm");

        //Task nr.6:
        Circle circle1 = new Circle(21, 21);
        System.out.println(calculateArea(circle1.radius, circle1.radius1));
        }

        //Task nr.5: Constructor
        Circle(double radius, double radius1) {
        this.radius = radius;
        this.radius1 = radius1;
    }
    }



