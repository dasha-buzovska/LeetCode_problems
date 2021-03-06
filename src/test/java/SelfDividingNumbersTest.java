import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SelfDividingNumbersTest {

    @Test
    public void testCase1() {
        List<Integer> integers = new SelfDividingNumbers().selfDividingNumbers(1, 22);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(11);
        expected.add(12);
        expected.add(15);
        expected.add(22);
        assertEquals(expected, integers);
    }

}
