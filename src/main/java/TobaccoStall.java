public class TobaccoStall extends Stall implements ISecurity, IReview {

    private int minAge;
    private int rating;

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
        this.minAge = 18;
        this.rating = 76;
    }

    public int getMinAge() {
        return minAge;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > minAge ? true : false;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
