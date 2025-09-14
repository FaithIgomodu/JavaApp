/*
Class Name: Java Biotechnology
Homework assignment#2, questions# 1, 2
File name: GCPercent
Program author name: Faith Igomodu
*/



//DNA class with id, seq properties to calculate GC content 
class DNA {
    //DNA sequence id 
    int id;
    //DNA sequence 
   String seq;


    //DNA class constructor:
    //Seq - DNA sequences 
    //id - DNA sequence id 
    public DNA(String seq, int id) {
        this.id = id;
        this.seq = seq;
    }

    //Returns the length of DNA sequence 
    public int getSize(){
        return seq.length();
    }

    //Returns the count of a base by counting each base in the DNA sequence 
    public int baseCount(char base){        
        //Initialize counts to zero 
        int bCount =0;
        //Count each base in DNA sequence  using a for loop 
        for(int i =0; i< seq.length(); i++){
            //Convert each base to upper case for case insensativity 
            char bType = Character.toUpperCase(seq.charAt(i));
            //Counting matches to the bases 
            if(bType == Character.toUpperCase(base)){
                //Increase count for every match 
                bCount++;
            }
        }
        //Return base count 
        return bCount;

    }

}


//Main method that calculates GC content of a specific DNA sequence 
public class GCPercent {
    public static void main(String[] args){
       
        //Declare and initialize G and C counts to zero, for calculating GC percentage 
        int gCount = 0;
        int cCount = 0;
        //Created a DNA object with sequence and id for GC calculation  
        DNA mDNA = new DNA("ATGCTTTACGTTTTACTGCCCTAAATCGATGCATGCATGACTGAAC", 2548365);
        //baseCounts method is called and used to count number of G and C bases 
        gCount = mDNA.baseCount('G');
        cCount = mDNA.baseCount('C');
        //Gets the length of DNA sequence 
       int dnaLen = mDNA.getSize();
        //Calculate the GC percent of DNA sequence 
        double gcPercent = (gCount+cCount)*100.0 / dnaLen;
        //Display GC percentage to 2 decimal places and DNA sequence id 
        System.out.println("The GC Percent of DNA sequence :" + mDNA.id);
        System.out.printf("%.2f%n" , gcPercent);


    }
}
