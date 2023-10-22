/*
Sam Freund
Section 401
This program takes a users numerical input and prints out a pyramid of numbers
 */

package lab07;

public class lab07{
    public static void main(String[] args){
        int input = Integer.parseInt(utils.Validator.getValidatedInput("Enter a number between 1 and 9: ", "[1-9]"));

        for(int i = 1; i <= input; i++){
            for(int j = 1; j <= input - i; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}