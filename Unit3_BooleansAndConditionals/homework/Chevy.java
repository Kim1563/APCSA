package Unit3_BooleansAndConditionals.homework;

public class Chevy {
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private int price;
    private String model;
    private String color;
    private boolean luxury;
    private boolean fourWD;
    private boolean sport;
    private final String MAKE = "Chevrolet";
    private final double TAX = 1.122;
    private final double LUXRATE = 1.2;
    private final int FOURWDRATE = 3500;
    private final double SPORTRATE = 1.15;
    private final double SPORTFUEL = 0.8;

    public Chevy(){
        this.year = 2021;
        this.mileage = 0;
        this.fuelEfficiency = 35;
        this.price = 16000;
        this.model = "Trax";
        this.color = "White";
        this.luxury = false;
        this.fourWD = false;
        this.sport = false;
    }

    public Chevy(int year, int mileage, double fuelEfficiency, int price, String model, String color, boolean luxury, boolean fourWD, boolean sport) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    public int compareTo(Chevy other){
        return (price - other.price);
    }

    public boolean equals(Chevy other){
        Boolean thisIsNew = this.mileage < 200;
        Boolean otherIsNew = other.mileage < 200;
        return this.model.equals(other.model) &&
                this.color.equals(other.color) &&
                thisIsNew.equals(otherIsNew);
    }

    public String toString(){
        String returnString = this.year + MAKE + this.model + "(" + this.color + ")";
        returnString += "\tPRICE:\t\t$" + this.price;
        returnString += "\tMILES:\t\t" + this.mileage;
        returnString += "\tFUEL EFFICIENCY:\t\t" + this.fuelEfficiency + " mpg";
        returnString += "\tPACKAGES:";
        if (luxury){
            returnString += "\t\t-Luxury Package";
        }
        if (fourWD){
            returnString += "\t\t-4WD Package";
        }
        if (sport){
            returnString += "\t\t-Sports Package";
        }
        if (!(luxury || fourWD || sport)){
            returnString += "\t\t-None";
        }
        return returnString;
    }

}
