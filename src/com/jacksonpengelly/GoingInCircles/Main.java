package com.jacksonpengelly.GoingInCircles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // prompt for the area of the circle
        System.out.print("What is the area? ");
        double area = scanner.nextDouble(); // read the area as a double

        double radius = Math.sqrt(area / Math.PI); // calculate the radius
        System.out.println("Radius of the circle is " + radius); // print the output

        // free resources from the scanner
        scanner.close();
    }
}
