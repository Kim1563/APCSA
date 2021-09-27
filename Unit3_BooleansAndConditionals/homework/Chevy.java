package Unit3_BooleansAndConditionals.homework;

public class Chevy {
    // Private instance variables
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private double price;
    private String model;
    private String color;
    private boolean luxury;
    private boolean fourWD;
    private boolean sport;
    private final String MAKE = "Chevrolet";
    private final double TAX = 1.122;
    private final double LUXRATE = 0.2;
    private final int FOURWDRATE = 3500;
    private final double SPORTRATE = 0.15;
    private final double SPORTFUEL = 0.8;

    // Default constructor
    public Chevy(){
        this.year = 2021;
        this.mileage = 0;
        this.fuelEfficiency = 35;
        this.price = 16000.00;
        this.model = "Trax";
        this.color = "White";
        this.luxury = false;
        this.fourWD = false;
        this.sport = false;
    }

    // Full constructor
    public Chevy(int year, int mileage, double fuelEfficiency, double price, String model, String color, boolean luxury, boolean fourWD, boolean sport) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.price = price;
        this.model = model;
        this.color = color;
        this.luxury = luxury;
        this.fourWD = fourWD;
        this.sport = sport;
    }

    // Getters and setters for every variable
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getPrice() {
        return String.valueOf((int)price) + ".00";
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLuxury() {
        return luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }

    public boolean isFourWD() {
        return fourWD;
    }

    public void setFourWD(boolean fourWD) {
        this.fourWD = fourWD;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }


    // compareTo method returns a double that shows the comparison between this Chevy and other Chevy:
    // negative if less, zero if equal, positive if more
    public double compareTo(Chevy other){
        return (price - other.price);
    }

    // equals method returns true if and only if models, colors, and used status based on mileage are equal
    public boolean equals(Chevy other){
        Boolean thisIsNew = this.mileage < 200;
        Boolean otherIsNew = other.mileage < 200;
        return this.model.equals(other.model) &&
                this.color.equals(other.color) &&
                thisIsNew.equals(otherIsNew);
    }

    // calcPrice method adds on packages based on original price and returns final price + tax
    public double calcPrice(){
        double originalPrice = this.price;
        if (luxury){
            this.price += originalPrice * LUXRATE;
        }
        if (fourWD){
            this.price += FOURWDRATE;
        }
        if (sport){
            this.price += originalPrice * SPORTRATE;
            this.fuelEfficiency *= SPORTFUEL;
        }
        return this.price * TAX;
    }

    // toString method returns a formatted string that displays the instance variables and packages
    public String toString(){
        String returnString = this.year + " " + MAKE + " " + this.model + " (" + this.color + ")";
        returnString += "\n\tPRICE:\t\t\t\t$" + this.getPrice();
        returnString += "\n\tMILES:\t\t\t\t" + this.mileage;
        returnString += "\n\tFUEL EFFICIENCY:\t" + this.fuelEfficiency + " mpg";
        returnString += "\n\tPACKAGES:";
        if (luxury){
            returnString += "\n\t\t- Luxury Package";
        }
        if (fourWD){
            returnString += "\n\t\t- 4WD Package";
        }
        if (sport){
            returnString += "\n\t\t- Sports Package";
        }
        if (!(luxury || fourWD || sport)){
            returnString += "\n\t\t- None";
        }
        return returnString + "\n";
    }

}
