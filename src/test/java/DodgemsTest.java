import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        dodgems = new Dodgems("Boob Wobbler");
        visitor1 = new Visitor(30, 189, 100);
        visitor2 = new Visitor(14, 133, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Boob Wobbler", dodgems.getName());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(5.00, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void canGetPriceForVisitor() {
        assertEquals(5.00, dodgems.priceFor(visitor1), 0.01);
        assertEquals(2.50, dodgems.priceFor(visitor2), 0.01);
    }

    @Test
    public void hasRating() {
        assertEquals(77, dodgems.getRating());
    }
}
