package com.bridgelabz;

import java.util.Scanner;

public class LineComparison extends Line1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first point coordinates of first line");
        Line1 obj1 = new Line1();
        System.out.println("Enter first number in first point: ");
        int a1 = sc.nextInt();
        obj1.getX1();
        int x1 = obj1.setX1(a1);
        System.out.println("Enter second number in first point: ");
        int b1 = sc.nextInt();
        obj1.getY1();
        int y1 = obj1.setY1(b1);
        System.out.println("Enter second point coordinates");
        System.out.println("Enter first number in second point: ");
        int a2 = sc.nextInt();
        obj1.getX2();
        int x2 = obj1.setX2(a2);
        System.out.println("Enter second number in second point: ");
        int b2 = sc.nextInt();
        obj1.getY2();
        int y2 = obj1.setY2(b2);
        double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        String len1 = String.valueOf(length1);

        System.out.println("Enter first point coordinates of Second line");
        System.out.println("Enter first number in first point: ");
        Line1 obj2 = new Line1();
        int p1 = sc.nextInt();
        obj2.getX1();
        int r1 = obj2.setX1(p1);
        System.out.println("Enter second number in first point: ");
        int q1 = sc.nextInt();
        obj1.getY1();
        int s1 = obj1.setY1(q1);
        System.out.println("Enter second point coordinates");
        System.out.println("Enter first number in second point: ");
        int p2 = sc.nextInt();
        obj1.getX2();
        int r2 = obj1.setX2(p2);
        System.out.println("Enter second number in second point: ");
        int q2 = sc.nextInt();
        obj1.getY2();
        int s2 = obj1.setY2(q2);
        double length2 = Math.sqrt(Math.pow((r2 - r1), 2) + Math.pow((s2 - s1), 2));
        String len2 = String.valueOf(length2);
        if(len1.compareTo(len2) == 0){
            System.out.println("Lines are equal");
        }else if(len1.compareTo(len2) > 0){
            System.out.println("First line length "+ length1 +" is greater than second line "+ length2);
        }else{
            System.out.println("Second line length "+ length2 + " is greater than first line "+ length1);
        }
    }
}
