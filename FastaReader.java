import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FastaReader {
    public static void main(String[] args){
        String line ;
        int count =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the sequence file:");
        String fastaFile = input.nextLine().trim();
        //Have Path and Paths class resolve file location by using the getProperty() method.
        Path base = Paths.get(System.getProperty("user.home"), "BIFS618", "hw", "hw_03", "java_biotechnology");
        //Create a BufferedReader to read file contents
        try(BufferedReader dnaSeq = Files.newBufferedReader(base.resolve(fastaFile))) {
            System.out.println("-------------------FASTA File Counter -----------------------");
            //Read file contents and count number of DNA sequences
            while ((line = dnaSeq.readLine()) != null) {
                if(line.startsWith(">")){
                    count ++;
               }


            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println("File" +" " + fastaFile+ " " +"contains:" +" "+ count + " "+ "sequences.");
        System.out.println("Author: Faith Igomodu");
    }

}
