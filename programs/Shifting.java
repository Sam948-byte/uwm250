/*
Sam Freund
Section 401
This program creates a bit string and evaluates it
 */

public class Shifting {
    public static void main(String[] args) {

        String bitString = "";
        String n;

        // 0 -> Shift Left, Add 0
        // 1 -> Shift Left, Add 1
        // 2 -> Exit and Evaluate
        while (true) {
            if ((n = utils.Validator.getValidatedInput(
                    "0 -> Shift Left, Add 0\n1 -> Shift Left, Add 1\n2 -> Exit and Evaluate\n", "[0-2]"))
                    .matches("[2]")) {
                break;
            } else {
                bitString += n;
            }

            // Print current bit string
            System.out.println("Current bit string: " + bitString);

        }

        // Evaluate bit string
        System.out.println(bitString + " = " + Integer.parseInt(bitString, 2));
    }
}