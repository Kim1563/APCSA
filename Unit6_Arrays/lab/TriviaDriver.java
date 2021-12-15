package Unit6_Arrays.lab;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        System.out.print("Welcome to a random trivia game made on Java! Answer questions to earn points and view your stats by pressing N! Please enter your name here: ");
        String name = in.nextLine();

        System.out.println("Hello " + name + "!\n");
        TriviaGame game = new TriviaGame();


        game.setQuestions();
        game.setStreak(0);
        game.setAllQuestions(game.shuffle(game.getAllQuestions()));

        System.out.print("Do you want a question? (Y or N): ");
        String decision = in.nextLine();
        int index = 0;

        while (!decision.equalsIgnoreCase("N") && index < 15){
            Question currentQuestion = game.getAllQuestions()[index];
            System.out.println(currentQuestion.toString());

            System.out.print("Type your answer: ");
            String userAnswer = in.nextLine();

            if (userAnswer.equalsIgnoreCase(currentQuestion.getCorrectAnswer())){

                System.out.println("========================================================");
                System.out.println("Nice job! You were correct!");
                System.out.println("Points earned: " + currentQuestion.getPointValue());
                System.out.println("Streak points earned: " + game.getStreak() * 50);
                System.out.println("========================================================");

                game.setTotalPointsEarned(game.getTotalPointsEarned() + currentQuestion.getPointValue());

                game.setStreak(game.getStreak() + 1);

                System.out.println("========================================================");
                System.out.println("Current score: " + game.getTotalPointsEarned());
                System.out.println("Current streak: " + game.getStreak());
                System.out.println("========================================================");

                game.setQuestionsCorrect(game.getQuestionsCorrect() + 1);

                int tempStreak = game.getStreak();

                if (game.getStreak() > tempStreak){
                    game.setHighestStreak(game.getStreak());
                }
            } else {
                System.out.println("========================================================");
                System.out.println("You were incorrect!");
                System.out.println("The correct answer was: " + game.getAllQuestions()[index].getCorrectAnswer());
                System.out.println("Points lost: " + game.getAllQuestions()[index].getPointValue());

                game.setTotalPointsEarned(game.getTotalPointsEarned() - currentQuestion.getPointValue());

                System.out.println("========================================================");
                System.out.println("Current score: " + game.getTotalPointsEarned());

                game.setStreak(0);

                System.out.println("Current streak: " + game.getStreak());
                System.out.println("========================================================");
            }

            game.setQuestionsAnswered(game.getQuestionsAnswered() + 1);

            index++;

            if (decision.equalsIgnoreCase("N") || index == 15){
                gameOver(game);
                break;
            }

            System.out.print("Do you want a question? (Y or N): ");
            decision = in.nextLine();
        }
    }

    /**
     * Runs when game is over, displays statistics of the game
     * @param game current game
     */
    public static void gameOver(TriviaGame game){
        System.out.println("========================================================");
        System.out.println("Your highest streak: " + game.getHighestStreak());
        System.out.println("Your final score: " + game.getTotalPointsEarned());
        System.out.println("Number of questions answered correctly: " + game.getQuestionsCorrect());
        System.out.println("Percentage of questions answered correctly: " + Math.round(game.getQuestionsCorrect()/(double)game.getQuestionsAnswered() * 100) + "%");
        System.out.println("========================================================");
    }
}
