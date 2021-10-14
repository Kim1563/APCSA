package Unit2_UsingObjects.PracticeQuiz;

public class Toy
{
    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the toy name and price
    private String name;
    private double price;


    // *** WRITE CODE HERE ***
    // Part B
    // Create getters & setters for all instance variables
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }


    // *** WRITE CODE HERE ***
    // Part C
    // Create a full constructor that accepts each instance
    // variable as a parameter
    public Toy(String name, double price){
        this.name = name;
        this.price = price;
    }


    // *** WRITE CODE HERE ***
    // Part D
    // Create a calcTotal method that adds a 10% tax to the
    // price and returns the total cost
    public double calcTotal(){
        return 1.10 * price;
    }

}