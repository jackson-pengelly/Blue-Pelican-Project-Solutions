package com.jacksonpengelly.WhatsMyName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // prompt for the users first name
        System.out.print("What is your first name? ");
        String firstName = scanner.nextLine(); // read the first name

        // prompt for the users last name
        System.out.print("What is your last name? ");
        String lastName = scanner.nextLine(); // read the last name

        // print the firstname and the lastname concatenated
        System.out.println("Your full name is " + firstName + " " + lastName);

        // close the scanner object to free resources
        scanner.close();
    }
}
