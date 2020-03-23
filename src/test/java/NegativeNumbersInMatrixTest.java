import org.junit.Test;

import static org.junit.Assert.*;

public class NegativeNumbersInMatrixTest {

    @Test
    public void testCase1() {
        int[][] grid = new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int actual = new NegativeNumbersInMatrix().countNegatives(grid);
        assertEquals(8, actual);
    }

    @Test
    public void testCase2() {
        int[][] grid = new int[][]{{3,2},{1,0}};
        int actual = new NegativeNumbersInMatrix().countNegatives(grid);
        assertEquals(0, actual);
    }

    @Test
    public void testCase3() {
        int[][] grid = new int[][]{{1,-1},{-1,-1}};
        int actual = new NegativeNumbersInMatrix().countNegatives(grid);
        assertEquals(3, actual);
    }

}