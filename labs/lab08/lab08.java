/*
Sam Freund
Section 401
This program rolls dice and gives a list of how many times each result occurred
 */
package lab08;

import utils.FastReader;

public class lab08 {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        int input;
        do {
            System.out.print("\nEnter a number between 100 and 100000: ");
            input = in.nextInt();
        } while (!(99 < input) || !(input < 999999));

        int[] results = roll(input);

        System.out.print("v1: " + results[0] + "\nv2: " + results[1] + "\nv3: " + results[2] + "\nv4: " + results[3]);
    }

    public static int[] roll(int num) {
        int[] results = new int[4];

        for (int i = 0; i < num; i++) {
            results[utils.RandomGenerator.generate(4, 1) - 1]++;
        }

        return results;
    }
}