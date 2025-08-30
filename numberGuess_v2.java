

/* Week3 in-class exercise
   Name: numberGuess_v2.java
   Author: Faith Igomodu
   Date: August 26, 2025
*/


//Import modules
import java.util.Scanner;
import java.util.Random;

public class numberGuess_v2 {

    /**
     * @param args none
     */
    public static void main(String[] args) {

        // declare variables
        final int num;
        int minV, maxV;
        int userGuess;
        int ranGuess;
        int counter;

        //initialize variables
        minV = 1;
        maxV = 10;
        counter = 0;

        //Scanner class to obtain user input
        Scanner input = new Scanner(System.in);

        // random number class to generate random number
        Random ranNum = new Random();

        System.out.println("Number Guessing Game" + " ");
        // c. use a do {} while loop to prompt the user to enter an integer between 1 and 10,
        //    assign the user input to an int, and compare to the guessing number
        do {
            System.out.println("Pick a Number Between 1 and 10:");
            //store user guess in variable
            userGuess = input.nextInt();
            //count number of times user guessed
            counter++;

            //generate random number between 1 and 10
            ranGuess = ranNum.nextInt((maxV - minV) + 1) + minV;
            if (userGuess == ranGuess) {
                System.out.println("You Guessed Correctly");
            } else if (userGuess < ranGuess) {
                System.out.println("Your Guess is Low");
            }else{
                System.out.println("Your Guess is High. " + " \n");
            }
            } while (userGuess != ranGuess) ;

            System.out.println("You Guessed" +" "+ counter+ " "+ "Times");

        }
    }



