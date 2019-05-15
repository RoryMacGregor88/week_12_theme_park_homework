public class Dodgems extends Attraction implements ITicket, IReview {

    private String name;
    private double defaultPrice;
    public int rating;

    public Dodgems(String name) {
        super(name);
        this.defaultPrice = 5.00;
        this.rating = 77;
    }

    public double defaultPrice() {
        return defaultPrice;
    }

    public double priceFor(Visitor visitor) {
        return visitor.getAge() > 18 ? defaultPrice : defaultPrice / 2;
    }

    @Override
    public int getRating() {
        return rating;
    }
}