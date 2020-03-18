import org.junit.Test;

import static org.junit.Assert.*;

public class ProductAndSumTest {

    @Test
    public void testCase1() {
        int actual = new ProductAndSum().subtractProductAndSum(234);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int actual = new ProductAndSum().subtractProductAndSum(4421);
        int expected = 21;
        assertEquals(expected, actual);
    }

}