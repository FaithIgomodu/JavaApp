/*
Author: Faith Igomodu
Course: java_biotechnology
Date: 9/5/2025
*/

//Instructions: Use randomseq.class file to generate random sequences and format it.

public class seq {
    public static void main(String[] args) {

        //Called class directly
        RandomSeq ranSeq = new RandomSeq();

        //generate random sequences
        String randomSeq = ranSeq.getRandomSeq(400);

        //what does the output look like
        System.out.println("Randomly Generated Sequence Without Format is:" + randomSeq+ " \n");

        //set sequence
        ranSeq.setSeq(randomSeq);
        // format sequence
        ranSeq.formatSeq(60);






    }
}