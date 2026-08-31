package com.jacksonpengelly.WeightOnOtherPlanets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // prompt user for the weight on earth
        System.out.print("What is your weight on the Earth? ");
        double weight = scanner.nextDouble(); // read their weight as a double

        // present the selection menu of planets
        System.out.println("1. Voltar");
        System.out.println("2. Krypton");
        System.out.println("3. Fertos");
        System.out.println("4. Servontos");
        System.out.print("\n\tSelection? ");
        int selection = scanner.nextInt(); // read their selection as an integer

        // use a switch statement based on selection
        switch (selection) {
            case 1: // if the selection is equal to 1 (Voltar) do this case
                System.out.println("Your weight on Voltar would be " + (weight * 0.091));
                break; // break out of the switch
            case 2:
                System.out.println("Your weight on Krypton would be " + (weight * 0.720));
                break;
            case 3:
                System.out.println("Your weight on Fertos would be " + (weight * 0.865));
                break;
            case 4:
                System.out.println("Your weight on Servontos would be " + (weight * 4.612));
                break;
            default: // in case the user inputs a number that wasn't in our menu
                System.out.println("Invalid selection.");
                break;
        }
    }
}
