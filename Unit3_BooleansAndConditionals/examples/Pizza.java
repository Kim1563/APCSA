package Unit3_BooleansAndConditionals.examples;

public class Pizza {
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    public Pizza(String store, int inches, int numToppings, boolean isDeepDish){
        this.store = store;
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
    }
    public Pizza(String store, int inches, boolean isDeepDish){
        this.store = store;
        this.inches = inches;
        numToppings = 0;
        this.isDeepDish = isDeepDish;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void printInfo(){
        System.out.println("Your pizza");
        System.out.println("\tStore name: " + store);
        System.out.println("\tInches: " + inches);
        System.out.println("\tNumber of toppings: " + numToppings);
        System.out.println("\tIs it deep dish? " + isDeepDish);
    }

    public String toString() {
        String output = "Your pizza\n";
        output += "\tStore name: " + store + "\n";
        output += "\tInches: " + inches + "\n";
        output += "\tNumber of toppings: " + numToppings + "\n";
        output += "\tIs it deep dish? " + isDeepDish + "\n";
        return output;
    }

    public boolean equals(Pizza otherPizza){
        return (this.inches == otherPizza.inches);
    }

    public int compareTo(Pizza otherPizza){
        return this.inches - otherPizza.inches;
    }
}
