import org.junit.Test;

import static org.junit.Assert.*;

public class MorseCodeTest {

    @Test
    public void testCase1() {
        int actual = new MorseCode().uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        assertEquals(2, actual);
    }

}
