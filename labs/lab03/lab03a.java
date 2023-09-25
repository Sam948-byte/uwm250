/*
Sam Freund
Section 401
This program converts a temperature in Fahrenheit to Celsius.
 */

package lab03;

import java.util.Scanner;

public class lab03a{
    public static void main(String[] args) {
        //instantiate scanner
        Scanner in = new Scanner(System.in);

        //prompt user for temperature
        System.out.println("Enter the temperature in Fahrenheit: ");

        //store temperature in variable
        double fahrenheit = in.nextDouble();

        in.close();

        //convert temperature to celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        //print results
        System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
    }
}