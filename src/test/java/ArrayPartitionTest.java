import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayPartitionTest {

    @Test
    public void testCase1() {
        int actual = new ArrayPartition().arrayPairSum(new int[]{1, 4, 3, 2});
        assertEquals(4, actual);
    }
}
