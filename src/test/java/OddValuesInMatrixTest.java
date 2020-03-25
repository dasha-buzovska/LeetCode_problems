import org.junit.Test;

import static org.junit.Assert.*;

public class OddValuesInMatrixTest {

    @Test
    public void testCase1() {
        int actual = new OddValuesInMatrix().oddCells(2, 3, new int[][]{{0, 1}, {1, 1}});
        assertEquals(6, actual);
    }

    @Test
    public void testCase2() {
        int actual = new OddValuesInMatrix().oddCells(2, 2, new int[][]{{1,1}, {0,0}});
        assertEquals(0, actual);
    }

}