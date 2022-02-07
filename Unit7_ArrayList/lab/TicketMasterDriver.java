                                                                                                                                                                                                                                                                                                                                                                                                                             package Unit7_ArrayList.lab;

import java.io.FileNotFoundException;
import java.util.*;

public class TicketMasterDriver {
    static Scanner in = new Scanner(System.in);
    static TicketMaster ticketMaster;

    static {
        try {
            ticketMaster = new TicketMaster();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    // Count of total processes
    static int count = 0;

    public static void main(String[] args) throws FileNotFoundException {
        // Adds shows to the TicketMaster ArrayList
        ticketMaster.addShows();

        // Menu
        System.out.println("Welcome to the TicketMaster Console");
        System.out.println("======================================");
        System.out.println("In the following prompt, type an integer from 0-6 to view the available tickets:");
        System.out.println("\t\t(0) View all tickets (not alphabetical)");
        System.out.println("\t\t(1) Search by location");
        System.out.println("\t\t(2) View all tickets (ordered A-Z)");
        System.out.println("\t\t(3) View all tickets (ordered Z-A)");
        System.out.println("\t\t(4) View all tickets (sorted by price - cheap to expensive)");
        System.out.println("\t\t(5) View all tickets (sorted by price - expensive to cheap)");
        System.out.println("\t\t(6) Exit TicketMaster");
        System.out.println();

        boolean flag = true;
        // Continues asking user for input
        while (flag){
            // Tries the user's input and catches errors
            try {
                System.out.print("\nEnter an integer from 0-6: ");
                int input = in.nextInt();
                in.nextLine();
                // Checks if input is within range
                if (input >= 0 && input <= 6){
                    // Temporary ArrayList for returned processed ArrayList
                    ArrayList<Show> shows = new ArrayList<>();
                    shows = process(input, ticketMaster.getShows());
                    // Count of total processes incremented;
                    count++;

                    // Checks if there are no shows after processing and prints formatted Shows
                    if (shows.size() != 0) {
                        System.out.println("Date\t\t\tPrice\t\tQty\t\t Performer\t\t\t   City\n---------------------------------------------------------------------------");
                    }
                    for (Show s : shows){
                        System.out.println(s.toString());
                    }
                } else {
                    System.out.println("\nOut of range");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("\nPlease provide an integer");
                in.nextLine();
            }
            catch (Exception e){
                System.out.println("\nAn unexpected error led to an exception, " + e + ", please try again");
                in.nextLine();
            }
        }

    }

    // Processes the ArrayList based on user input
    public static ArrayList<Show> process(int status, ArrayList<Show> shows){
        ArrayList<Show> returnList = new ArrayList<>();
        if (status == 0) {
            returnList = shows;
            return returnList;
        }
        if (status == 1) {
            System.out.print("\nEnter the desired city: ");
            String city = in.nextLine();
            ArrayList<Show> temp = new ArrayList<>();
            temp = ticketMaster.searchCity(city);

            // If there are no shows in specified city, prints a message
            if (temp.size() == 0){
                System.out.println("\nUnfortunately, there are no shows in that city");
            }
            return temp;
        }
        if (status == 2){
            System.out.println("\nSorted A-Z\n");
            ticketMaster.sortAZ();
            return shows;
        }
        if (status == 3){
            System.out.println("\nSorted Z-A\n");
            ticketMaster.sortZA();
            return shows;
        }
        if (status == 4){
            System.out.println("\nSorted by Price (Cheap - Expensive)\n");
            ticketMaster.sortCheap();
            return shows;
        }
        if (status == 5){
            System.out.println("\nSorted by Price (Expensive - Cheap)\n");
            ticketMaster.sortExpensive();
            return shows;
        }

        // Exits program if user inputs 6
        if (status == 6){
            System.out.println("\nThanks for using TicketMaster");
            System.out.println("You used TicketMaster " + count + " times.");
            System.exit(420);
        }
        return returnList;
    }

}
