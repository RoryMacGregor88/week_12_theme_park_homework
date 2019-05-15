public class IceCreamStall extends Stall implements IReview{

    private int rating;

    public IceCreamStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
        this.rating = 94;
    }

    @Override
    public int getRating() {
        return rating;
    }
}