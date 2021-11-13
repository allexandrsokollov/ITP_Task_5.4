import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        copyOfJunitTest();
        System.out.println();
        System.out.println("some random arrays");

        for (int i = 0; i < 5; i++) {
            int[] tempArr = Sequences.getIntArrWithRandomNumbers(10);
            int result = Sequences.findAmountOfMonotoneSequences(tempArr);

            System.out.printf("Result is %d   sequence is    ", result);
            System.out.println(Arrays.toString(tempArr));
        }

        System.out.println();
        int[] arr = getIntArrFromConsole();

        System.out.printf("Result is %d ", Sequences.findAmountOfMonotoneSequences(arr));

    }

    public static void copyOfJunitTest() {
        final int AMOUNT_OF_SEQUENCES = 10;
        int[][] sequences = new int[][] {
                {5, 4, 3, 3, 3,}, {3, 3, 3, 3, 2, 1}, {3,3,3,2,1,2,3,2,1,1,1,},
                {5,4,3,2,1,1,2,3,4,5}, {1,1,1,1,1,1,1,1,1}, {9,8,7,6,5,4,3,2,1},
                {1,2,1,2,1,2,1,2}, {2,1,2,1,2,1,2,1,2,1}, {5,5,5,4,3,5,5,5,4,3,5,5,},
                {1,2,3,4,5,6,7,8,9,}};

        int[] expectedResults = new int[] {1, 1, 2, 1, 0, 1, 3, 5, 2, 0};

        int expected, real;

        for (int i = 0; i < AMOUNT_OF_SEQUENCES; i++) {
            expected = expectedResults[i];
            real = Sequences.findAmountOfMonotoneSequences(sequences[i]);

            System.out.printf("Expected value %d  real value %d  Sequence ", expected, real);
            System.out.println(Arrays.toString(sequences[i]));
        }
    }

    public static int[] getIntArrFromConsole() {
        System.out.println("Enter your own array  to stop input enter not an integer and press enter:  ");
        Scanner in = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        while (in.hasNextInt()) {
            integerList.add(in.nextInt());
        }

        int[] result = new int[integerList.size()];

        for (int i = 0; i < integerList.size(); i++) {
            result[i] = integerList.get(i);
        }
        return result;
    }

}
