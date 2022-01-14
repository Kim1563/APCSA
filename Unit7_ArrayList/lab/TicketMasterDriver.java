package Unit7_ArrayList.lab;

import java.io.FileNotFoundException;
import java.util.*;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Show> s = new ArrayList<>();
        TicketMaster t = new TicketMaster(s);

        t.addShows();
        System.out.println(t.toString());
    }
}
