package com.jacksonpengelly.SortingAStringArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String ss[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra",
        "Herman"};

        Arrays.sort(ss);

        for (String name : ss) {
            System.out.println(name);
        }
    }
}
