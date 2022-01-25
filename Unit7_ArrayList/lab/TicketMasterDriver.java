package Unit7_ArrayList.lab;

import java.io.FileNotFoundException;
import java.util.*;

public class TicketMasterDriver {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Show> shows = new ArrayList<>();

    static TicketMaster ticketMaster;

    static {
        try {
            ticketMaster = new TicketMaster(shows);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {


        ticketMaster.addShows();


        System.out.println("Welcome to the TicketMaster Console");
        System.out.println("======================================");
        System.out.println("In the following prompt, type an integer from 0-6 to view the available tickets:");
        System.out.println("\t\t(0) View all tickets (not alphabetical)");
        System.out.println("\t\t(1) Search by location");
        System.out.println("\t\t(2) View all tickets (ordered A-Z)");
        System.out.println("\t\t(3) View all tickets (ordered Z-A)");
        System.out.println("\t\t(4) View all tickets (sorted by price - low to high)");
        System.out.println("\t\t(5) View all tickets (sorted by price - high to low)");
        System.out.println("\t\t(6) Exit TicketMaster");
        System.out.println();

        boolean flag = true;
        while (flag){
            try {
                System.out.print("\nEnter an integer from 0-6: ");
                int input = in.nextInt();
                in.nextLine();
                if (input >= 0 && input <= 6){
                    if (input == 6){
                        System.out.println("\nThanks for using TicketMaster");
                        System.exit(420);
                    } else {
                        ArrayList<Show> temp = process(input, shows);
                        System.out.println("\nDate\t\t\tPrice\t\tQty\t\t Performer\t\t\t\tCity\n---------------------------------------------------------------------------");
                        for (Show s : temp){
                            System.out.println(s);
                        }
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

    public static ArrayList<Show> process(int status, ArrayList<Show> shows){
        ArrayList<Show> returnList = new ArrayList<>();
        if (status == 0) {
            returnList = shows;
            return returnList;
        }
        if (status == 1) {
            System.out.print("Enter the desired city: ");
            String city = in.nextLine();
            returnList = ticketMaster.searchCity(city);
            return returnList;
        }
        if (status == 2){
            Show temp = shows.get(0);
            int index = 0;
        }
        return returnList;
    }

}
