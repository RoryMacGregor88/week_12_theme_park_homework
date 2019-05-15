public class CandyFlossStall extends Stall implements IReview {

    private int rating;

    public CandyFlossStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
        this.rating = 46;
    }

    @Override
    public int getRating() {
        return rating;
    }

}
