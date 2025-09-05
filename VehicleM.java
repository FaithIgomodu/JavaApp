/*
Author: Faith Igomodu
Date: 8/1/2025
*/


//Vehicle class
class Vehicle{
    //number of passengers a car can  have
    int passengers;
    //fuel capacity of a car
    int fuelcap;
    //fuel consumption in mpg
    int mpg;

    //Vehicle parameterized constructor
    //This constructor will initialize the instance variables of the Vehicle class
    public Vehicle (int p, int f, int m) {
        this.passengers = p;
        this.fuelcap = f;
        this.mpg = m;
    }

    //method returns range
    int range(){
        return mpg*fuelcap;
    }

    //method calculates fuel needed
    double fuelNeeds(int miles){
        return (double) miles/mpg;
   }
}

public class VehicleM {
    public static void main(String[] args){

        //Variable declaration
        double sportGallons;
        double miniGallons;

        int distanceTG = 252;

        //make vehicles
        Vehicle minivan   = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);

        //Calls the method fuels needed and calculates gallons needed
        miniGallons = minivan.fuelNeeds(distanceTG);


        System.out.println("To go"+  " " +distanceTG+  " " +  "miles minivan needs" +
                "  " + miniGallons +"  " + "gallons of fuel.");

        //Calls the method fuels needed and calculates gallons needed
        sportGallons = sportcar.fuelNeeds(distanceTG);

        System.out.println("To go" + " " + distanceTG+ " " +"miles sportcar needs"+
                " " + sportGallons + " " + "gallons of fuel.");
    }
}
