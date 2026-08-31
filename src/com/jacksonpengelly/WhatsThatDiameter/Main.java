package com.jacksonpengelly.WhatsThatDiameter;

public class Main {
    public static void main(String[] args) {
        // instantiate a new circle object
        Circle circle = new Circle(35.5);

        // call the diameter method which returns the diameter of the circle
        System.out.println(circle.diameter());
    }
}
