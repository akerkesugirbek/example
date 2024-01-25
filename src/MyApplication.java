import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter x coordinate for point " + (i + 1) + ": ");
            int x = scanner.nextInt();

            System.out.println("Enter y coordinate for point " + (i + 1) + ": ");
            int y = scanner.nextInt();

            points.add(new Point(x, y));
        }

        scanner.close();

        Shape shape = new Shape(points);

        for (String s : Arrays.asList("Perimeter: " + shape.perimeter(), "Longest Side: " + shape.longestSide(),
                "Average Side: " + shape.averageSide())) {
            System.out.println(s);
        }
    }
}
