/*
Sam Freund
Section 401
This program takes a users input and recommends a restaurant
 */

//NOTE  all inputs assume that if the input is not 'y' it is 'n'

package lab05;

import utils.FastReader;

public class lab05 {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        //define restaurants
        String[] restaurants = {"Joe's Diner", "Chez Paris", "Alberto's Tacqueria", "Thai Garden Palace", };
    
        //get spicy
        System.out.println("Do you like it spicy? y/n");

        int spicy = (in.next().equals("y")) ? 1 : 0;

        //get fancy
        System.out.println("Do you like it fancy? y/n");

        int fancy = (in.next().equals("y")) ? 1 : 0;

        //print out recommendation
        System.out.println("I recommend you go to " + restaurants[2*spicy + fancy]);
    }

   
}