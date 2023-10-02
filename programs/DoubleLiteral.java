import utils.FastReader;

public class DoubleLiteral {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        System.out.print("Please enter a valid (4 character) double literal: ");

        String input = in.next();

        if(input.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)")){
            
        }

        System.out.println(
        input + " is " + 
        ((input.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)")) ? "" : "not ") + 
        "a valid (4 character) double literal"
        );
    }
}
