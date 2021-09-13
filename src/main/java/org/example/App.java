/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double width;
        double length;
        double area;
        final double GALLON = 350;

        Scanner input = new Scanner(System.in);

        System.out.print("Length? ");
        length = input.nextDouble();

        System.out.print("Width? ");
        width = input.nextDouble();

        area = length * width;
        double howMuchPaint = Math.ceil(area/GALLON);

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", howMuchPaint, area);
    }
}