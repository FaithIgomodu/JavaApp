/*
Class Name: Java Biotechnology
Homework assignment#2, question# 3
File name: Complement
Program author name: Faith Igomodu
*/



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Complement {
    public static void main(String[] args){

        Map<Character, Character> complements = new HashMap<>();

        complements.put('A', 'T');
        complements.put('C', 'G');
        complements.put('T', 'A');
        complements.put('G', 'C');

        Scanner inPut = new Scanner(System.in);
        System.out.println("Enter DNA Sequence To Compute Its Complement");
        String userInput = inPut.nextLine();
        System.out.println("The DNA sequence is:"+ " \n"+ userInput + " \n");

        StringBuilder compStrand = new StringBuilder();

        for(char c: userInput.toCharArray()){
            char upperC = Character.toUpperCase(c);
            char compLement = complements.getOrDefault(upperC, upperC);
            compStrand.append(compLement);

        }

        System.out.println( " \n"+ "The DNA sequence is and Its Complement:"+
                " \n"+ userInput + "\n" + compStrand);




    }
}
