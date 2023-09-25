/*
Sam Freund
Section 401
This program takes a users input and calculates the price of pens and notebooks
 */

package lab04;

import java.util.Scanner;

public class lab04{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //get user input
        System.out.print("Enter the number of pens: ");

        int pens = in.nextInt();

        System.out.print("Enter the number of notebooks: ");

        int notebooks = in.nextInt();

        in.close();

        //calculate prices
        double penPrice = pens * 0.50;

        double notebookPrice = notebooks * 1.00;

        double totalPrice = penPrice + notebookPrice;

        //print out the prices
        System.out.println("The price of " + pens + " pens is $" + penPrice);

        System.out.println("The price of " + notebooks + " notebooks is $" + notebookPrice);

        System.out.println("The total price is $" + totalPrice);

        //calculate tax
        double tax = totalPrice * 0.055;

        System.out.println("The tax is $" + tax);

        //calculate total price with tax
        double totalPriceWithTax = totalPrice + tax;

        System.out.println("The total price with tax is $" + totalPriceWithTax);
    }
}