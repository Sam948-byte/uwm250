/*
Sam Freund
Section 401
This program does a transaction at a cash register
 */

import java.util.Scanner;

public class lab09 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double curBal = 45.32;
        double amount;
        System.out.print("Please enter a amount to update account by $");
        amount = stdIn.nextDouble();
        System.out.print("\n");
        System.out.print("Customer's balance (before transaction) = $");
        System.out.println(curBal + "\n");
        System.out.print("Requested update amount = $");
        System.out.println(amount + "\n");
        double actAmount;
        actAmount = transaction(curBal, amount);
        curBal += actAmount;
        System.out.print("Actual update amount = $");
        System.out.println(actAmount + "\n");
        System.out.print("Customer's balance (after transaction) = $");
        System.out.println(curBal + "\n");
        System.out.println("\nThank you and good-bye!\n");
        stdIn.close();
    }

    public static double transaction(double bal, double amount) {
        return (amount < bal * -1) ? 0 : amount;
    }
}
