/*
Class Name: Java for Biotech
Homework assignment1, question4
File name:hwk1_4.java
Program author name: Faith Igomodu
Date: 8/20/2025
________________________________________________________________________________________
*/

/*
Psuedocode
prompt user to enter 10 integers
count, the number of integers using counter
store integers in variable number
use a for loop for search for largest and store in variable largest
 */


import java.util.Scanner;

public class hwk1_4 {
    public static void main (String[] args){
        //Declare variables
        int counter;
        int number ;
        int largest;

        //initialize variable
        largest =0;


        Scanner value = new Scanner(System.in);

        //obtain 10 intergers from user and store in a variable
        for (counter = 0; counter < 10; counter++ ){
            System.out.println("Enter value" +(counter +1) + ":");
            number = value.nextInt();

            // find largest value
            if (number > largest ){
                largest = number;
            }

        }
        //Display largest number
        System.out.println("The largest number is:" + largest);
        value.close();
    }
}
