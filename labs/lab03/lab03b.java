/*
Sam Freund
Section 401
This program converts a temperature in Celsius to Fahrenheit.
 */

package lab03;

import utils.FastReader;

public class lab03b{
    public static void main(String[] args) {
        //instantiate IO
        FastReader in = new FastReader();

        //prompt user for temperature
        System.out.println("Enter the temperature in Celsius: ");

        //store temperature in variable
        double celsius = in.nextDouble();

        //convert temperature to celsius
        double fahrenheit = (celsius * 9 / 5) + 32;

        //print results
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
    }
}