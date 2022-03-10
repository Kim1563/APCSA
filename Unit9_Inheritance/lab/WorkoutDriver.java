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

        boolean flag1 = true;

        while (flag1) {
            try {
                System.out.println("\nHow many weeks would you like to schedule?");
                numWeeks = in.nextInt();
                in.nextLine();
                if (numWeeks < 1){
                    System.out.println("Please make sure you have at least one week!");
                } else {
                    flag1 = false;
                    break;
                }
            } catch(InputMismatchException e){
                System.out.println("Please try again, enter a valid integer:");
                in.nextLine();
            } catch(Exception e){
                System.out.println("An unexpected exception led to an error. Please try again");
                in.nextLine();
            }
        }

        System.out.println("\nGreat, let's take a look at your " + numWeeks + " week schedule!\n");

        WorkoutPlan workoutPlan = new WorkoutPlan(numWeeks);

        System.out.println(workoutPlan);

        System.out.println("Time to start working out!\n");

        for (int i = 0; i < workoutPlan.getWorkouts().length; i++) {
            boolean flag2 = true;
            while (flag2) {
                try {
                    System.out.println("\nType \"Start\" to to complete one week of workouts:");
                    String userReady = in.nextLine();
                    if (!userReady.equalsIgnoreCase("Start")) {
                        System.out.println("\nNot ready? Don't worry, you've got this!");
                    } else {
                        flag2 = false;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please type a valid message!");
                    in.nextLine();
                } catch (Exception e) {
                    System.out.println("An unexpected exception led to an error. Please try again");
                    in.nextLine();
                }
            }

            if (workoutPlan.getCurrentWorkoutWeek() < workoutPlan.getWorkouts().length - 1) {
                workoutPlan.workoutNextWeek();
                System.out.println("\n*** CURRENT PROGRESS ***");
                workoutPlan.printProgress();
            } else {
                workoutPlan.workoutNextWeek();
                System.out.println("\n*** CONGRATULATIONS ***");
                System.out.println("You have completed your " + workoutPlan.getWorkouts().length + " week program!");
                System.out.println("Here is a summary of your entire plan:\n");
                workoutPlan.printProgress();
                System.out.println("\nWe hope you continue to progress towards your fitness goals");

                System.exit(420);
            }
        }


    }

}
