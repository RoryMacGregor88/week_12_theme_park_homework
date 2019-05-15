import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReview> reviews;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public int getAttractions() {
        return attractions.size();
    }

    public int getStalls() {
        return stalls.size();
    }

    public int getReviews() {
        return reviews.size();
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        stalls.add(stall);
    }

    public void addIReview(IReview iReview) {
        reviews.add(iReview);
    }
}
