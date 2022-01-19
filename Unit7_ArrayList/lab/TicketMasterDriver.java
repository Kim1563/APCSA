package Unit7_ArrayList.lab;

import java.io.FileNotFoundException;
import java.util.*;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Show> shows = new ArrayList<>();
        TicketMaster ticketMaster = new TicketMaster(shows);
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the TicketMaster Console");
        System.out.println("======================================");
        System.out.println("In the following prompt, type an integer from 0-6 to view the available tickets:");
        System.out.println("\t\t(0) View all tickets (not alphabetical)");
        System.out.println("\t\t(1) View all tickets (ordered A-Z)");
        System.out.println("\t\t(2) View all tickets (ordered Z-A)");
        System.out.println("\t\t(3) View all tickets (sorted by price - low to high)");
        System.out.println("\t\t(4) View all tickets (sorted by price - high to low)");
        System.out.println("\t\t(5) Search by location");
        System.out.println("\t\t(6) Exit TicketMaster");
        System.out.println();

        try {
            ticketMaster.addShows();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (Exception e){
            System.out.println("An error caused an exception");
        }

        boolean flag = true;
        while (flag){
            try {
                System.out.print("Enter an integer from 1-6: ");
                int input = in.nextInt();
                if (input >= 1 && input <= 6){
                    flag = false;
                    if (input == 6){
                        System.out.println("Thanks for using TicketMaster");
                        System.exit(420);
                    } else {
                        process(input, shows);
                        System.out.println(ticketMaster.toString());
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
                System.out.println("An unexpected error led to an exception, please try again");
                in.nextLine();
            }
        }

    }

    public static void process(int status, ArrayList<Show> shows){
        if (status == 1){
            Show temp = shows.get(0);
            for (Show s : shows){
                if (temp.getcompareTo(s))
            }
        }
    }
}
