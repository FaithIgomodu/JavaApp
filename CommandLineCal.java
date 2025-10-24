
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
            System.out.println("You FAILED! ");
        }

        System.out.println("Author: Faith Igomodu");
    }

}

