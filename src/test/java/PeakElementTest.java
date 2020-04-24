import org.junit.Test;

import static org.junit.Assert.*;

public class PeakElementTest {

    @Test
    public void testCase1() {
        int peakElement = new PeakElement().findPeakElement(new int[]{1, 2, 3, 1});
        assertEquals(2, peakElement);
    }

    @Test
    public void testCase2() {
        int peakElement = new PeakElement().findPeakElement(new int[]{1, 2});
        assertEquals(1, peakElement);
    }

}
