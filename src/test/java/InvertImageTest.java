import org.junit.Test;

import static org.junit.Assert.*;

public class InvertImageTest {

    @Test
    public void testCase1() {
        int[][] actual = new InvertImage().flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
        int[][] expected = new int[][]{{1,0,0}, {0,1,0}, {1,1,1}};
        assertArrayEquals(expected, actual);
    }

}
