/* Week2 in-class exercise
   Name: Average_2.java
   Author: Faith Igomodu
   Date: 8/18/2025

*/

import java.util.Scanner;

public class Main {
    //Method calculates and returns the average grade
    public static double AVGCAL(double... grade) {
            //Variable declartion and instantiation
        //sum of grades
        double total = 0;
        //average grade
        double avg_grade = 0;
        //counts number of each grade
        double count = 0;

        //Calcuates sum of grades and counts each grade
        for (double val : grade) {
            total += val;
            count++;
        }

        avg_grade = total / count;

        return avg_grade;
    }


//Caller function that calls AVGCAL

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>Average Grade Calculator<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Enter 8 Grades Separated by a Comma ");

        String input = scanner.nextLine();
        String[] gradeS = input.split(",");

        double[] grades = new double[8];
        for (int i = 0; i < 8; i++) {
            grades[i] = Double.parseDouble(gradeS[i].trim());
        }

        double results = AVGCAL(grades);

        System.out.printf("Average grade is: %.2f%n ", results);

        if (results >= 75.0) {
            System.out.println("You PASSED! ");
        } else if (results < 75.0) {
            System.out.println("You FAILED! ");
        }


    }

}

