import static org.junit.jupiter.api.Assertions.*;

class SequencesAnalyzerTest {

    @org.junit.jupiter.api.Test
    void findAmountOfMonotoneSequences() {

        final int AMOUNT_OF_SEQUENCES = 10;
        int[][] sequences = new int[][] {
                {5, 4, 3, 3, 3,}, {3, 3, 3, 3, 2, 1}, {3,3,3,2,1,2,3,2,1,1,1,},
                {5,4,3,2,1,1,2,3,4,5}, {1,1,1,1,1,1,1,1,1}, {9,8,7,6,5,4,3,2,1},
                {1,2,1,2,1,2,1,2}, {2,1,2,1,2,1,2,1,2,1}, {5,5,5,4,3,5,5,5,4,3,5,5,},
                {1,2,3,4,5,6,7,8,9,}};

        int[] expectedResults = new int[] {1, 1, 2, 1, 0, 1, 0, 5, 2, 0};

        for (int i = 0; i < AMOUNT_OF_SEQUENCES; i++) {
            assertEquals(expectedResults[i], SequencesAnalyzer.findAmountOfMonotoneSequences(sequences[i]));
        }
    }
}