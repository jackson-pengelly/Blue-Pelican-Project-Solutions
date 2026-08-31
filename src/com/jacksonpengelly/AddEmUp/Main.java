package com.jacksonpengelly.AddEmUp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt user
        System.out.print("Enter something like 8 + 33 + 1,345 - 137 : ");
        String equation = scanner.nextLine();

        // scanner object for the equation
        Scanner stringScanner = new Scanner(equation);

        // total
        int sum = 0;

        // do addition part of equation
        stringScanner.useDelimiter("\\s*\\+\\s*");
        while (stringScanner.hasNext()) {
            String temp = stringScanner.next();

            // check if there is a - sign
            if (temp.contains("-")) {
                // if there is - evaluate that part
                Scanner subtractionScanner = new Scanner(temp);
                subtractionScanner.useDelimiter("\\s*\\-\\s*");

                int dif = subtractionScanner.nextInt(); // number being subtracted from
                while (subtractionScanner.hasNext()) {
                    dif -= subtractionScanner.nextInt(); // do the subtraction
                }
                sum += dif; // add the result to the sum
            } else {
                sum += Integer.parseInt(temp); // if there is no - sign just add to the sum
            }
        }

        // print the sum
        System.out.println("The sum is: " + sum);
    }
}
