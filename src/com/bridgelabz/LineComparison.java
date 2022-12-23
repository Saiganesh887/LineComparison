package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first point coordinates");
        System.out.println("Enter first number in first point: ");
        int x1 = sc.nextInt();
        System.out.println("Enter second number in first point: ");
        int y1 = sc.nextInt();
        System.out.println("Enter second point coordinates");
        System.out.println("Enter first number in second point: ");
        int x2 = sc.nextInt();
        System.out.println("Enter second number in second point: ");
        int y2 = sc.nextInt();
        double x = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Length of line is: "+x);
    }
}
