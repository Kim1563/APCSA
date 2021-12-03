package Unit6_Arrays.lab;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class TriviaGame {
    private ArrayList<Question> allQuestions;

    private int streak;
    private int totalPointsEarned;

    File questionsFile = new File("TriviaQuestions.txt");

    public TriviaGame(ArrayList<Question> allQuestions) {
        this.allQuestions = allQuestions;
        this.streak = 0;
        this.totalPointsEarned = 0;
    }

    public ArrayList<Question> getAllQuestions() {
        return allQuestions;
    }

    public void setAllQuestions(ArrayList<Question> allQuestions) {
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
        Scanner in = new Scanner(questionsFile);

        while (in.hasNextLine()){
            String question = in.nextLine();
            String correctAnswer = in.nextLine();
            String choice1 = in.nextLine();
            String choice2 = in.nextLine();

            if (in.nextLine().equals("*")){
                Question q = new Question(question, choice1, choice2, correctAnswer);
                allQuestions.add(q);
                in.nextLine();
            } else {
                String choice3 = in.nextLine();
                String choice4 = in.nextLine();
                Question q = new Question(question, choice1, choice2, choice3, choice4, correctAnswer);
                allQuestions.add(q);
                in.nextLine();
            }

            if(!in.hasNextLine()){
                break;
            }
        }
    }
}
