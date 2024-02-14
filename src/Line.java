class Line implements LengthCounter{
    Point start,end;
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO deep copy
        Point start = new Point(this.start.X, this.start.Y);
        Point end = new Point(this.end.X, this.end.Y);
        Line line = new Line(start, end);
        return line;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (!start.equals(line.start)) return false;
        return end.equals(line.end);
    }

    @Override
    public int hashCode() {
        int result = start.hashCode();
        result = 31 * result + end.hashCode();
        return result;
    }

    @Override
    public int length() {
        return (int)Math.sqrt(Math.pow((end.X - start.X),2) + Math.pow((end.Y - start.Y),2));
    }
}