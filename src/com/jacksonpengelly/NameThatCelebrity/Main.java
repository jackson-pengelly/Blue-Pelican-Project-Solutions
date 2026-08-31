package com.jacksonpengelly.NameThatCelebrity;

public class Main {
    public static void main(String[] args) {
        // define variables for the celebrity names
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";

        // print substrings without the first 2 characters and the last 3 characters of the names
        System.out.println(s1.substring(2, s1.length() - 3));
        System.out.println(s2.substring(2, s2.length() - 3));
        System.out.println(s3.substring(2, s3.length() - 3));
    }
}
