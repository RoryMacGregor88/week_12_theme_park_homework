public class Park extends Attraction implements IReview {

    private String name;
    private int rating;

    public Park(String name) {
        super(name);
        this.rating = 54;
    }

    @Override
    public int getRating() {
        return rating;
    }
}