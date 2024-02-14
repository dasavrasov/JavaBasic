public class Route {
    Town town;
    int price;

    public Route(Town town, int price) {
        this.town = town;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" +
                town.name +
                ", " + price +
                '}';
    }
}
