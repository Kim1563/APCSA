package Unit9_Inheritance.examples;

public class Rectangle extends Shape{
    private int width, length, numSides;

    public Rectangle(String name, String color, int width, int length) {
        super(name, color);
        this.width = width;
        this.length = length;
        this.numSides = 4;
    }
}
