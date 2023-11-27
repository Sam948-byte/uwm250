public class Lab10 {
    public static void main(String[] args) {
        int[] sized = { -51, -1, 5, 21, 36, 58, 64, 128, 256, 512, 1024};
        int[] sent = { 1, 3, 5, 7, 11, 13, 17, 0, 6, 8 };

        System.out.print("\nThe sized array:\n");
        printSizedArray(sized);

        System.out.print("\nThe same sized array reversed:\n");
        revArray(sized);
        printSizedArray(sized);

        System.out.print("\nThe sentinel terminated array:\n");
        printSentArray(sent, 0);

        System.out.print("\nThe same sentinel terminated array doubled:\n");
        doubArray(sent);
        printSentArray(sent, 0);

        System.out.println("");
    }

    public static void printSizedArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void printSentArray(int[] arr, int sentVal) {
        for (int i = 0; arr[i] != sentVal; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void revArray(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void doubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) break;
            arr[i] *= 2;
        }
    }
}