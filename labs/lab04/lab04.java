/*
Sam Freund
Section 401
This program takes a users input and calculates the price of pens and notebooks
 */

package lab04;

public class lab04 {
    public static void main(String[] args) {

        // get user input
        int pens = Integer.parseInt(utils.Validator.getValidatedInput("Enter the nuber of pens: ", "\\d+"));

        int notebooks = Integer.parseInt(utils.Validator.getValidatedInput("Enter the nuber of notebooks: ", "\\d+"));

        // calculate prices
        double penPrice = pens * 0.50;

        double notebookPrice = notebooks * 1.00;

        double totalPrice = penPrice + notebookPrice;

        // print out the prices
        System.out.println("The price of " + pens + " pens is $" + penPrice + "\nThe price of " + notebooks
                + " notebooks is $" + notebookPrice + "\nThe total price is $" + totalPrice);

        // calculate tax
        System.out.println("The tax is $" + totalPrice * 0.055);

        // calculate total price with tax
        System.out.println("The total price with tax is $" + totalPrice * 1.055);
    }
}