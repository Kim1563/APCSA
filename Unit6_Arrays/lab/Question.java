package Unit6_Arrays.lab;

public class Question {
    private String questionText;

    private String answerChoice1;
    private String answerChoice2;
    private String answerChoice3;
    private String answerChoice4;

    private int numChoices;

    private String correctAnswer;

    private int pointValue;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswerChoice1() {
        return answerChoice1;
    }

    public void setAnswerChoice1(String answerChoice1) {
        this.answerChoice1 = answerChoice1;
    }

    public String getAnswerChoice2() {
        return answerChoice2;
    }

    public void setAnswerChoice2(String answerChoice2) {
        this.answerChoice2 = answerChoice2;
    }

    public String getAnswerChoice3() {
        return answerChoice3;
    }

    public void setAnswerChoice3(String answerChoice3) {
        this.answerChoice3 = answerChoice3;
    }

    public String getAnswerChoice4() {
        return answerChoice4;
    }

    public void setAnswerChoice4(String answerChoice4) {
        this.answerChoice4 = answerChoice4;
    }

    public int getNumChoices() {
        return numChoices;
    }

    public void setNumChoices(int numChoices) {
        this.numChoices = numChoices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    /**
     * Generates a random number of points from 100-1000
     * @return int randomly generated points
     */
    private int generatePoints(){
        int randNum = (int)(Math.random() * 10) + 1;
        return randNum * 100;
    }

    // Constructor for questions with four answer choices
    public Question(String questionText, String answerChoice1, String answerChoice2, String answerChoice3, String answerChoice4, String correctAnswer) {
        this.questionText = questionText;
        this.answerChoice1 = answerChoice1;
        this.answerChoice2 = answerChoice2;
        this.answerChoice3 = answerChoice3;
        this.answerChoice4 = answerChoice4;
        this.correctAnswer = correctAnswer;
        this.numChoices = 4;
        this.pointValue = generatePoints();
    }

    // Constructor for questions with two answer choices
    public Question(String questionText, String answerChoice1, String answerChoice2, String correctAnswer) {
        this.questionText = questionText;
        this.answerChoice1 = answerChoice1;
        this.answerChoice2 = answerChoice2;
        this.numChoices = 2;
        this.pointValue = generatePoints();
    }

    /**
     * Returns formatted String
     * @return String that is formatted with question text and answer choices
     */
    public String toString(){
        String output = questionText;
        output += "\n\tA. " + this.answerChoice1;
        output += "\n\tB. " + this.answerChoice2;
        if (numChoices == 4) {
            output += "\n\tC. " + this.answerChoice3;
            output += "\n\tD. " + this.answerChoice4;
        }
        output += "\n\tPoint value: " + this.pointValue;
        return output;
    }
}
