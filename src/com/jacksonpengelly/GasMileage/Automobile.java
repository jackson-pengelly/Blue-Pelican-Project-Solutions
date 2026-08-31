package com.jacksonpengelly.GasMileage;

public class Automobile {
    public double mpg; // miles per gallon
    public double gallons; // gallons in the tank

    // constructor
    public Automobile(double mpg) {
        this.mpg = mpg;
        this.gallons = 0;
    }

    // method called fillUp, doesn't return anything
    public void fillUp(int gallons) {
        this.gallons += gallons;
    }

    // method called takeTrip, doesn't return anything
    public void takeTrip(int miles) {
        gallons -= (miles / mpg);
    }

    // method called reportFuel, returns gallons
    public double reportFuel() {
        return gallons;
    }
}