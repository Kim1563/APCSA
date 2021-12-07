package Unit6_Arrays.lab;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        System.out.print("Welcome to Trivjava! Please enter your name here: ");
        String name = in.nextLine();

        System.out.println("Hello " + name + "!\n");
        TriviaGame game = new TriviaGame();

        game.setQuestions();
        game.setStreak(1);

        System.out.print("Do you want a question? (Y or N): ");
        String decision = in.nextLine();
        int index = 0;

        while (!decision.equalsIgnoreCase("N")){
            Question currentQuestion = game.getAllQuestions()[index];
            System.out.println(currentQuestion.toString());

            System.out.print("Type your answer: ");
            String userAnswer = in.nextLine();

            if (userAnswer.equalsIgnoreCase(currentQuestion.getCorrectAnswer())){
                System.out.println("Nice job! You were correct!");
                System.out.println("Points earned: " + currentQuestion.getPointValue());

                game.setTotalPointsEarned(game.getTotalPointsEarned() + currentQuestion.getPointValue());

                System.out.println("Current score: " + game.getTotalPointsEarned());
                System.out.println("Current streak: " + game.getStreak());


                int tempStreak = game.getStreak();

                game.setStreak(game.getStreak() + 1);

                if (game.getStreak() > tempStreak){
                    game.setHighestStreak(game.getStreak());
                }
            } else {
                System.out.println("You were incorrect!");
                System.out.println("The correct answer was: " + game.getAllQuestions()[index].getCorrectAnswer());
                System.out.println("Points lost: " + game.getAllQuestions()[index].getPointValue());

                game.setTotalPointsEarned(game.getTotalPointsEarned() - currentQuestion.getPointValue());

                System.out.println("Current score: " + game.getTotalPointsEarned());

                game.setStreak(0);

                System.out.println("Current streak: " + game.getStreak());

            }

            System.out.print("Do you want a question? (Y or N): ");
            decision = in.nextLine();

            index++;

            if (decision.equalsIgnoreCase("N")){
                System.out.println("Your highest streak: " + game.getHighestStreak());
                System.out.println("Your final score: " + game.getTotalPointsEarned());
            }
        }
    }
}
