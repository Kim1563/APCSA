package Unit6_Arrays.lab;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class TriviaGame {
    private ArrayList<Question> allQuestions;

    private static int streak = 0;
    private static int totalPointsEarned = 0;

    File questionsFile = new File("TriviaQuestions.txt");

    public TriviaGame(ArrayList<Question> allQuestions) {
        this.allQuestions = allQuestions;
    }

    public void setQuestions() throws FileNotFoundException {
        Scanner in = new Scanner(questionsFile);

        while (in.hasNextLine()){
            String question = in.nextLine();
            String correctAnswer = in.nextLine();
            String answerChoice1 = in.nextLine();
            String answerChoice2 = in.nextLine();
            if (in.nextLine().equals("*")){
                Question q = new Question(question, answerChoice1, answerChoice2, correctAnswer);
                this.allQuestions.add(q);
                in.nextLine();
            } else {
                String answerChoice3 = in.nextLine();
                String answerChoice4 = in.nextLine();
                Question q = new Question(question, answerChoice1, answerChoice2, answerChoice3, answerChoice4, correctAnswer);
                this.allQuestions.add(q);
                in.nextLine();
            }

            if (!in.hasNextLine()){
                break;
            }
        }

    }
}
