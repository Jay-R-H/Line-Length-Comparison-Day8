package com.programming;

import java.util.Scanner;

public class LineComparison {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Line length comparison computation program");

        }

    public double lengthOfLine(){
        System.out.println("Enter the co-ordinate x1");
        int x1= sc.nextInt();
        System.out.println("Enter the co-ordinate y1");
        int y1= sc.nextInt();
        System.out.println("Enter the co-ordinate x2");
        int x2= sc.nextInt();
        System.out.println("Enter the co-ordinate y2");
        int y2= sc.nextInt();

        double lengthOfLine =Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        return lengthOfLine;
    }
    public void compareOfTwoLines(){

        System.out.println("Enter the co-ordinates for the line-2");
        double length1 = lengthOfLine();
        System.out.println("Enter the co-ordinates for the line-2");
        double length2 = lengthOfLine();

        String s1 = String.valueOf(length1);
        String s2 = String.valueOf(length2);

        if (s1.equals(s2)){
            System.out.println("Both the lines are equal");
        }
        else {
            System.out.println("Lines are un-equal");
        }
    }
}














































































































