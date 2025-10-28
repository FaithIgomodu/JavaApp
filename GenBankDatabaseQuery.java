/*
Author: Faith Igomodu
Date: October 25, 2025
File name: GenBankDatabaseQuery
*/

//Import packages
import org.biojava.nbio.core.sequence.DNASequence;
import org.biojava.nbio.core.sequence.ProteinSequence;
import org.biojava.nbio.core.sequence.io.GenbankReaderHelper;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;


public class GenBankDatabaseQuery {

    public static void main(String[] args) {

        //Display program name.
        System.out.println("================ GenBank Database Query ===================== ");
        //Scanner object for user input.
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\n");
            System.out.println("Main Menu:");
            System.out.println("1. NM_001093840.1");
            System.out.println("2. 74006328");
            System.out.println("3. BC104456.1");
            System.out.println("4. CAH73655");
            System.out.println("5. 55665342");
            System.out.println("6. Exit ");

            System.out.println("Select an Accession ID Or GI number to Query GenBank Database");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    String idOne = "NM_001093840.1";
                    System.out.println("Query of GenBank Using NM_001093840.1 ");
                    //The NCBI E-utilities (e-fetch) URL for DNA ( nuccore) record.
                    String genbankURL1 = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi?" +
                            "db=nuccore&id=" + idOne +
                            "&rettype=gb&retmode=text";

                    //Define InputStream to hold the data retrieved from the web service.
                    InputStream instream1 = null;

                    try {
                        //A URL object for the E-fetch request.
                        URL genUrl1 = new URL(genbankURL1);
                        //Open a Connection to the NCBI server.
                        HttpURLConnection connect = (HttpURLConnection) genUrl1.openConnection();
                        connect.setRequestMethod("GET");

                        //Check for successful HTTP response (status code 200).
                        if (connect.getResponseCode() == 200) {
                            // Get the input stream from the successful connection to read the GenBank file content.
                            instream1 = connect.getInputStream();

                            // Use BioJava's GenbankReaderHelper to parse the GenBank format data from the stream.
                            // The result is a Map where the key is the accession ID and the value is the DNASequence object.
                            Map<String, DNASequence> dnaSequences = GenbankReaderHelper.readGenbankDNASequence(instream1);

                            // Retrieve the  DNASequence object from the map's values.
                            DNASequence genSeq = dnaSequences.values().iterator().next();

                            // Display key information extracted from the DNASequence object.
                            System.out.println("Sequence Accession ID:" + genSeq.getAccession());
                            System.out.println("Sequence Description:" + genSeq.getDescription());
                            System.out.println("Sequence:" + genSeq.getSequenceAsString());
                            System.out.println("GC Count:" + genSeq.getGCCount());

                            // Close the input stream to release system resources.
                            instream1.close();

                        } else {
                            // Handle HTTP connection errors.
                            System.out.println("Request Failed. Error Code:" + connect.getResponseCode());
                        }

                    } catch (Exception e) {
                        // Print the stack trace for any I/O or parsing exceptions.
                        e.printStackTrace();


                    }

                    break;

                case 2:
                    String idTwo = "74006328";
                    System.out.println("Query of GenBank Using 74006328");
                    String genbankURL2 = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi?" +
                            "db=nuccore&id=" + idTwo +
                            "&rettype=gb&retmode=text";

                    InputStream instream2 = null;

                    try {
                        URL genUrl2 = new URL(genbankURL2);
                        HttpURLConnection connect = (HttpURLConnection) genUrl2.openConnection();
                        connect.setRequestMethod("GET");

                        if (connect.getResponseCode() == 200) {
                            instream2 = connect.getInputStream();
                            Map<String, DNASequence> dnaSequences = GenbankReaderHelper.readGenbankDNASequence(instream2);

                            DNASequence genSeq = dnaSequences.values().iterator().next();

                            System.out.println("Sequence Accession ID:" + genSeq.getAccession());
                            System.out.println("Sequence Description:" + genSeq.getDescription());
                            System.out.println("Sequence:" + genSeq.getSequenceAsString());
                            System.out.println("GC Count:" + genSeq.getGCCount());

                            instream2.close();

                        } else {
                            System.out.println("Request Failed. Error Code:" + connect.getResponseCode());
                        }

                    } catch (Exception e) {
                        e.printStackTrace();


                    }
                    break;
                case 3:
                    String idThree = "BC104456.1";
                    System.out.println("Query of GenBank Using BC104456.1 ");
                    String genbankURL3 = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi?" +
                            "db=nuccore&id=" + idThree +
                            "&rettype=gb&retmode=text";


                    InputStream instream3 = null;

                    try {
                        URL genUrl3 = new URL(genbankURL3);
                        HttpURLConnection connect = (HttpURLConnection) genUrl3.openConnection();
                        connect.setRequestMethod("GET");

                        if (connect.getResponseCode() == 200) {
                            instream3 = connect.getInputStream();
                            Map<String, DNASequence> dnaSequences = GenbankReaderHelper.readGenbankDNASequence(instream3);

                            DNASequence genSeq = dnaSequences.values().iterator().next();

                            System.out.println("Sequence Accession ID:" + genSeq.getAccession());
                            System.out.println("Sequence Description:" + genSeq.getDescription());
                            System.out.println("Sequence:" + genSeq.getSequenceAsString());
                            System.out.println("GC Count:" + genSeq.getGCCount());

                            instream3.close();

                        } else {
                            System.out.println("Request Failed. Error Code:" + connect.getResponseCode());
                        }

                    } catch (Exception e) {
                        e.printStackTrace();


                    }

                    break;
                case 4:
                    String idFour = "CAH73655";
                    System.out.println("Query of GenBank Using CAH73655 ");
                    //The NCBI E-utilities (e-fetch) URL for protein record.
                    String genbankURL4 = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi?" +
                            "db=protein&id=" + idFour +
                            "&rettype=gp&retmode=text";

                    InputStream instream4 = null;

                    try {
                        URL genUrl4 = new URL(genbankURL4);
                        HttpURLConnection connect = (HttpURLConnection) genUrl4.openConnection();
                        connect.setRequestMethod("GET");

                        if (connect.getResponseCode() == 200) {
                            instream4 = connect.getInputStream();

                            // Use BioJava's GenbankReaderHelper to parse the GenBank format data from the stream.
                            // The result is a Map where the key is the accession ID and the value is the ProteinSequence object.
                            Map<String, ProteinSequence> proteinSequences = GenbankReaderHelper.readGenbankProteinSequence(instream4);
                            ProteinSequence proSeq = proteinSequences.values().iterator().next();

                            System.out.println("Sequence Accession ID:" + proSeq.getAccession());
                            System.out.println("Sequence Description:" + proSeq.getDescription());
                            System.out.println("Sequence:" + proSeq.getSequenceAsString());
                            System.out.println("Protein Length:" + proSeq.getLength());

                            instream4.close();

                        } else {
                            System.out.println("Request Failed. Error Code:" + connect.getResponseCode());
                        }

                    } catch (Exception e) {
                        e.printStackTrace();


                    }
                    break;
                case 5:
                    String idFive = "55665342";
                    System.out.println("Query of GenBank Using 55665342");
                    //The NCBI E-utilities (e-fetch) URL for protein record.
                    String genbankURL5 = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi?" +
                            "db=protein&id=" + idFive +
                            "&rettype=gp&retmode=text";

                    InputStream instream5 = null;

                    try {
                        URL genUrl5 = new URL(genbankURL5);
                        HttpURLConnection connect = (HttpURLConnection) genUrl5.openConnection();
                        connect.setRequestMethod("GET");

                        if (connect.getResponseCode() == 200) {
                            instream5 = connect.getInputStream();

                            // Use BioJava's GenbankReaderHelper to parse the GenBank format data from the stream.
                            // The result is a Map where the key is the accession ID and the value is the ProteinSequence object.
                            Map<String, ProteinSequence> proteinSequences = GenbankReaderHelper.readGenbankProteinSequence(instream5);
                            ProteinSequence proSeq = proteinSequences.values().iterator().next();

                            System.out.println("Sequence Accession ID:" + proSeq.getAccession());
                            System.out.println("Sequence Description:" + proSeq.getDescription());
                            System.out.println("Sequence:" + proSeq.getSequenceAsString());
                            System.out.println("Protein Length:" + proSeq.getLength());

                            instream5.close();

                        } else {
                            System.out.println("Request Failed. Error Code:" + connect.getResponseCode());
                        }

                    } catch (Exception e) {
                        e.printStackTrace();


                    }
                    break;
                case 6:
                    if(choice == 6){
                        System.out.println("Exiting GenBank Database Query");
                    }
                    break;

            }

        }

    }
}
