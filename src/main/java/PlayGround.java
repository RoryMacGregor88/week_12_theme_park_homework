public class PlayGround extends Attraction implements ISecurity, IReview {

    private String name;
    private int maxAge;
    private int rating;

    public PlayGround(String name) {
        super(name);
        this.maxAge = 15;
        this.rating = 89;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() < maxAge ? true : false;
    }

    @Override
    public int getRating() {
        return rating;
    }
}