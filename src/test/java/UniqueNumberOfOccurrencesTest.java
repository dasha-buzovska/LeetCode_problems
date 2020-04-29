import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueNumberOfOccurrencesTest {

    @Test
    public void testCase1() {
        boolean actual = new UniqueNumberOfOccurrences().uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});
        assertTrue(actual);
    }

    @Test
    public void testCase2() {
        boolean actual = new UniqueNumberOfOccurrences().uniqueOccurrences(new int[]{1, 2});
        assertFalse(actual);
    }
}
