/*
Author: Faith Igomodu
Date: 8/12/2025
Demonstrates the difference between int and double
 */

public class Example2 {
    public static void main(String[] args){
        //Variable definition
        int v;
        double x;

        //Variable assignment
        v = 10;
        x = 10.0;

        System.out.println("The original vallue of v: " + v);
        System.out.println("The original vallue of x: " + x + "\n");

        //Divde values by 4
        v = v/4;
        x = x/4;

        System.out.println(" v after division: " + v);
        System.out.println(" x after division: " + x + "\n");
    }
}
