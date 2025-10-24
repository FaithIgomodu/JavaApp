/*
Class Name: Java for Biotechnology
Homework assignment3, question 1 and 2
File name: CodonTranslate.java
Program author name: Faith Igomodu
*/

//import classes
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Translation {

public static List <String> codon (String seq) {
    /*
    This method calculates the three-letter codon bases
    of a DNA sequence for three reading frames.
    */
    List<String> orfs = new ArrayList<>();


    //For loop restricts number of frame to 3
    for (int frame = 0; frame < 3; frame++) {
        //The codons are built using StringBuilder class
        StringBuilder thisORF = new StringBuilder();
        //Breaks the DNA sequence into three bases
        for (int i = frame; i <= seq.length() - 3; i += 3) {
            //Combines three bases
            String threebases = seq.substring(i, i + 3);
            //Adds space between each codon
            if (thisORF.length() > 0){
                thisORF.append(" ");
            }
            //Add the codons to the StringBuilder thisORF
            thisORF.append(threebases);
        }

        //If the DNA sequence is not equal to three bases, do not add it
        if(thisORF.length() >= 3){
                //Builds formatted strings that show codon for each frame and stores the string in a list orfs.
                orfs.add("Reading frame" + (frame  + 1) + " " +"codons are:" +"\n"+ thisORF.toString());


        }

    }
    //Return codons
    return orfs;
}

public static List <String> codon2aa  (String seq) {
    /*
    This method calculates the three-letter codon bases
    of a DNA sequence for three reading frames and translate each codon
    to an amino acid.
    */
        String[] codonTable = {
                "ATA:I", "ATC:I", "ATT:I", "ATG:M",
                "ACA:T", "ACC:T", "ACG:T", "ACT:T",
                "AAC:N", "AAT:N", "AAA:K", "AAG:K",
                "AGC:S", "AGT:S", "AGA:R", "AGG:R",
                "CTA:L", "CTC:L", "CTG:L", "CTT:L",
                "CCA:P", "CCC:P", "CCG:P", "CCT:P",
                "CAC:H", "CAT:H", "CAA:Q", "CAG:Q",
                "CGA:R", "CGC:R", "CGG:R", "CGT:R",
                "GTA:V", "GTC:V", "GTG:V", "GTT:V",
                "GCA:A", "GCC:A", "GCG:A", "GCT:A",
                "GAC:D", "GAT:D", "GAA:E", "GAG:E",
                "GGA:G", "GGC:G", "GGG:G", "GGT:G",
                "TCA:S", "TCC:S", "TCG:S", "TCT:S",
                "TTC:F", "TTT:F", "TTA:L", "TTG:L",
                "TAC:Y", "TAT:Y", "TAA:*", "TAG:*",
                "TGC:C", "TGT:C", "TGA:*", "TGG:W"
        };

    //Translated amino acid and codons are stored in a List.
    List<String> amino = new ArrayList<>();
    //Restricts translation to three frames
    for (int frame = 0; frame < 3; frame++) {
        //Builds the three letter codon
        StringBuilder thisORF = new StringBuilder();
        //Builds the translated amino acid
        StringBuilder aminoAcids = new StringBuilder();
        //Create three letter codon bases from DNA sequence
        for (int i = frame; i <= seq.length() - 3; i += 3) {
            String threebases = seq.substring(i, i + 3);
            //Separate the three letter codons using an ""
            //Separate amino acids using tab
            if (thisORF.length() > 0) {
                thisORF.append(" ");
                aminoAcids.append("\t");
            }
            thisORF.append(threebases);

            // Translate codon to amino acid
            //Sets the default value to N if amino acids is not found
            String aMino = "N";
            //Search codon table
            for (String c : codonTable) {
                //Check if the entry in the table starts with a codon and :
                if (c.startsWith(threebases + ":")) {
                    //If match is found, split entry by colon and extract the second part
                    aMino = c.split(":")[1];
                    //Once a match is found, exit the loop
                    break;
                }
            }
            //Add translated amino acids to the aminoAcids list.
            aminoAcids.append(aMino);
        }

        if (thisORF.length() >= 3) {
            amino.add("Reading frame "+ " " + (frame + 1) + " codons and amino acids are: " +
                "\n"+  thisORF.toString()+ "\n" + aminoAcids.toString()); }
    }
    //return amino acids list
    return amino;
}

    //Program reads a file with DNA sequence and calculates codon sequences

    public static void main(String[] args){

        String line ;

        //Have Path and Paths class resolve file location by using the getProperty() method.
        Path base = Paths.get(System.getProperty("user.home"), "BIFS618", "hw", "hw_03", "java_biotechnology");
        //Create a BufferedReader to read file contents
        try(BufferedReader dnaSeq = Files.newBufferedReader(base.resolve("hwk3.txt"))) {
            System.out.println("-------------------ORF Finder-----------------------");


            while ((line = dnaSeq.readLine()) != null) {
                System.out.println("The DNA sequence from file is: "+"\n"+ line +"\n");

                //Display three letter codons
                List <String> codons = codon(line);
                for(String c : codons){
                    System.out.println(c);
                    System.out.println();
                }
                //Display translated amino acid
                List <String> aa = codon2aa(line);
                for(String n : aa){
                    System.out.println(n);
                    System.out.println();}
            }



        } catch (IOException e) {
           e.printStackTrace();

       }


    }


}

