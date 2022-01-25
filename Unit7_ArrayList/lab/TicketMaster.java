package Unit7_ArrayList.lab;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class TicketMaster {



    private ArrayList<Show> shows = new ArrayList<>();

    public TicketMaster(ArrayList<Show> shows) throws FileNotFoundException {
        this.shows = shows;
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

    public ArrayList<Show> searchCity(String target){
        ArrayList<Show> returnList = new ArrayList<>();
        for (Show s : shows) {
            if (s.getCity().equals(target)) {
                returnList.add(s);
            }
        }
        return returnList;
    }

    public void addShows() throws FileNotFoundException {
        Scanner inFile = new Scanner(new File("showData.txt"));
        while (inFile.hasNextLine()){
            String date = inFile.next();

            double price = inFile.nextDouble();
            int qty = inFile.nextInt();

            String temp = inFile.nextLine();

            String performer = temp.substring(0, temp.indexOf(","));

            String city = temp.substring(temp.indexOf(",") + 2);

            shows.add(new Show(date, price, qty, performer, city));

        }
    }
}
