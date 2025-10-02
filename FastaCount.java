import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FastaCount {
    public static void main(String[] args) {

        String line1;
        String header = "";
        String seq = "";

        //Create a BufferedReader to accept user input
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("-------------------Restriction Site Finder -----------------------");

            System.out.print("Enter the name of the sequence file:");
            String fastaFile = reader.readLine().trim();

            System.out.print("Enter the sequence of a restriction site:");
            String restrict = reader.readLine().toUpperCase().trim();
            //Ensure restriction site sequence patter is case insensitive
            Pattern restrictPattern = Pattern.compile("(" + restrict + ")", Pattern.CASE_INSENSITIVE);
            Path base = Paths.get(System.getProperty("user.home"), "BIFS618", "hw", "hw_03", "java_biotechnology");

            try (BufferedReader dnaSeq = Files.newBufferedReader(base.resolve(fastaFile))) {

                while ((line1 = dnaSeq.readLine()) != null) {
                    System.out.println(line1);
                    if (line1.startsWith(">")) {

                        header = line1.substring(1);
                        //Search for restriction sites in DNA sequence stored in line1
                    } else {

                        Matcher restrictMatcher = restrictPattern.matcher(line1);
                        if (restrictMatcher.find()) {
                            int matchStart = restrictMatcher.start();
                            int matchEnd = restrictMatcher.end();

                            System.out.println(line1);

                            //Create a visual marker line using * to identify the restriction site
                            StringBuilder line2 = new StringBuilder();
                            for(int i = 0; i<line1.length(); i++){
                                if(i >= matchStart && i< matchEnd){
                                    line2.append("*");
                                }else{
                                    line2.append(" ");
                                }
                            }
                            System.out.println(line2.toString());


                        }

                    }

                }
                System.out.println("Author: Faith Igomodu");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();


        }

    }
}