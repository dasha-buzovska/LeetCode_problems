import org.junit.Test;

import static org.junit.Assert.*;

public class StringMatchTest {

    @Test
    public void testCase1() {
        int[] actual = new StringMatch().diStringMatch("IDID");
        int[] expected = new int[] {0,4,1,3,2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int[] actual = new StringMatch().diStringMatch("III");
        int[] expected = new int[] {0,1,2,3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        int[] actual = new StringMatch().diStringMatch("DDI");
        int[] expected = new int[] {3,2,0,1};
        assertArrayEquals(expected, actual);
    }
}
