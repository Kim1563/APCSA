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

        System.out.print("Do you want a question? (Y or N): ");
        String decision = in.nextLine();
        int index = 0;

        while (!decision.equalsIgnoreCase("N")){
            System.out.println(game.getAllQuestions()[index].toString());

            System.out.print("Type your answer: ");
            String userAnswer = in.nextLine();

            if (userAnswer.equalsIgnoreCase(game.getAllQuestions()[index].getCorrectAnswer())){
                System.out.println("Nice job! You were correct!");
                System.out.println("Points earned: " + game.getAllQuestions()[index].getPointValue());

                game.setTotalPointsEarned(game.getTotalPointsEarned() + game.getAllQuestions()[index].getPointValue());
            } else {
                System.out.println("You were incorrect!");
                System.out.println("The correct answer was: " + game.getAllQuestions()[index].getCorrectAnswer());
                System.out.println("Points lost: " + game.getAllQuestions()[index].getPointValue());

                game.setTotalPointsEarned(game.getTotalPointsEarned() - game.getAllQuestions()[index].getPointValue());
            }

            index++;

            if (decision.equalsIgnoreCase("N")){
                System.exit(0);
            }
        }
    }
}
