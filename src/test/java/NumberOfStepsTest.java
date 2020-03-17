import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfStepsTest {

    @Test
    public void testCase1() {
        test(14, 6);
    }

    @Test
    public void testCase2() {
        test(8, 4);
    }

    @Test
    public void testCase3() {
        test(123, 12);
    }

    private void test(int args, int expectedResult) {
        NumberOfSteps obj = new NumberOfSteps();
        int actualResult = obj.numberOfSteps(args);
        assertEquals(expectedResult, actualResult);
    }

}