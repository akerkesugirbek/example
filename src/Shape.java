import java.util.ArrayList;

public class Shape{
    final
    private ArrayList<Point> points;
    public Shape(ArrayList<Point> points){
        this.points = points;
    }

    public double perimeter(){
        double perimeter = 0.0;
        int numPoints;
        numPoints = points.size();
        for(int i = 0; i < numPoints; i++ ){
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numPoints);
            perimeter += currentPoint.distanceTo(nextPoint);
        }

        return perimeter;
    }
    public double averageSide(){
        double averageSide = 0.0;
        int numPoints = points.size();
        for(int i = 0; i <numPoints; i++){
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numPoints);
            averageSide += currentPoint.distanceTo(nextPoint);
        }
        return averageSide / numPoints;


    }
    public double longestSide(){
        double longestSide = 0.0;
        for(int i = 0; i <points.size(); i++){
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            double currentSide = currentPoint.distanceTo(nextPoint);
            if(currentSide > longestSide){
                longestSide = currentSide;
            }
        }
        return longestSide;
        }
}