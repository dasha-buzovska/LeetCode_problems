import org.junit.Test;

import static org.junit.Assert.*;

public class SquaresOfSortedArrayTest {

    @Test
    public void testCase1() {
        int[] actual = new SquaresOfSortedArray().sortedSquares(new int[]{-4, -1, 0, 3, 10});
        int[] expected = new int[] {0,1,9,16,100};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int[] actual = new SquaresOfSortedArray().sortedSquares(new int[]{-7,-3,2,3,11});
        int[] expected = new int[] {4,9,9,49,121};
        assertArrayEquals(expected, actual);
    }
}
