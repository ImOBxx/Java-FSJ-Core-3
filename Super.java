
// Superclass
class Shape74 {
    protected int sides;

    // Constructor
    public Shape74(int sides) {
        this.sides = sides;
    }

    // Method to display the number of sides
    public void displaySides() {
        System.out.println("Number of sides: " + sides);
    }
}

// Subclass
class Triangle45 extends Shape74 {
    private int angles;

    // Constructor
    public Triangle45(int sides, int angles) {
        super(sides); // Call the superclass constructor
        this.angles = angles;
    }

    // Override method to display sides and add angles
    @Override
    public void displaySides() {
        super.displaySides(); // Call the superclass method
        System.out.println("Number of angles: " + angles);
    }

    // Method to display the number of angles
    public void displayAngles() {
        System.out.println("Number of angles: " + angles);
    }
}

public class Super {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Triangle45 triangle = new Triangle45(3, 3);

        // Access inherited method
        triangle.displaySides();

        // Access subclass-specific method
        triangle.displayAngles();
    }
}
