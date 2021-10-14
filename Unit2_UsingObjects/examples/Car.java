package Unit2_UsingObjects.examples;

public class Car {
    // Instance variables
    private int modelYear;
    private String name;

    public Car(int modelYear, String name){
        this.modelYear = modelYear;
        this.name = name;
    }

    public Car(String name){
        this.name = name;
        modelYear = 2021;
    }

    public void displayInfo(){
        System.out.println("Your car is a " + name +  " made in " + modelYear + "\n");
    }

    public int getModelYear(){
        return modelYear;
    }

    public void setModelYear(int modelYear){
        this.modelYear = modelYear;
    }
}
