package lab11;

import utils.RandomGenerator;

public class lab11 {
    public static int comparisons;

    public static void main(String[] args) {
        double[] scores = new double[10];
        // set all the scores to a random number [0 - 99]
        for (int i = 0; i < scores.length; ++i) {
            scores[i] = RandomGenerator.generate(0, 99);
        }
        // print the scores - original order
        System.out.println("Scores - Original");
        System.out.println("------------------");
        printArray(scores);
        System.out.println("\n");
        sortArray(scores);
        System.out.println("Sorting ...\n");
        // print the scores - sorted order
        System.out.println("Scores - Sorted");
        System.out.println("----------------");
        printArray(scores);
        System.out.println("\nNumber of Comparisons: " + comparisons);
    }

    public static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.println(num);
        }
    }

    public static int findMinLoc(double[] arr, int startInd, int endInd) {
        int minLoc = startInd;
        for (int i = startInd + 1; i <= endInd; ++i) {
            if (arr[i] < arr[minLoc]) {
                minLoc = i;
            }
            comparisons++;
        }
        return minLoc;
    }

    public static void swapInArray(double[] arr, int ind1, int ind2) {
        double tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }

    public static void sortArray(double[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int ind = findMinLoc(arr, i, arr.length - 1);
            swapInArray(arr, i, ind);
        }
    }
}