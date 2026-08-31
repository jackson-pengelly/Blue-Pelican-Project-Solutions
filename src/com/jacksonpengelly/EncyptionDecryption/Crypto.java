package com.jacksonpengelly.EncyptionDecryption;

import java.util.Scanner;

public class Crypto {
    // constructor
    Crypto() {}

    public String encrypt(String message) {
        String result = "";

        Scanner scanner = new Scanner(message);
        scanner.useDelimiter("");

        while (scanner.hasNext()) {
            String temp = scanner.next();

            if (temp.equalsIgnoreCase("v")) {
                result += "ag',r";
            } else if (temp.equalsIgnoreCase("m")) {
                result += "ssad";
            } else if (temp.equalsIgnoreCase("g")) {
                result += "jeb..w";
            } else if (temp.equalsIgnoreCase("b")) {
                result += "dug>?/";
            } else {
                result += temp;
            }
        }
        return result;
    }

    public String decrypt(String encrypted) {
        // replace v's
        encrypted = encrypted.replaceAll("ag',r", "v");

        // replace m's
        encrypted = encrypted.replaceAll("ssad", "m");

        // replace g's
        encrypted = encrypted.replaceAll("jeb..w", "g");

        // replace b's
        encrypted = encrypted.replaceAll("dug>\\?/", "b");

        return encrypted;
    }
}
