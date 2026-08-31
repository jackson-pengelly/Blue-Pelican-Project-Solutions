package com.jacksonpengelly.NameReversal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declare a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // prompt the user for their name
        System.out.print("Please enter your name. ");

        // read the users name using scanner.nextLine() and convert it to lowercase using String.toLowerCase()
        String name = scanner.nextLine().toLowerCase();

        String result = "";
        for (int i = 1; i <= name.length(); i++) {
            result += name.substring(name.length() - i, name.length() - i + 1);
        }
        System.out.println(result);
    }
}
