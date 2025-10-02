
/*
Author:Faith Igmodu
Assignment: Week six in class exercise
Date: 9/18/2025
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;



//DNA class with id and seq properties
class DNAOBJECT {
    //seq id
    public int id;
    //dna seq
    public String seq;


    //DNA class constructor
    public DNAOBJECT(String seq, int id) {
        this.id = id;
        this.seq = seq;

    }
}

public class DnaValidate {

    //Method checks if input is valid DNA sequence
    public static boolean isDNAvalid(String seq) {

        //Make seq case-insensitive by converting to uppercase
        String sequence = seq.toUpperCase();
        //Created regular expression pattern that matches one or more ATGC characters
        String regex = "[ATGC]+";

        //Compile regular expression into a pattern object. Creates a reusable pattern
        Pattern p = Pattern.compile(regex);
        //Created a matcher object  that will match the pattern p against the sequence
        //Object that completes pattern matching
        Matcher m = p.matcher(sequence);
        //Uses matches method (built in from the String class ) to check if the entire sequence matches the pattern
        //return true only if ATGC are found in sequence.
        boolean b = m.matches();

        return b;
    }


    public static void main(String[] args){
        //Create DNA seq object with unique id and sequence
        DNAOBJECT dnaSeq = new DNAOBJECT("ATGCTTTACGTTTTACTGCCCTAAATCGATGCATGCATGACTGAAC", 985632514);
        //Validate DNA seq object using isDNAvalid method
        boolean validate = isDNAvalid(dnaSeq.seq);
        //Display sequence
        System.out.println("Sequence:"+ dnaSeq.seq);
        //Display results
        if(validate == true){
            System.out.println("Is valid");
        }else
            System.out.println("Is not valid ");

        //Author
        System.out.println("Author:Faith igomodu");

    }
}
