
// Abstract Shape class
abstract class Shape {
    // Abstract methods
    public abstract double RectangleArea(double length, double breadth);
    public abstract double SquareArea(double side);
    public abstract double CircleArea(double radius);
   
    
}

// Class Area implementing Shape
class Area extends Shape {
    // Implementing abstract methods
    public double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    public double SquareArea(double side) {
        return side * side;
    }

    public double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

// Main class to test the functionality
public class Shapes {
    public static void main(String[] args) {
        // Creating an object of class Area
        Area areaCalculator = new Area();

        // Test values
        double length = 5.0;
        double breadth = 4.0;
        double side = 5.0;
        double radius = 3.0;

        // Calculating areas
        double rectangleArea = areaCalculator.RectangleArea(length, breadth);
        double squareArea = areaCalculator.SquareArea(side);
        double circleArea = areaCalculator.CircleArea(radius);

        // Printing results
        System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + ": " + rectangleArea);
        System.out.println("Area of square with side " + side + ": " + squareArea);
        System.out.println("Area of circle with radius " + radius + ": " + circleArea);
    }
}






