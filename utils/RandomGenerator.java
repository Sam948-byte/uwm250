package utils;

public class RandomGenerator{

    /**
     * generate a random number between a min and a max
     * 
     * @param min minimum value
     * @param max maximum value
     * 
     * @return randomly generated value
     */
    public static int generate(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

}