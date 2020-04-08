import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LuckyNumbersTest {

    @Test
    public void testCase1() {
        List<Integer> integers = new LuckyNumbers().luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}});
        List<Integer> expected = new ArrayList<>();
        expected.add(15);
        assertEquals(expected, integers);
    }

}
