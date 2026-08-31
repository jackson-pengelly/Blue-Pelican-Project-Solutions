package com.jacksonpengelly.WhatsThatDiameter;

public class Circle {
    private double radius; // a state variable for the radius of the circle

    // constructor with the argument radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // this is a method called diameter, which returns the diameter as a double
    public double diameter() {
        return radius * 2;
    }

    // this is a method called area
    public double area() {
        return Math.PI * Math.pow(radius, 2); // this returns a value that can be store in a variable when the function is called
    }

    // this is a method called circumference
    public double circumference() {
        return 2 * Math.PI * radius; // returns the circumference
    }

    // a setter method for the radius of the circle. The void return type means the function does not return a value
    public void setRadius(double radius) {
        this.radius = radius; // set the radius of this circle to the radius in the parameters
    }
}
