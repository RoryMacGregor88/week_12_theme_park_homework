import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Golden Virginia", "Bob", 76);
        visitor1 = new Visitor(30, 189, 100);
        visitor2 = new Visitor(11, 133, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Golden Virginia", tobaccoStall.getName());
    }

    @Test
    public void hasMinAge() {
        assertEquals(18, tobaccoStall.getMinAge());
    }

    @Test
    public void canDenyUnderagers() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
    }
}
