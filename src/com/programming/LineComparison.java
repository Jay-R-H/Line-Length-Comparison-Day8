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
        System.out.println("Enter the co-ordinates for the line-2");
        int X1= sc.nextInt();
        int Y1= sc.nextInt();
        int X2= sc.nextInt();
        int Y2= sc.nextInt();


        double lengthOfLine1 =Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        double lengthOfLine2 =Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));

        if (lengthOfLine1==lengthOfLine2){
            System.out.println("Both the lines are equal in length");
        }
    }
}














































































































