import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptStringTest {

    @Test
    public void testCase1() {
        String s = new DecryptString().freqAlphabets("10#11#12");
        assertEquals("jkab", s);
    }

    @Test
    public void testCase2() {
        String s = new DecryptString().freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#");
        assertEquals("abcdefghijklmnopqrstuvwxyz", s);
    }

    @Test
    public void testCase3() {
        String s = new DecryptString().freqAlphabets("1326#");
        assertEquals("acz", s);
    }

    @Test
    public void testCase4() {
        String s = new DecryptString().freqAlphabets("25#");
        assertEquals("y", s);
    }

}
