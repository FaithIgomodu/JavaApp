/* Week2 in-class exercise
   Name: myName.java
   Author: Faith Igomodu
   Date:

*/

//import the Scanner class to get user input
import java.util.Scanner;
public class myName {

    public static void main(String[] args) {

        //  TO DO:
        //
        //  a. Create a new Scanner to get user input
        Scanner name = new Scanner(System.in);

        //  b. Prompt the user to get the name
        System.out.println("Enter your name");

        //  c. Get user's name input and assigned to a name variable
        String user_name = name.next();

        //  d. Display a welcome message, such as:
        //  "Hello, name, welcome to BIFS618!"
        System.out.println("Hello," + user_name + ", welcome to BIFS618!");


    }
}
