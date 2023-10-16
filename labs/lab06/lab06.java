/*
Sam Freund
Section 401
This program acts as a cash register for an eyeglass store
 */

package lab06;

public class lab06 {

    // list of costs of glasses
    public static final double[][] cost = { { 52.50, 49.99 }, { 37.50, 34.99 } };

    public static void main(String[] args) {

        // solicit and validate type of glasses
        System.out.println("What kind of glasses would you like:");
        int g = Integer.parseInt(utils.Validator.getValidatedInput(
                "1 -> Prescription, 2 -> Non-Prescription: ", "[12]")) - 1;

        // solicit and validate type of coating
        System.out.println("What kind of coating would you like:");
        int c = Integer.parseInt(utils.Validator.getValidatedInput(
                "1 -> Anti-Glare, 2 -> Brown-Tint: ", "[12]")) - 1;

        // print cost
        System.out.println("Your cost is $" + cost[g][c] + ".");
    }
}