//Create a base class Shape with fields color and filled and a parameterized constructor. Then, create two subclasses, Circle and Rectangle, that inherit from Shape. Implement constructors for these subclasses and include methods to calculate their respective areas.
// Base class representing a Shape
class Shape {
    String color;    // The color of the shape
    boolean filled;  // Whether the shape is filled with color or not

    // Constructor to initialize the Shape
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
}

// Subclass Circle that extends Shape
class Circle extends Shape {
    private double radius;  // The radius of the circle

    // Constructor to initialize the Circle
    public Circle(String color, boolean filled, double radius) {
        super(color, filled); // Call the constructor of the base class (Shape)
        this.radius = radius; // Initialize the radius of the circle
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

// Subclass Rectangle that extends Shape
class Rectangle extends Shape {
    private double width;   // The width of the rectangle
    private double length;  // The length of the rectangle

    // Constructor to initialize the Rectangle
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled); // Call the constructor of the base class (Shape)
        this.width = width;   // Initialize the width of the rectangle
        this.length = length; // Initialize the length of the rectangle
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return this.width * this.length;
    }

    public static void main(String[] args) {
        // Create a Rectangle object and calculate its area
        Rectangle rec = new Rectangle("Red", true, 5.5, 5.0);
        System.out.println("Area of Rectangle: " + rec.getArea());
        System.out.println("Shape color: " + rec.color + ", Shape is filled: " + rec.filled);

        // Create a Circle object and calculate its area
        Circle cir = new Circle("Blue", true, 5.5);
        System.out.println("Area of Circle: " + cir.getArea());
        System.out.println("Shape color: " + cir.color + ", Shape is filled: " + cir.filled);
    }
}



