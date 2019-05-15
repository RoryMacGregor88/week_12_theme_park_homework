public interface ITicket {

    double defaultPrice();

    double priceFor(Visitor visitor);

}
