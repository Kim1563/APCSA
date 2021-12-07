package Unit6_Arrays.lab;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class TriviaGame {
    private Question[] allQuestions;

    private int streak;
    private int totalPointsEarned;

    public TriviaGame() {
        this.allQuestions = new Question[15];
        this.streak = 0;
        this.totalPointsEarned = 0;
    }

    public Question[] getAllQuestions() {
        return allQuestions;
    }

    public void setAllQuestions(Question[] allQuestions) {
        this.allQuestions = allQuestions;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getTotalPointsEarned() {
        return totalPointsEarned;
    }

    public void setTotalPointsEarned(int totalPointsEarned) {
        this.totalPointsEarned = totalPointsEarned;
    }

    public void setQuestions() throws FileNotFoundException {

        File questionsFile = new File("TriviaQuestionsScience.txt");
        Scanner in = new Scanner(questionsFile);

        int index = 0;

        while (in.hasNextLine()){
            String question = in.nextLine();
            String correctAnswer = in.nextLine();
            String choice1 = in.nextLine();
            String choice2 = in.nextLine();
            String choice3 = in.nextLine();
            String choice4 = in.nextLine();

            this.allQuestions[index] = new Question(question, choice1, choice2, choice3, choice4, correctAnswer);

            if(!in.hasNextLine()){
                break;
            }
        }
    }
}
