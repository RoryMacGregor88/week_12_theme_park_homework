import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    RollerCoaster rollerCoaster;
    Dodgems dodgems;
    Park park;
    PlayGround playGround;

    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    CandyFlossStall candyFlossStall;

    ThemePark themePark;

    @Before
    public void before() {

        rollerCoaster = new RollerCoaster("Fanny Tingler");
        dodgems = new Dodgems("Boob Wobbler");
        park = new Park("Ray Park");
        playGround = new PlayGround("Wean Preoccupier");

        iceCreamStall = new IceCreamStall("I Scream, You Scream", "Jimmy", 23);
        tobaccoStall = new TobaccoStall("Golden Shower Virginia", "Bob", 78);
        candyFlossStall = new CandyFlossStall("Candy Butt Floss", "Wendy", 54);

        themePark = new ThemePark();
    }

    @Test
    public void hasAllAttractions() {
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playGround);
        assertEquals(4, themePark.getAttractions());
    }

    @Test
    public void hasAllStalls() {
        themePark.addStall(tobaccoStall);
        themePark.addStall(candyFlossStall);
        themePark.addStall(iceCreamStall);
        assertEquals(3, themePark.getStalls());
    }

    @Test
    public void hasAllIReviews() {
        themePark.addIReview(tobaccoStall);
        themePark.addIReview(candyFlossStall);
        themePark.addIReview(iceCreamStall);

        themePark.addIReview(playGround);
        themePark.addIReview(park);
        themePark.addIReview(dodgems);
        themePark.addIReview(rollerCoaster);
        assertEquals(7, themePark.getReviews());
    }
}