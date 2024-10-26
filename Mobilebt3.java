package main;
import java.awt.Color;
public class Mobilebt3 {
	  // Private attributes
    private String ownerName;
    private Color color;
    private String number;
    private String model;

    // Default constructor
    public Mobilebt3() {
        this.ownerName = "";
        this.color = Color.BLACK;
        this.number = "";
        this.model = "";
    }
    // Parameterized constructor
    public Mobilebt3(String ownerName, Color color, String number, String model) {
        this.ownerName = ownerName;
        this.color = color;
        this.number = number;
        this.model = model;
    }
    // Setter and getter for ownerName
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }
    // Setter and getter for color
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    // Setter and getter for number
    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
    // Setter and getter for model
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    @Override
	public String toString() {
		return "Mobile [ownerName=" + ownerName + ", color=" + color + ", number=" + number + ", model=" + model + "]";
	}
    // Main method to test the class
    public static void main(String[] args) {
        Mobilebt3 myMobile = new Mobilebt3("John Doe", Color.BLUE, "123-456-7890", "iPhone 14");
        System.out.println(myMobile.toString());
        // Using setter methods to update values
        myMobile.setOwnerName("Jane Smith");
        myMobile.setColor(Color.RED);
        myMobile.setNumber("987-654-3210");
        myMobile.setModel("Samsung Galaxy S23");
        System.out.println(myMobile.toString());
    }
}
