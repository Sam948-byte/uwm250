package programs;

import utils.FastReader;

public class Roulette {
    FastReader in = new FastReader();

    public static class User {
        private int money;

        public User(int money) {
            this.money = money;
        }

        public int returnMoney() {
            return money;
        }

        public void adjustBalance(int sum) {
            money += sum;
        }

        public int betColor(Wheel wheel) {
            String color = wheel.getColor();
            int num = wheel.getNumber();
            System.out.println("Spinng the wheel ...\nSpin number: " + num + "\nSpin color : " + color);

            int sum = utils.Validator.getValidatedInput("How much would you like to bet?[1-" + money + "]", 1, money);
            String bet = utils.Validator.getValidatedInput("What color would you like to bet on?[Red or Black]",
                    "red|black");

            adjustBalance(sum * ((bet.equals(color)) ? 1 : -1));
            return money;
        }

        public int betNumber(Wheel wheel) {
            String color = wheel.getColor();
            int num = wheel.getNumber();
            System.out.println("Spinng the wheel ...\nSpin number: " + num + "\nSpin color : " + color);

            int sum = utils.Validator.getValidatedInput("How much would you like to bet?[1-" + money + "]", 1, money);
            String bet = utils.Validator.getValidatedInput("What number would you like to bet on?[1-36]",
                    "[1-9]|[12][0-9]|3[0-6]");

            adjustBalance(sum * ((bet.equals(color)) ? 1 : -1));
            return money;
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

        int n;
        do {
            // TODO welcome
            n = Integer.parseInt(utils.Validator
                    .getValidatedInput("1. Pick a number to bet on\n2. Pick a color to bet on\n3. Cash out", "[123]"));

            if(n == 1){

            }else if(n == 2){
                
            }

        } while (n != 2);
    }

}