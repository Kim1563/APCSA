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

        /* while (in.hasNextLine()){
            String question = in.nextLine();

        }
        */

        // Test Loop
        for (int i = 0; i < 12; i++){
            String temp = in.nextLine();
            if (temp.substring(0, 2).equalsIgnoreCase("#Q")){
                System.out.println(temp);
            }
        }
    }
}
