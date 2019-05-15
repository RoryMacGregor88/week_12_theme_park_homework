public class RollerCoaster extends Attraction implements ITicket, ISecurity, IReview {

    private String name;
    private double defaultPrice;
    private int rating;

    public RollerCoaster(String name) {
        super(name);
        this.defaultPrice = 10.00;
        this.rating = 98;
    }

    public double defaultPrice() {
        return defaultPrice;
    }

    public double priceFor(Visitor visitor) {
        return visitor.getAge() > 18 ? defaultPrice : defaultPrice / 2;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() > 12) && (visitor.getHeight() > 145) ? true : false;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
