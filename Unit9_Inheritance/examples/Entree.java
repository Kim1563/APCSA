package Unit9_Inheritance.examples;

public class Entree extends MenuItem{
    private int numSides;
    public Entree(String name, int numSides) {
        super(name);
        this.numSides = numSides;
        System.out.println("Created an Entree with " + numSides + " sides");
    }

    @Override
    public String toString(){
        String output = "Entree item (" + numSides + " sides): " + super.getName();
        return output;
    }
}
