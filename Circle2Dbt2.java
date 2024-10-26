package main;
import java.awt.Color;
import java.awt.geom.Point2D;
public class Circle2Dbt2 {
	 // Private attributes
    private double radius;
    private Color color;
    private Point2D center;

    // Parameterized constructor
    public Circle2Dbt2(Point2D center, double radius, Color color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and setter for color
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Getter and setter for center
    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    // Method to calculate area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to check if a point is inside the circle
    public boolean isPointInside(Point2D point) {
        return center.distance(point) <= radius;
    }

    @Override
	public String toString() {
		return "Circle2D [radius=" + radius + ", color=" + color + ", center=" + center + "]";
	}

    // Main method to test the Circle2D class
    public static void main(String[] args) {
        // Create a center point
        Point2D centerPoint = new Point2D.Double(5, 5);

        // Create a Circle2D object
        Circle2Dbt2 circle = new Circle2Dbt2(centerPoint, 10, Color.BLUE);

        // Display circle details
        System.out.println(circle.toString());

        // Test area and circumference methods
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        // Test if a point is inside the circle
        Point2D testPoint = new Point2D.Double(7, 8);
        System.out.println("Is point inside: " + circle.isPointInside(testPoint));
    }
}

