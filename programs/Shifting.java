/*
Sam Freund
Section 401
This program creates a bit string and evaluates it
 */

import utils.FastReader;

public class Shifting {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        String bitString = "";

        String n;
        // 0 -> Shift Left, Add 0
        // 1 -> Shift Left, Add 1
        // 2 -> Exit and Evaluate
        do {
            System.out.println("0 -> Shift Left, Add 0\n1 -> Shift Left, Add 1\n2 -> Exit and Evaluate");
            // Validate input
            do {
                System.out.print("Choose an option: ");
            } while ((n = in.next()).matches("[012]") == false);

            // Add to bit string
            if (n.matches("[0]")) {
                bitString += "0";
            } else if (n.matches("[1]")) {
                bitString += "1";
            }

            // Print current bit string
            System.out.println("Current bit string: " + bitString);

        } while (!n.matches("[2]"));

        // Evaluate bit string
        System.out.println(bitString + " = " + Integer.parseInt(bitString, 2));
    }
}