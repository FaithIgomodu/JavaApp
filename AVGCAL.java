/* Week2 in-class exercise
   Name: Average_2.java
   Author: Faith Igomodu
   Date: 9/16/2025

*/

/* Week2 in-class exercise
   Name: Average_2.java
   Author: Faith Igomodu
   Date: 9/16/2025

*/

import java.util.Scanner;


public class AVGCAL {
    //Method calculates and returns the average grade
    public static double avgCal(double... grade) {

        double total = 0;
        double avg_grade = 0;
        double count = 0;

        for (double val : grade) {
            total += val;
            count++;
        }

        avg_grade = total / count;

        return avg_grade;
    }




    public static void main(String[] args) {
        //Create scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to enter grades
        System.out.println(">>>>>>>>>>>>>>>>>>Average Grade Calculator<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Enter 8 Grades Separated by a Comma ");

        //Read user input and split it into an array of strings
        String input = scanner.nextLine();
        String[] gradeS = input.split(",");

        //Convert grade strings to doubles and store in an array
        double[] grades = new double[8];
        for (int i = 0; i < 8; i++) {
            grades[i] = Double.parseDouble(gradeS[i].trim());
        }

        //Calculate the average grades
        double results = avgCal(grades);

        //Display the average grade
        System.out.printf("Average grade is: %.2f%n ", results);
        //Determine and display pass / fail
        if (results >= 75.0) {
            System.out.println("You PASSED! ");
        } else if (results < 75.0) {
            System.out.println("You FAILED! ");
        }


    }

}

