/*
Author: Faith Igomodu
Date: 8/16/2025
*/

//Import modules
import java.util.Scanner;

public class MoonWeight {
    //Function calculates a person effective weight on the moon
    public static void main(String[] args){
        //Variable Defintion
        float e_gravity = 9.8F;
        float m_gravity = 9.8f*0.17f;

        //Get user mass
        Scanner weight = new Scanner(System.in);
        System.out.println("Enter you weight:");
        int user_weight = weight.nextInt();
        float user_mass = user_weight/e_gravity;

        //Calculate user moon weight
        float user_moon_weight = user_mass*m_gravity;

        //print results
        System.out.println("You're Effective Weight On The Moon Is:" + user_moon_weight);

    }
}
