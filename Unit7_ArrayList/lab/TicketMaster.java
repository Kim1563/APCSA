package Unit7_ArrayList.lab;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
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

    /**
     * Return formatted String with the title and all shows as needed
     * @return String with formatted Shows
     */
    public String toString(){
        String output = "Date\t\t\tPrice\t\tQty\t\t Performer\t\t\t\tCity";
        output += "\n---------------------------------------------------------------------------";
        for (Show s : this.shows) {
            output += "\n";
            output += s.toString();
        }
        return output;
    }

    public ArrayList<Show> searchCity(String city){
        ArrayList<Show> temp = new ArrayList<>();
        for (Show s : shows){
            if (s.getCity().equals(city)){
                temp.add(s);
            }
        }

        return temp;
    }

    public void sortAZ(){
        for (int i = 0; i < shows.size() - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < shows.size(); j++){
                if (shows.get(j).getPerformer().compareTo(shows.get(minIndex).getPerformer()) < 0) {
                    minIndex = j;
                }
            }
            Show temp = shows.get(i);
            shows.set(i, shows.get(minIndex));
            shows.set(minIndex, temp);
        }
    }

    public void sortZA(){
        for (int i = 0; i < shows.size() - 1; i++){
            int maxIndex = i;
            for (int j = i + 1; j < shows.size(); j++){
                if (shows.get(j).getPerformer().compareTo(shows.get(maxIndex).getPerformer()) > 0) {
                    maxIndex = j;
                }
            }
            Show temp = shows.get(i);
            shows.set(i, shows.get(maxIndex));
            shows.set(maxIndex, temp);
        }
    }

    public void sortExpensive(){
        for (int i = 1; i < shows.size(); i++){
            Show temp = shows.get(i);
            double val = shows.get(i).getPrice();
            int pos = i;

            while (pos > 0 && shows.get(pos - 1).getPrice() < val){
                shows.set(pos, shows.get(pos - 1));
                pos--;
            }

            shows.set(pos, temp);
        }
    }

    public void sortCheap(){
        for (int i = 1; i < shows.size(); i++){
            Show temp = shows.get(i);
            double val = shows.get(i).getPrice();
            int pos = i;

            while (pos > 0 && shows.get(pos - 1).getPrice() > val){
                shows.set(pos, shows.get(pos - 1));
                pos--;
            }

            shows.set(pos, temp);
        }
    }

    public void addShows() {
        while (inFile.hasNext()){
            String date = inFile.next();

            double price = inFile.nextDouble();
            int qty = inFile.nextInt();

            String temp = inFile.nextLine();

            String performer = temp.substring(0, temp.indexOf(","));

            String city = temp.substring(temp.indexOf(",") + 2);

            shows.add(new Show(date, price, qty, performer, city));
        }
        inFile.close();
    }
}
