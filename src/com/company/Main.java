package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Введите первую сторону прямоугольника ");
//        double firstSide = Double.parseDouble(br.readLine());
//        System.out.print("Введите вторую сторону прямоугольника ");
//        double secondSide = Double.parseDouble(br.readLine());
//
//        GetTriangleData(firstSide, secondSide);
//
//        GetSideValue(36);
//
//        System.out.print("a ");
//        double a = Double.parseDouble(br.readLine());
//        System.out.print("b ");
//        double b = Double.parseDouble(br.readLine());
//        System.out.print("c ");
//        double c = Double.parseDouble(br.readLine());
//
//        task4_1(a, b, c);
//
        System.out.print("x ");
        double x = Double.parseDouble(br.readLine());

        System.out.print("y ");
        double y = Double.parseDouble(br.readLine());
//
//        task4_2(x);
//        task4_3(x, y);
//        task4_4(x, y);
        task4_5(x, y);
//        task4_6(x, y);





    }

    public static String equation(int a, int b, int c) {
        int D = (int) Math.pow(b, 2) - 4 * a * c;

        if(D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            return "Два корня: x1 = " + x1 + "; x2 =" + x2 ;
        } else if(D == 0) {
            double x = -b / (2 * a);

            return "Один корень: x = " + x;
        } else {
            return "Корней нет";
        }
    }

    public static void GetTriangleData(double firstValue, double secondValue) {
        double perimeter = firstValue * firstValue + secondValue * secondValue;
        double square = firstValue * secondValue;

        System.out.println("Периметр прямоугольника: " + perimeter);
        System.out.println("Площадь прямоугольника: " + square);
    }

    public static void GetSideValue(double perimeter) {
        double side = perimeter / 4;

        System.out.println(side);
    }

    public static void task4_1(double a, double b, double c) {
        double answer = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, 2);

        System.out.println(answer);
    }

    public static void task4_2(double x) {
        double answer = x - Math.pow(x, 3) / 3 + Math.pow(x, 5) / 5;

        System.out.println(answer);
    }

    public static void task4_3(double x, double y) {
        double answer = (x + y) / (y + 1) - (x * y - 12) / (34 + x);

        System.out.println(answer);
    }

    public static void task4_4(double x, double y) {
        double answer = Math.sin(Math.sqrt(x + 1)) - Math.sin(Math.sqrt(x - 1));

        System.out.println(answer);
    }

    public static void task4_5(double x, double y) {
        double answer = Math.pow((1 - Math.tan(x)), 1.0 / Math.tan(x)) + Math.cos(x - y);

        System.out.println(answer);
    }

    public static void task4_6(double x, double y) {
        double answer = Math.log(Math.abs((y - Math.sqrt(Math.abs(x)))) * (x - (y / (x + (Math.pow(x, 2) / 4)))));

        System.out.println(answer);
    }
}
