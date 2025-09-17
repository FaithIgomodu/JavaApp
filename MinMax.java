



public class MinMax {
    //Calculates min and max values in an array
    public static void main(String[] args){
        //declare variables
        int min, max;

        //creating to find  min and max values
        int [] num = { 99,-10,10123,18,-978,5623,463,-9,287,49};
        //linear search: both max and min are first value.
        min = max = num[0];
        //search through array to find min and max
        for(int i =1; i <10; i++){
            if(num[i] < min) min = num[i];
            if(num[i] > max) max = num[i];
        }
        System.out.println("Min Value:" +min+ "\n"+ "Max Value:"+max);
    }
}
