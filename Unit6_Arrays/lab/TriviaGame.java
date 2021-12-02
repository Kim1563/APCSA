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

    private void setQuestions() throws FileNotFoundException {
        Scanner in = new Scanner(questionsFile);

        while (in.hasNextLine()){
            
        }
    }
}
