package Unit9_Inheritance.examples;

public class Circle extends Shape{
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        String output = super.getColor() + " circle with radius " + radius;

        return output;
    }
}
