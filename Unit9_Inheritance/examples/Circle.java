package Unit9_Inheritance.examples;

public class Circle extends Shape{
    private double radius;

    public double findArea(){
        return Math.pow(radius, 2) * Math.PI;
    }

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        String output = super.getColor() + " Circle with radius " + radius;

        return output;
    }
}
