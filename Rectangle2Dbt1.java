package main;
import java.awt.Color;
import java.awt.geom.Point2D;
public class Rectangle2Dbt1 {
	 // Private attributes
    private Point2D bottomLeft;  // Bottom-left corner of the rectangle
    private double width;
    private double height;
    private Color color;

    // Parameterized constructor
    public Rectangle2Dbt1(Point2D bottomLeft, double width, double height, Color color) {
        this.bottomLeft = bottomLeft;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getter and Setter for bottomLeft
    public Point2D getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point2D bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    // Getter and Setter for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter and Setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getter and Setter for color
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Method to display rectangle details
    public void display() {
        System.out.println("Rectangle2D {" +
                "Bottom-Left Corner=(" + bottomLeft.getX() + ", " + bottomLeft.getY() + ")" +
                ", Width=" + width +
                ", Height=" + height +
                ", Color=" + color +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}');
    }

    // Method to check if a point is inside the rectangle
    public boolean isPointInside(Point2D point) {
        double x = point.getX();
        double y = point.getY();
        return x >= bottomLeft.getX() && x <= (bottomLeft.getX() + width) &&
               y >= bottomLeft.getY() && y <= (bottomLeft.getY() + height);
    }

    // Main method to test the Rectangle2D class
    public static void main(String[] args) {
        // Create a bottom-left point
        Point2D bottomLeft = new Point2D.Double(0, 0);

        // Create a Rectangle2D object
        Rectangle2Dbt1 rectangle = new Rectangle2Dbt1(bottomLeft, 10, 5, Color.GREEN);
        // Display rectangle details
        rectangle.display();

        // Test area and perimeter methods
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Test if a point is inside the rectangle
        Point2D testPoint = new Point2D.Double(7, 3);
        System.out.println("Is point inside: " + rectangle.isPointInside(testPoint));
    }
}
