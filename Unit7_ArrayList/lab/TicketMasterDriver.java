package Unit7_ArrayList.lab;

import java.io.FileNotFoundException;
import java.util.*;

public class TicketMasterDriver {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        TicketMaster ticketMaster = new TicketMaster();
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
                if (input >= 0 && input <= 6){
                    if (input == 6){
                        System.out.println("Thanks for using TicketMaster");
                        System.exit(420);
                    } else {
                        ticketMaster.setShows(process(input, ticketMaster.getShows()));
                        System.out.println(ticketMaster);
                    }
                } else {
                    System.out.println("Out of range");
                    in.nextLine();
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Please provide an integer");
                in.nextLine();
            }
            catch (Exception e){
                System.out.println("An unexpected error led to an exception, " + e + ", please try again");
                in.nextLine();
            }
        }

    }

    public static ArrayList<Show> process(int status, ArrayList<Show> shows){
        ArrayList<Show> returnList = shows;
        if (status == 0) {
            return returnList;
        } else if (status == 1) {
            System.out.print("Enter the desired city: ");
            String city = in.next();
            for (int i = returnList.size() - 1; i >= 0; i--) {
                if (!returnList.get(i).getCity().equalsIgnoreCase(city)) {
                    returnList.remove(returnList.get(i));
                }
            }
            in.nextLine();
            return returnList;
        } else if (status == 2){
            Show temp = shows.get(0);
            for (int i = 1; i < returnList.size(); i++){
                if (temp.getPerformer().compareTo(shows.get(i).getPerformer()) < 0){
                    returnList.add(temp);
                    temp = shows.get(i);
                } else {
                    returnList.add(shows.get(i));
                    temp = shows.get(i);
                }
            }
        }
        return returnList;
    }

}
