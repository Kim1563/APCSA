package Unit6_Arrays.lab;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        File questionsFile = new File("TriviaQuestions.txt");

        System.out.print("Welcome to Trivjava! Please enter your name here: ");
        String name = in.nextLine();

        System.out.println("Hello " + name + "!\n");
        TriviaGame game = new TriviaGame();
        game.setQuestions(questionsFile);

        System.out.print("Do you want a question? (Y or N): ");
        String decision = in.nextLine();
        while (!decision.equalsIgnoreCase("N")){
            int index = 0;
            System.out.println(game.getAllQuestions().get(index).toString());

            System.out.print("Type your answer: ");
            String userAnswer = in.nextLine();

            if (userAnswer.equalsIgnoreCase(game.getAllQuestions().get(index).getCorrectAnswer())){
                System.out.println("Nice job! You were correct!");
                System.out.println("Points earned: " + game.getAllQuestions().get(index).getPointValue());

                game.setTotalPointsEarned(game.getTotalPointsEarned() + game.getAllQuestions().get(index).getPointValue());
            } else {
                System.out.println("You were incorrect!");
                System.out.println("The correct answer was: " + game.getAllQuestions().get(index).getCorrectAnswer());
                System.out.println("Points lost: " + game.getAllQuestions().get(index).getPointValue());

                game.setTotalPointsEarned(game.getTotalPointsEarned() - game.getAllQuestions().get(index).getPointValue());
            }

            decision = in.nextLine();

            if (decision.equalsIgnoreCase("N")){
                System.exit(0);
            }
        }
    }
}
