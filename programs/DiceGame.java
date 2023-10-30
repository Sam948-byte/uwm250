/*
Sam Freund
Section 401
This program takes a users numerical input and prints out a pyramid of numbers
 */

import java.util.Arrays;

public class DiceGame {
    public static void main(String[] args) {
        System.out.println(
                "Let's play a dice game!\nIf you roll a quad, you win!\nIf you roll a triple, you win!\nIf you roll a two pair, you win!\nIf you roll a pair of fours, you win!\nOtherwise, you lose!\n");
        int wins = 0, losses = 0, rounds = 0;
        do {

            String result = rollDice();
            rounds++;

            if (result.equals("Loss")) {
                losses++;
            } else {
                wins++;
                result += " - WIN!";
            }

            System.out.println("A " + result);
        } while (utils.Validator.getValidatedInput(
                "Would you like to play again? y/n\n", "[yn]").equals("y"));

        System.out.println(
                "You played " + rounds + " rounds and won " + wins + " times and lost " + losses + " times.");
    }

    public static String rollDice() {
        int[] results = new int[4];

        System.out.println("Your roll is:");

        for (int i = 0; i < 4; i++) {
            results[i] = utils.RandomGenerator.generate(4, 1);
            System.out.print(results[i] + " ");
        }

        Arrays.sort(results);

        System.out.println();
        // check for four of a kind
        if (results[0] == results[1] && results[1] == results[2] && results[2] == results[3]) {
            return "Quad";
        }
        // check for three of a kind
        if (results[0] == results[1] && results[1] == results[2]
                || results[1] == results[2] && results[2] == results[3]) {
            return "Triple";
        }
        // check for two pair
        if (results[0] == results[1] && results[2] == results[3]) {
            return "TwoPair";
        }
        // check for pair of fours
        if (results[0] == results[1] && results[0] == 4
                || results[1] == results[2] && results[2] == 4
                || results[2] == results[3] && results[2] == 4) {
            return "HighPair";
        }
        return "Loss";

    }
}
