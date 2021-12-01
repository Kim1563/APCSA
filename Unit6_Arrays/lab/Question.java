package Unit6_Arrays.lab;

public class Question {
    private String questionText;

    private String answerChoice1;
    private String answerChoice2;
    private String answerChoice3;
    private String answerChoice4;

    private String correctAnswer;

    private int pointValue;

    private int generatePoints(){
        int randNum = (int)(Math.random() * 10) + 1;
        return randNum * 100;
    }
}
