package com.jacksonpengelly.MixedResults;

public class Main {
    public static void main(String[] args) {
        // assign variables as specified in the project
        double d1 = 37.9;
        double d2 = 1004.128;
        int i1 = 12;
        int i2 = 18;

        // calculate the answers to the 5 equations
        double a1 = 57.2 * (i1 / i2) + 1;
        double a2 = 57.2 * ((double) i1 / i2) + 1;
        double a3 = 15 - i1 * (d1 * 3) + 4;
        int a4 = 15 - i1 * (int) (d1 * 3) + 4;
        int a5 = 15 - i1 * ((int) d1 * 3) + 4;

        // print all the answers
        System.out.println("Problem 1: " + a1);
        System.out.println("Problem 2: " + a2);
        System.out.println("Problem 3: " + a3);
        System.out.println("Problem 4: " + a4);
        System.out.println("Problem 5: " + a5);
    }
}
