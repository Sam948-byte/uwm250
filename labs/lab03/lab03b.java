/*
Sam Freund
Section 401
This program converts a temperature in Celsius to Fahrenheit.
 */

package lab03;

import java.util.Scanner;

public class lab03b{
    public static void main(String[] args) {
        //instantiate scanner
        Scanner in = new Scanner(System.in);

        //prompt user for temperature
        System.out.println("Enter the temperature in Celsius: ");

        //store temperature in variable
        double celsius = in.nextDouble();

        in.close();

        //convert temperature to celsius
        double fahrenheit = (celsius * 9 / 5) + 32;

        //print results
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
    }
}