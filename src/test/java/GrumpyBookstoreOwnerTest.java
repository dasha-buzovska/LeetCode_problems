import org.junit.Test;

import static org.junit.Assert.*;

public class GrumpyBookstoreOwnerTest {

    @Test
    public void maxSatisfied() {
        int actual = new GrumpyBookstoreOwner().maxSatisfied(new int[]{1, 0, 1, 2, 1, 1, 7, 5}, new int[]{0, 1, 0, 1, 0, 1, 0, 1}, 3);
        assertEquals(16, actual);
    }

    @Test
    public void maxSatisfied2() {
        int actual = new GrumpyBookstoreOwner().maxSatisfied(new int[]{4,10,10}, new int[]{1,1,0}, 2);
        assertEquals(24, actual);
    }

    @Test
    public void maxSatisfied3() {
        int actual = new GrumpyBookstoreOwner().maxSatisfied(new int[]{3,8,8,7,1}, new int[]{1,1,1,1,1}, 3);
        assertEquals(23, actual);
    }

}
