//gets and validates input with regex
package utils;

public class Validator {

    /**
     * Gets and validates input with regex
     * 
     * @param prompt
     * @param regex
     * @return String validated input
     */
    public static String getValidatedInput(String prompt, String regex) {
        FastReader in = new FastReader();
        String input;
        do {
            System.out.print(prompt);
            input = in.next();
        } while (!input.matches(regex));
        return input;
    }

    public static int getValidatedInput(String prompt, int min, int max) {
        FastReader in = new FastReader();
        Integer input;
        do {
            System.out.print(prompt);
            try {
                input = in.nextInt();
            } catch (Exception e) {
                input = null;
            }
        } while (input == null || input < min || input > max);
        return input;
    }
}