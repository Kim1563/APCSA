package Unit9_Inheritance.examples;

public class Rectangle extends Shape{
    private double width, length;
    private int numSides;

    public Rectangle(String name, String color, double width, double length) {
        super(name, color);
        this.width = width;
        this.length = length;
        this.numSides = 4;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public double findArea(){
        return this.width * this.length;
    }

    public void scaleSize(double scale){
        this.setLength(this.getLength() * scale);
        this.setWidth(this.getWidth() * scale);
    }

    @Override
    public String toString(){
        String output = super.getColor() + " Rectangle with width " + width + " and length " + length;

        return output;
    }
}
