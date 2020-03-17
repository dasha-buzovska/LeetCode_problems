import org.junit.Test;

import static org.junit.Assert.*;

public class SmallerNumbersThanCurrentTest {

    @Test
    public void testCase1() {
        test(new int[]{8, 1, 2, 2, 3}, new int[] {4,0,1,1,3});
    }

    @Test
    public void testCase2() {
        test(new int[]{6,5,4,8}, new int[] {2,1,0,3});
    }

    @Test
    public void testCase3() {
        test(new int[]{7,7,7,7}, new int[] {0,0,0,0});
    }

    private void test(int[] args, int[] expectedResult) {
        SmallerNumbersThanCurrent obj = new SmallerNumbersThanCurrent();
        int[] actualResult = obj.smallerNumbersThanCurrent(args);
        assertArrayEquals(expectedResult, actualResult);
    }

}