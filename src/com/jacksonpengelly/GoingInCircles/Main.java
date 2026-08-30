package com.jacksonpengelly.GoingInCircles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the area? ");
        double area = scanner.nextDouble();

        double radius = Math.sqrt(area / Math.PI);
        System.out.println("Radius of the circle is " + radius);
    }
}
