/*
Class Name: Java Biotechnology
Homework assignment#2, questions# 1, 2
File name: GCPercent
Program author name: Faith Igomodu
*/

import java.util.ArrayList;
import java.util.List;

//DNA class with id, seq properties
class DNA {
    int id;
   String seq;


    //DNA class constructor
    public DNA(String seq, int id) {
        this.id = id;
        this.seq = seq;
    }

    //method for seq length
    public int getSize(){

        int  seqLen =0;

        for(int i =0; i <seq.length(); i++){
            seqLen++ ;
        }

        return seqLen;
    }

    //method for counting bases in seq
    public int baseCount(char base){
        this.seq = seq;
        int bCount =0;

        for(int i =0; i< seq.length(); i++){
            char bType = Character.toUpperCase(seq.charAt(i));
            if(bType == Character.toUpperCase(base)){
                bCount++;
            }
        }

        return bCount;

    }



}



public class GCPercent {
    public static void main(String[] args){
        //declare  variables

        int gCount = 0;
        int cCount = 0;


        DNA mDNA = new DNA("ATGCTTTACGTTTTACTGCCCTAAATCGATGCATGCATGACTGAAC", 2548365);


        gCount = mDNA.baseCount('G');
        cCount = mDNA.baseCount('C');



       int dnaLen = mDNA.getSize();


        double gcPercent = (gCount+cCount)*100.0 / dnaLen;
        System.out.println("The GC Percent of DNA sequence is:");
        System.out.printf("%.2f%n" , gcPercent);






    }
}
