package Unit7_ArrayList.lab;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class TicketMaster {

    Scanner inFile = new Scanner(new File("showData.txt"));

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
        String output = "Date\t\tPrice\t\tQty\t\tPerformer\t\t\tCity";
        output += "\n----------------------------------------------------------------";

        for (Show s : this.shows){
            output += s.toString();
        }

        return output;
    }

    public void addShow(Show s){
        shows.add(s);
    }
}
