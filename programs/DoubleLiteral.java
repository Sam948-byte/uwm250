/*
Sam Freund
Section 401
This program takes a double literal and checks if it is valid
 */

import utils.FastReader;

public class DoubleLiteral {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        System.out.print("Please enter a valid (4 character) double literal: ");

        String input = in.next();

        System.out.println(
                input + " is " +
                        ((input.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)")) ? "" : "not ") +
                        "a valid (4 character) double literal");
    }
}