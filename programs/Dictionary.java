/*
Sam Freund
Section 401
This program creates a dictionary of words
I used a linked list, since I feel that it's easier and fits better in this circumstance
 */

import java.util.LinkedList;

import utils.FastReader;
import utils.Validator;

public class Dictionary {
    public static FastReader in = new FastReader();
    public static LinkedList<String> words = new LinkedList<String>();

    public static void main(String[] args) {
        words.clear();
        System.out.println("Welcome to WordList!\n--------------------");

        while(true){
            System.out.println();
            switch(menuChoice()){
                case 1:
                addWord();
                continue;

                case 2:
                removeWord();
                continue;

                case 3:
                printWords();
                continue;

                case 4:

                break;
            }
            break;
        }
    }

    private static void printWords(){
        for(String word : words){
            System.out.print(word + " ");
        }
        System.out.println();
    }

    private static boolean removeWord(){
        System.out.print("Enter a word to remove: ");
        String word = in.next();

        if(!words.remove(word)){
            System.out.println(word + " does not exist");
            return false;
        }

        System.out.println(word + " removed");
        return true;
    }

    private static boolean addWord(){
        System.out.print("Enter a word to add: ");
        String word = in.next();

        if(findWord(word) != -1){
            System.out.println(word + " already exists");
            return false;
        }

        words.add(word);
        System.out.println(word + " added");
        return true;
    }

    private static int findWord(String word){
        return words.indexOf(word);
    }

    private static int menuChoice() {
        System.out.println("1. Add Word\n2. Remove Word\n3. Print Words\n4. Quit");
        return Validator.getValidatedInput("Choose an option(1-4): ", 1, 4);
    }
}
