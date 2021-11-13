import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SequencesTest {

    @org.junit.jupiter.api.Test
    void findAmountOfMonotoneSequences() {

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

            assertEquals(expected, real);

            System.out.printf("Expected value %d  real value %d  Sequence ", expected, real);
            System.out.println(Arrays.toString(sequences[i]));
        }
    }
}