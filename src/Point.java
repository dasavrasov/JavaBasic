import java.util.Objects;

public class Point {
    int X;
    int Y;

    public Point(int x, int y) {
        X = x;
        Y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return X == point.X && Y == point.Y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }
}
