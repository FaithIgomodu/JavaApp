/*
Class Name: Java for Biotech
Homework assignment1, question3
File name:hwk1_3.java
Program author name: Faith Igomodu
Date: 8/20/2025
_______________________________________________________________________________________
*/


public class hwk1_3 {
    public static void main(String[] args){
        //Define variables
        String plusStrand;
        String minusStrand;

        //Initialize variables
        plusStrand  = "ATGCTTGACC";
        minusStrand = "TACGAACTGG";

        //Print sequences to std.output
        System.out.println("The double-stranded DNA:"+"\n" + plusStrand +"\n"+ minusStrand+
                "\n"+ "In a vertical order:");

        //for loop to print DNA in vertical order
        for(int i =0 , j = 0; i < plusStrand.length() && j < minusStrand.length(); i++,j++){
            char pSeq = plusStrand.charAt(i);
            char mSeq = minusStrand.charAt(j);
            System.out.println(""+pSeq + mSeq);

        }
    }

}
