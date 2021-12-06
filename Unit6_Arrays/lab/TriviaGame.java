package Unit6_Arrays.lab;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class TriviaGame {
    private Question[] allQuestions;

    private int streak;
    private int totalPointsEarned;

    public TriviaGame() {
        this.allQuestions = new Question[100];
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

    public void setQuestions(File questionsFile) throws FileNotFoundException {
        Scanner in = new Scanner(questionsFile);

        while (in.hasNextLine()){
            String question = in.nextLine();
            String correctAnswer = in.nextLine();
            String choice1 = in.nextLine();
            String choice2 = in.nextLine();

            if(!in.hasNextLine()){
                break;
            }
        }
    }
}
