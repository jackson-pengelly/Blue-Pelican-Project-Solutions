package com.jacksonpengelly.EvenOrOdd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // prompt the user for an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); // read the integer

        if (num % 2 == 0) { // if the integer is even
            System.out.println("The integer " + num + " is even.");
        } else { // if the integer isn't even it's odd
            System.out.println("The integer " + num + " is odd.");
        }

        // close the scanner object to free resources
        scanner.close();
    }
}
