package com.company.Lesson7_22;

public class Main {

    public static void main(String[] args) {

        //22. Design a class DistanceConverter
        //methods
        //- convertMilesToMeters
        //- convertMetersToMiles
        //- convertInchToCentimeter
        //- convertCentimeterToInch

        DistanceConverter distanceConverter = new DistanceConverter();

        System.out.println("5 miles is: " + distanceConverter.convertMilesToMeters(5) + " meters.");
        System.out.println("100 meters is: " + distanceConverter.convertMetersToMiles(100) + " miles.");

        System.out.println("5 inchs is: " + distanceConverter.convertInchToCentimeter(5) + " centimeter");
        System.out.println("20 centimeter is: " + distanceConverter.convertCentimeterToInch(20) + " inch");

    }

}
