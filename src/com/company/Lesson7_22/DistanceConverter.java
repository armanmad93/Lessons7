package com.company.Lesson7_22;

public class DistanceConverter {

    public double convertMilesToMeters(int mile) {
        return mile * 1609.34;
    }

    public double convertMetersToMiles(int meter) {
        return meter / 1609.34;
    }

    public double convertInchToCentimeter(int inch) {
        return inch * 2.54;
    }

    public double convertCentimeterToInch(int centimeter) {
        return centimeter / 2.54;
    }

}
