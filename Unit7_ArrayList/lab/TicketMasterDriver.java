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
}
