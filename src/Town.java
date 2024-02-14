import java.util.ArrayList;
import java.util.List;

public class Town {
    String name;
    List<Route> routes = new ArrayList<>();

    public Town(String name) {
        this.name = name;
    }

    public Town(String name, List<Route> routes) {
        this.name = name;
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "Town{" +
                name + '\'' +
                ", " + routes.toString() +
                '}';
    }

    public void addRoute(Route route) {
        this.routes.add(route);
    }

    public void addRoute(Town town, int price) {
        this.routes.add(new Route(town, price));
    }

    public Town travel(int n) {
        Town nexttown = this; //переехали в следующиц город
        while (n>0) {
            if (nexttown.routes.isEmpty()) return  null;
            nexttown = nexttown.routes.get(0).town;
            n--;
        }
        return nexttown;
    }
}
