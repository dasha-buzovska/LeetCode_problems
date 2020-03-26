import org.junit.Test;

import static org.junit.Assert.*;

public class OuterParenthesesTest {

    @Test
    public void testCase1() {
        String s = new OuterParentheses().removeOuterParentheses("(()())(())");
        assertEquals("()()()", s);
    }

    @Test
    public void testCase2() {
        String s = new OuterParentheses().removeOuterParentheses("(()())(())(()(()))");
        assertEquals("()()()()(())", s);
    }

}
