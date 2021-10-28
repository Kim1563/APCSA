package Unit5_Classes.homework.FRQs;

public class AdditionPattern {
    private int startNum;
    private int intervalNum;
    private int currentNum;

    public AdditionPattern(int startNum, int intervalNum) {
        this.startNum = startNum;
        this.intervalNum = intervalNum;
        currentNum = startNum;
    }

    public void next(){
        currentNum += intervalNum;
    }

    public void prev(){
        if (currentNum - intervalNum > startNum) {
            currentNum -= intervalNum;
        }
        currentNum = startNum;
    }

    public int currentNumber(){
        return currentNum;
    }
}
