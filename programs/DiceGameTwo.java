import java.util.Arrays;

public class DiceGameTwo {
    private static String[] possibleResults = {"You Lose!", "You Tie!", "You Win!"};
    public static void main(String[] args) {
        System.out.println("Let's play a dice game.");
          
        do {
              System.out.println(possibleResults[calculateWinner()]);
        // } while (utils.Validator.getValidatedInput("Would you like to play again? y/n", "[yn]").equals("y"));
        }while(true);
    }

    // returns true if player wins, false if computer wins
    public static int calculateWinner() {
        // get players roll
        int[] playerRoll = rollDice(true);
        // get computers roll
        int[] computerRoll = rollDice(false);

        int player = 0, playerHighest = 0, playerSecondHighest = 0;
        int computer = 0, computerHighest = 0, computerSecondHighest = 0;

        // check for three of a kind player
        if (playerRoll[0] == playerRoll[1] && playerRoll[1] == playerRoll[2]) {
            player = 2;
            playerHighest = playerRoll[2];
        } else if (playerRoll[0] == playerRoll[1]) {
            player = 1;
            playerHighest = playerRoll[0];
            playerSecondHighest = playerRoll[2];
        } else if (playerRoll[1] == playerRoll[2]) {
            player = 1;
            playerHighest = playerRoll[1];
            playerSecondHighest = playerRoll[0];
        } else if (playerRoll[0] == playerRoll[2]) {
            player = 1;
            playerHighest = playerRoll[2];
            playerSecondHighest = playerRoll[1];
        }

        // check for three of a kind computer
        if (computerRoll[0] == computerRoll[1] && computerRoll[1] == computerRoll[2]) {
            computer = 2;
            computerHighest = computerRoll[2];
        } else if (computerRoll[0] == computerRoll[1]) {
            computer = 1;
            computerHighest = computerRoll[0];
            computerSecondHighest = computerRoll[2];
        } else if (computerRoll[1] == computerRoll[2]) {
            computer = 1;
            computerHighest = computerRoll[1];
            computerSecondHighest = computerRoll[0];
        } else if (computerRoll[0] == computerRoll[2]) {
            computer = 1;
            computerHighest = computerRoll[2];
            computerSecondHighest = computerRoll[1];
        }

        if (player > computer || 
        player == computer && player == 3 && playerHighest > computerHighest ||
        player == computer && player == 1 && playerHighest > computerHighest ||
        player == computer && player == 1 && playerHighest == computerHighest && playerSecondHighest > computerSecondHighest) {
            return 2;
        } else if (player < computer ||
        player == computer && player == 3 && playerHighest < computerHighest ||
        player == computer && player == 1 && playerHighest < computerHighest ||
        player == computer && player == 1 && playerHighest == computerHighest && playerSecondHighest < computerSecondHighest) {
            return 0;
        } else {
            return 1;
        }

    }

    public static int[] rollDice(boolean who) {
        int[] results = new int[3];

        System.out.println(who ? "Your roll is:" : "The computer's roll is:");

        for (int i = 0; i < 3; i++) {
            results[i] = utils.RandomGenerator.generate(6, 1);
            System.out.print(results[i] + " ");
        }

        Arrays.sort(results);

        System.out.println();

        return results;

    }
}