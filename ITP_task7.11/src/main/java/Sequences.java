import java.util.Random;

public class Sequences {

    public static int findAmountOfMonotoneSequences (int[] arr) {

        int amountOfMonotoneSequences = 0;
        boolean isDecreases = false;

        for (int i = 1; i < arr.length; i++) {
            if(!isDecreases && arr[i - 1] > arr[i]) {
                amountOfMonotoneSequences++;
                isDecreases = true;
            }

            if (isDecreases && (arr[i - 1] < arr[i] || arr[i - 1] == arr[i])) {
                isDecreases = false;
            }
        }

        return  amountOfMonotoneSequences;
    }

    public static int[] getIntArrWithRandomNumbers(int arrLength) {
        int[] toReturn = new int[arrLength];
        Random random = new Random();
        for (int i = 0; i < arrLength; i++) {
            toReturn[i] = random.nextInt(20);
        }

        return toReturn;
    }
}
