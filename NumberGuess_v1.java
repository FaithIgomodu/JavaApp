

/* Week3 in-class exercise
   Name: numberGuess_v1.java
   Author: Faith Igomodu
   Date: August 26, 2025

*/



import java.util.Scanner;

public class NumberGuess_v1 {

    /**
     * @param args none
     */
    public static void main(String[] args) {

        // a. declare a final int, and assign a value of 6 as the guessed number
        final int num = 6;
        // b. create a Scanner to get user input
        Scanner input = new Scanner(System.in);

        System.out.println("Number Guessing Game" + " ");
        // c. use a do {} while loop to prompt the user to enter an integer between 1 and 10,
        //    assign the user input to an int, and compare to the guessing number
        int userGuess;
        do {
            System.out.println("Pick a Number Between 1 and 10:");
            userGuess = input.nextInt();
            if (userGuess == num) {
                System.out.println("You Guessed Correctly");
            } else {
                System.out.println("You Guessed is Wrong. Try Again! " + " \n");
            }
        } while (userGuess != num);

    }


}

