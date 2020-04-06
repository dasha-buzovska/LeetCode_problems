import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayByParityTest {

    @Test
    public void testCase1() {
        int[] ints = new ArrayByParity().sortArrayByParity(new int[]{3, 2, 1, 4});
        assertArrayEquals(new int[]{2,4,1,3}, ints);
    }

}
