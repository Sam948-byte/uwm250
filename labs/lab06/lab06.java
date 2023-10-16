/*
Sam Freund
Section 401
This program acts as a cash register for an eyeglass store
 */

package lab06;

import utils.FastReader;

public class lab06 {

    public static final double[][] cost = {{52.50, 49.99}, {37.50, 34.99}};
    public static void main(String[] args) {
        FastReader in = new FastReader();

        System.out.println("What kind of glasses would you like:");
        int g;
        do {
            System.out.print("1 -> Prescription, 2 -> Non-Prescription: ");

        } while ((g = in.nextInt()) != 1 && g != 2);

        System.out.println("What kind of coating would you like:");
        int c;
        do {
            System.out.print("1 -> Anti-Glare, 2 -> Brown-Tint: ");
        } while ((c = in.nextInt()) != 1 && c != 2);

        System.out.println("Your cost is $" + cost[g-1][c-1] + ".");
    }
}