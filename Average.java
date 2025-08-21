/* Week2 in-class exercise
   Name: Average.java
   Author: Faith Igomodu
   Date: 8/18/2025

*/

public class Average {

    public static void main(String[] args) {

        double grade1 = 76.0;
        double grade2 = 83.0;
        double grade3 = 62.0;


        //  TO DO:
        //
        //  a.  Compute and display the average grade
        double avg_grade = (grade1 + grade2 + grade3)/3;
        System.out.printf("The average grade is: %.1f", avg_grade);

        //  b.  Display a PASS/FAIL message
        //        average >= 75.0  PASS
        //        average <  75.0  FAIL

        System.out.println("\n"+ "Average >= 75.0 PASS" + "\n"+
                            "Average < 75.0 FAIL ");

    }
}
