package Unit2_UsingObjects.homework.WS1;

public class Fruit{
    // Instance variables (attributes)
    private String name;
    private boolean isRipe;
    private int servings;

    public Fruit(String name, boolean isRipe, int servings){
        // Constructor when all parameters are given
        this.name = name;
        this.isRipe = isRipe;
        this.servings = servings;
    }

    public Fruit(String name, boolean isRipe){
        // Constructor when only name and isRipe are given
        this.name = name;
        this.isRipe = isRipe;

        servings = 1;
        // Defaults to single serving item when servings not
        // provided
    }

    // Methods
    public void  displayInfo(){
        // String variable to show ripeness status based on boolean isRipe
        String ripeness;

        if (isRipe){
            ripeness = "Yes";
        } else {
            ripeness = "No";
        }

        System.out.println("This is your fruit: " + name + "\nIs it ripe? " + ripeness + "\nHow many people can it serve? " + servings + "\n");
    }

    // Accessor methods
    public String getName(){
        return name;
    }
    public boolean getRipeness(){
        return isRipe;
    }
    public int getServings(){
        return servings;
    }

}



