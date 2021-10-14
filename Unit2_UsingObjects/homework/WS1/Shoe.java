package Unit2_UsingObjects.homework.WS1;

public class Shoe{
    // Private variables (attributes)
    private String name;
    private double size;
    private double price;

    public Shoe(String name, double size, double price){
        // Constructor with all given parameters
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public Shoe(String name, int size, double price){
        // Constructor with all given parameters but int size
        this.name = name;
        this.size = (double)size;
        this.price = price;
    }

    public Shoe(String name, double size, int price){
        // Constructor with all given parameters but int price
        this.name = name;
        this.size = size;
        this.price = (double)price;
    }

    public Shoe(String name, int size, int price){
        // Constructor with all given parameters but int price and
        // int size
        this.name = name;
        this.size = (double)size;
        this.price = (double)price;
    }
}

