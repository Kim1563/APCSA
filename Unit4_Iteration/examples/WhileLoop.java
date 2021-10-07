package Unit4_Iteration.examples;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        double avg;
        boolean isDone = false;


        while(!isDone){
            System.out.print("\nDo you have a score to enter? (Y or N) ");
            String reply = in.nextLine();
            if (reply.equalsIgnoreCase("Y")){
                System.out.print("\nEnter a score: ");
                int temp = in.nextInt();
                total += temp;
                count++;
                in.nextLine();
            } else {
                isDone = true;

            }
        }
        System.out.println("Total: " + total);
        System.out.println("Here is the average score: " + ((double)total / count));
    }
}
