package Unit9_Inheritance.examples;

public class Square extends Rectangle{
    public Square(String name, String color, double sideLength) {
        super(name, color, sideLength, sideLength);
    }

    @Override
    public String toString(){
        String output = super.getColor() + " Square with width " + super.getWidth();

        return output;
    }
}
