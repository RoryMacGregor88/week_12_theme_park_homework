import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayGroundTest {

    PlayGround playGround;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        playGround = new PlayGround("Wean Preoccupier");
        visitor1 = new Visitor(30, 189, 100);
        visitor2 = new Visitor(14, 133, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Wean Preoccupier", playGround.getName());
    }

    @Test
    public void hasMaxAge() {
        assertEquals(15, playGround.getMaxAge());
    }

    @Test
    public void canDenyEntryToAdults() {
        assertEquals(false, playGround.isAllowedTo(visitor1));
        assertEquals(true, playGround.isAllowedTo(visitor2));
    }
}
