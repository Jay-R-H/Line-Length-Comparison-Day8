package com.programming;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line length comparison computation program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates for the line-1");
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();

        double lengthOfLine =Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
    }
}














































































































