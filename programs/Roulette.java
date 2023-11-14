package programs;

import utils.FastReader;

public class Roulette {
    FastReader in = new FastReader();

    public static class User {
        private int money;

        public User(int money) {
            this.money = money;
        }

        public int getMoney() {
            return money;
        }

        public void adjustBalance(int sum) {
            money += sum;
        }

        public boolean betColor(Wheel wheel) {
            String color = wheel.getColor();
            int num = wheel.getNumber();
            boolean win;

            int sum = utils.Validator.getValidatedInput("How much would you like to bet?[1-" + money + "]\n", 1, money);
            String bet = utils.Validator.getValidatedInput("What color would you like to bet on?[Red or Black]\n",
                    "Red|Black");

            System.out.println("Spinng the wheel ...\nSpin number: " + num + "\nSpin color : " + color);

            adjustBalance(sum * ((win = (bet.equals(color))) ? 1 : -1));
            return win;
        }

        public boolean betNumber(Wheel wheel) {
            String color = wheel.getColor();
            int num = wheel.getNumber();
            boolean win;

            int sum = utils.Validator.getValidatedInput("How much would you like to bet?[1-" + money + "]\n", 1, money);
            int bet = utils.Validator.getValidatedInput("What number would you like to bet on?[1-36]\n",
                    1, 36);

            System.out.println("Spinng the wheel ...\nSpin number: " + num + "\nSpin color : " + color);

            adjustBalance(sum * ((win = (bet == num)) ? 1 : -1));
            return win;
        }
    }

    public static class Wheel {

        public Wheel() {

        }

        /**
         * Returns color the wheel landed on
         * 
         * @return boolean true is red, false is black
         */
        public String getColor() {
            int n;
            return ((n = utils.RandomGenerator.generate(0, 36)) == 0) ? "Green" : (n % 2 == 0) ? "Red" : "Black";
        }

        /**
         * Gives the number that the wheel lands on
         * 
         * @return int number
         */
        public int getNumber() {
            return utils.RandomGenerator.generate(0, 36);
        }
    }

    public static void main(String[] args) {
        User player = new User(100);
        Wheel wheel = new Wheel();

        System.out.println(
                "############################\n# WELCOME TO ROULETTE #\n############################\n# NUMBER BETS PAYOUT: 35:1 #\n# COLOR BETS PAYOUT: 1:1 #\n############################\n");

        int n;
        String message = "";
        do {
            n = Integer.parseInt(utils.Validator
                    .getValidatedInput("1. Pick a number to bet on\n2. Pick a color to bet on\n3. Cash out\n",
                            "[123]"));

            if (n == 1) {
                message = (player.betNumber(wheel)) ? "Congrats, you win!" : "Sorry, you lost";
            } else if (n == 2) {
                message = (player.betColor(wheel)) ? "Congrats, you win!" : "Sorry, you lost";
            }

            if (n != 3) {
                System.out.println(message + "\nYou now have " + player.getMoney() + " chips");
            }

        } while (n != 3 && player.getMoney() != 0);

        System.out.println("Thanks for playing, you " + ((player.getMoney() == 100) ? "neither won nor " : "") + ((player.getMoney() > 100) ? "won" : "lost") + " a total of " + Math.abs((player.getMoney() - 100)) + " chips");
    }

}