import java.util.ArrayList;
public class Shape{
    final
    private ArrayList<Point> points;
    public Shape(ArrayList<Point> points){
        this.points = points;
    }

    public double findPerimeter(){
        double findPerimeter = 0.0;
        int numPoints;
        numPoints = points.size();
        for(int i = 0; i < numPoints; i++ ){
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numPoints);
            findPerimeter += currentPoint.distanceTo(nextPoint);
        }

        return findPerimeter;
    }
    public double findAverageSide(){
        double findAverageSide = 0.0;
        int numPoints = points.size();
        for(int i = 0; i <numPoints; i++){
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numPoints);
            findAverageSide += currentPoint.distanceTo(nextPoint);
        }
        return findAverageSide / numPoints;


    }
    public double findLongestSide(){
        double findLongestSide = 0.0;
        for(int i = 0; i <points.size(); i++){
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            double currentSide = currentPoint.distanceTo(nextPoint);
            if(currentSide > findLongestSide){
                findLongestSide = currentSide;
            }
        }
        return findLongestSide;
        }
}