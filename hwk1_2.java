/*
Class Name: Java for Biotech
Homework assignment1, question2
File name:hwk1_2.java
Program author name: Faith Igomodu
Date: 8/20/2025
_______________________________________________________________________________________
*/

//Import modules
import java.util.Scanner;

public class hwk1_2 {
    // Function prints GenBank sequence identifier and DNA sequence in FASTA format
    public static void main(String[] args) {
        //Scanner object to obtain User input
        Scanner input = new Scanner(System.in);

        //prompt user for sequence identifier and store in variable
        System.out.println("Enter the sequence identifier:");
        String seqID = input.next();

        //prompt user for DNA sequence and store in variable
        System.out.println("Enter the DNA sequence:");
        String dnaSeq = input.next();

        //print sequence identifier use ">" as prefix . On new line, print DNA sequence
        System.out.println(">" +seqID + "\n" + dnaSeq);
    }
}


