package com.jacksonpengelly.ComputeThis;

public class Main {
    public static void main(String[] args) {
        // solve both problems
        double d1 = 3 * Math.PI * Math.sin(Math.toRadians(187)) + Math.abs(Math.cos(Math.toRadians(122))); // convert angles to radians and use the constant Math.PI
        double d2 = Math.pow(14.72, 3.801) + Math.log(72); // Math.log uses the natural log (ln) to calculate

        // print solutions
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
    }
}
