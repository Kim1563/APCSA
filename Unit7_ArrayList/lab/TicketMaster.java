package Unit7_ArrayList.lab;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class TicketMaster {

    Scanner inFile = new Scanner(new File("showData.txt"));

    private ArrayList<Show> shows;

    public TicketMaster() throws FileNotFoundException {
        this.shows = new ArrayList<>();
    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public void setShows(ArrayList<Show> shows) {
        this.shows = shows;
    }

    public String toString(){
        String output = "Date\t\t\tPrice\t\tQty\t\t Performer\t\t\t\tCity";
        output += "\n---------------------------------------------------------------------------";
        for (Show s : this.shows) {
            output += "\n";
            output += s.toString();
        }
        return output;
    }

    public void addShows() {
        while (inFile.hasNext()){
            String date = inFile.next();

            double price = inFile.nextDouble();
            int qty = inFile.nextInt();

            String temp = inFile.nextLine();

            String performer = temp.substring(0, temp.indexOf(","));

            String city = temp.substring(temp.indexOf(",") + 1);

            shows.add(new Show(date, price, qty, performer, city));

            inFile.nextLine();
        }
        inFile.close();
    }
}