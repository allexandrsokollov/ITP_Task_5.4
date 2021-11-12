import java.util.Random;

public class Main {

    public static void main(String[] args) {

    }



    public static int[] getIntArrWithRandomNumbers(int arrLength) {
        int[] toReturn = new int[arrLength];
        Random random = new Random();
        for (int i = 0; i < arrLength; i++) {
            toReturn[i] = random.nextInt(100);
        }

        return toReturn;
    }
}
