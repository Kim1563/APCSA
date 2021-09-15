package Unit2_UsingObjects.Quiz;

public class Quiz {

    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the quiz name, number of MC's,
    // and extra credit status
    private String quizName;
    private int numMC;
    private boolean extraCredit;


    // *** WRITE CODE HERE ***
    // Part B
    // Create a default Quiz constructor that sets the name
    // to "M359 Pop Quiz", has 3 MC's, and offers no extra credit
    public Quiz(){
        quizName = "M359 Pop Quiz";
        numMC = 3;
        extraCredit = false;
    }


    // *** WRITE CODE HERE ***
    // Part C
    // Create a full Quiz constructor that accepts each instance
    // variable as a parameter
    public Quiz(String quizName, int numMC, boolean extraCredit){
        this.quizName = quizName;
        this.numMC = numMC;
        this.extraCredit = extraCredit;
    }


    /*
     / *** WRITE CODE HERE ***
     / Part D
     / Create a printInfo method that prints a nicely formatted
     / summary to the console with the following information:
     /      QUIZ NAME
     /          Number MC's:    #
     /          Has EC:         true/false
     */
    public void printInfo(){
        System.out.println("\t" + quizName);
        System.out.println("\t\tNumber MC's:\t" + numMC);
        System.out.println("\t\tHas EC:\t\t\t" + extraCredit);
    }


    // *** WRITE CODE HERE ***
    // Part E
    // Create an addMC method that accepts the number of MC questions
    // you are adding to this quiz as an input parameter, and updates
    // an appropriate instance variable.  This method does not return
    // anything
    public void addMC(int num){
        numMC += num;
    }


    // *** WRITE CODE HERE ***
    // Part F
    // Create a calcExtraCredit method that returns a random integer
    // between the range of [2,6]
    public int calcExtraCredit(){
        return (int)(Math.random() * 5) + 2;
    }

    // *** WRITE CODE HERE ***
    // Part G
    // Create a calcTotal method that accepts the point value for
    // each MC on the quiz and returns the total point value of quiz
    public int calcTotal(int pointValue){
        return pointValue * numMC;
    }


    // *** WRITE CODE HERE ***
    // Part H
    // Create all getter and setter methods
    public String getQuizName(){
        return quizName;
    }
    public int getNumMC(){
        return numMC;
    }
    public boolean getExtraCredit(){
        return extraCredit;
    }
    public void setName(String quizName){
        this.quizName = quizName;
    }
    public void setNumMC(int numMC){
        this.numMC = numMC;
    }
    public void setExtraCredit(boolean extraCredit){
        this.extraCredit = extraCredit;
    }


    // *** EXTRA CREDIT ***
    // Create a method named returnLastName that accepts a single parameter
    // (in the form of "FirstName LastName") and returns only the last name
    // Ex:  returnLastName("Mark Langer") would return "Langer"
    public String returnLastName(String name){
        int index = name.indexOf(" ");
        return name.substring(index + 1);
    }


}
