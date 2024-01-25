public class Point{
    final private double x;

    final private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point dest){
        return Math.sqrt(Math.pow((this.x - dest.x), 2)+Math.pow((this.y - dest.y), 2));
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
