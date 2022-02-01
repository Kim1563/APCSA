package Unit7_ArrayList.lab;

import java.util.Formatter;

public class Show {
    private String date;
    private double price;
    private int quantity;
    private String performer;
    private String city;

    public Show(String date, double price, int quantity, String performer, String city) {
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.performer = performer;
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns formatted String for one Show object
     * @return String with formatted date, price, quantity, performer
     */
    public String toString(){
        String output = "";

        output += date + "\t\t";
        output += "$" + price + "\t\t";
        output += quantity + "\t\t";
        output += performer;

        int performerLength = 23 - performer.length();

        for (int i = 0; i < performerLength; i++) {
            output += " ";
        }

        output += city;

        return output;
    }
}
