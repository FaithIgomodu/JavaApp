<<<<<<< HEAD
/* Week5 in-class exercise
   Name: CommandLineCal
=======
/* Week2 in-class exercise
   Name: Average_2.java
>>>>>>> fab7555 (Initial commit)
   Author: Faith Igomodu
   Date: 9/16/2025

*/

<<<<<<< HEAD


public class CommandLineCal{

    public static void main(String[] args) {
        //Check if an argument was passed
        if(args.length == 0){
            System.out.println("You did not input a value");
        }
        //Inform user of app use
        System.out.println("This is a Command Line Calculator. " +
                "Enter Any Number of grades and average grade " +
                "will be returned"+"\n");

        //Validate user input
        for(int i =0; i <args.length; i++){
            System.out.println("Grades Entered:" +  i+ ":" +args[i]);
        }

        //Convert String array to double array
        double[] grades = new double[args.length];
        for(int i = 0; i<args.length; i++){
            grades[i]= Double.parseDouble(args[i]);
        }


        //variable instantiation
        double total = 0;
        double avg_Grade = 0;

        //determine length of array grades
        double lenGrade = grades.length;

        //calculate sum of grades
        for(double val: grades){
            total += val;

        }

        //calculate average grade
        avg_Grade = total/lenGrade;


        //Display the average grade
        System.out.printf("\n"+"Average grade is: %.2f%n ", avg_Grade);
        //Determine and display pass / fail
        if (avg_Grade >= 75.0) {
            System.out.println("You PASSED! ");
        } else if (avg_Grade < 75.0) {
=======
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
>>>>>>> fab7555 (Initial commit)
            System.out.println("You FAILED! ");
        }

        System.out.println("Author: Faith Igomodu");
    }

}

<<<<<<< HEAD


=======
>>>>>>> fab7555 (Initial commit)
