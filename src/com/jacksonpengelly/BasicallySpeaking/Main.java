package com.jacksonpengelly.BasicallySpeaking;

public class Main {
    public static void main(String[] args) {
        // header (using printf for even spacing)
        System.out.printf("%s%15s%15s%15s%15s\n", "Decimal", "Binary", "Octal", "Hex", "Character");

        for (int i = 65; i < 91; i++) { // loop through all ascii values from A-Z
            // calculate all values to print out
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i);
            char ch = (char) i;

            System.out.printf("%d%15s%15s%15s%15c\n", i, binary, octal, hex, ch);
        }
    }
}
