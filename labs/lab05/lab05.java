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
        String[] restaurants = {"Thai Garden Palace", "Joe's Diner", "Alberto's Tacqueria", "Chez Paris"};
    
        //get spicy
        System.out.println("Do you like it spicy? y/n");

        boolean spicy = (in.next().equals("y")) ? true : false;

        //get fancy
        System.out.println("Do you like it fancy? y/n");

        boolean fancy = (in.next().equals("y")) ? true : false;

        //print out recommendation
        System.out.println("I recommend you go to " + pickRestaurant(restaurants, spicy, fancy));
    }

    public static String pickRestaurant(String[] restaurants, boolean spicy, boolean fancy) {
        String restaurant = "";

        //pick restaurant off bools and restaurants array
        if (spicy && fancy) {
            restaurant = restaurants[0];
        } else if (!spicy && !fancy) {
            restaurant = restaurants[2];
        } else if (spicy && !fancy) {
            restaurant = restaurants[3];
        } else {
            restaurant = restaurants[1];
        }

        return restaurant;
    }
}