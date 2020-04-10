import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PerfectNumberTest {

    @Test
    public void testCase1() {
        boolean actual = new PerfectNumber().checkPerfectNumber(28);
        assertTrue(actual);
    }

    @Test
    public void testCase2() {
        boolean actual = new PerfectNumber().checkPerfectNumber(1);
        assertFalse(actual);
    }

}
