package Unit6_Arrays.lab;

import java.util.*;

public class TriviaGame {
    private ArrayList<Question> allQuestions;

    private static int streak = 0;
    private static int totalPointsEarned = 0;

    public TriviaGame(ArrayList<Question> allQuestions) {
        this.allQuestions = allQuestions;
    }
}
