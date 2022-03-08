package Unit9_Inheritance.lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkoutDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numWeeks = 0;

        // Welcome message
        System.out.println("************************************************");
        System.out.println("*** Welcome to your customized workout plan! ***");
        System.out.println("************************************************");
        System.out.println();

        try {
            System.out.println("How many weeks would you like to schedule?");
            numWeeks = in.nextInt();
            while (numWeeks <= 0){
                System.out.println("\nPlease make sure you have more than 0 weeks in your schedule!");
                System.out.println("\nHow many weeks would you like to schedule?");
                numWeeks = in.nextInt();
            }
        } catch (InputMismatchException e){
            System.out.println("Please try again, enter a valid integer:");
        } catch (Exception e){
            System.out.println("An unexpected exception led to an error. Please try again");
        }

        System.out.println("\nGreat, let's take a look at your " + numWeeks + " week schedule!\n");

        WorkoutPlan workoutPlan = new WorkoutPlan(numWeeks);

        System.out.println(workoutPlan);
    }

}
