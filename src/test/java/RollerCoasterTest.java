import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        rollerCoaster = new RollerCoaster("The Twister");
        visitor1 = new Visitor(30, 189, 100);
        visitor2 = new Visitor(11, 133, 10);
    }

    @Test
    public void hasName() {
        assertEquals("The Twister", rollerCoaster.getName());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(10.00, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canGetPriceForVisitor() {
        assertEquals(10.00, rollerCoaster.priceFor(visitor1), 0.01);
        assertEquals(5.00, rollerCoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void canDenyEntryToChildrenAndMidgets() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void hasRating() {
        assertEquals(98, rollerCoaster.getRating());
    }
}
