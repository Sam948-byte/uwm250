/*
Sam Freund
Section 401
This program determines a pitcher's earned run average
 */

import java.util.Scanner;

public class ERA{
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);

        //prompt input
        System.out.println("Enter the pitcher's first name, last name, earned runs, and innings pitched, all separated by spaces");

        //split input
        String[] input = in.nextLine().split(" ");

        //close input
        in.close();

        //print and calculate
        System.out.print(input[0] + " " + input[1] + " has an ERA of " + (double) Integer.parseInt(input[2]) * 9 / Integer.parseInt(input[3]));
    }
}