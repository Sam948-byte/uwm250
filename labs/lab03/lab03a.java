/*
Sam Freund
Section 401
This program converts a temperature in Fahrenheit to Celsius.
 */

package lab03;

public class lab03a {
    public static void main(String[] args) {
        double fahrenheit = Double.parseDouble(
                utils.Validator.getValidatedInput("Enter the temperature in Fahrenheit: ", ""));
    

        // print results
        System.out.println(fahrenheit + " degrees Fahrenheit is " + (fahrenheit - 32) * 5 / 9 + " degrees Celsius.");
    }
}