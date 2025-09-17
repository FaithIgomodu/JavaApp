
/*
Class Name: Study
File name: BubbleSort
Program author name: Faith Igomodu
*/


public class BubbleSort {
    public static void main(String[] args) {

        //variable declaration
        int a, b, t;
        int size;
        //number of values to be sorted
        size =10;

        //creating to find  min and max values
        int[] num = {99, -10, 10123, 18, -978, 5623, 463, -9, 287, 49};

        //display the unsorted array
        System.out.println("Unsorted array:");
        for(int i =1; i < size; i++)
            System.out.println("" +num[i]);

        //Bubble sort algorithm
        //outer loop controls number of iterations through loop
        for(a = 1; a < size ; a++)
            //inner loop compares and swaps
            for(b = size-1; b>= a; b--){
                //checks if elements are in correct order
                if(num[b-1] > num[b]){
                    //swap values if they are in the wrong order
                    t = num[b-1];
                    num[b-1]= num[b];
                    num[b] =t;
                }
            }
            //display sorted array
            System.out.println("Sorted Array:");
            for(int i =0; i < size; i++)
                System.out.println("" + num[i]);


    }
}
