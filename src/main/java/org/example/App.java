package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the price of item 1: " );
        float item1Price = sc.nextInt();
        System.out.print( "Enter the quantity of item 1: ");
        int item1Qty = sc.nextInt();

        System.out.print( "Enter the price of item 2: " );
        float item2Price = sc.nextInt();
        System.out.print( "Enter the quantity of item 2: ");
        int item2Qty = sc.nextInt();

        System.out.print( "Enter the price of item 3: " );
        float item3Price = sc.nextInt();
        System.out.print( "Enter the quantity of item 3: ");
        int item3Qty = sc.nextInt();

        final float taxRate = 0.055f;

        float subtotal = item1Price * item1Qty +
                        item2Price * item2Qty +
                        item3Price * item3Qty ;

        float tax = subtotal * taxRate;
        float total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", total);
    }
}
