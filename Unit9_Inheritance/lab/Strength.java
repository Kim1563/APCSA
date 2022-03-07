package Unit9_Inheritance.lab;

public class Strength extends Workout{
    private int lbs;

    public Strength(String name, int workoutNumber, int duration, int lbs) {
        super(name, workoutNumber, duration);
        this.lbs = lbs;
    }

    public int getLbs() {
        return lbs;
    }

    public void setLbs(int lbs) {
        this.lbs = lbs;
    }

    @Override
    /**
     * Returns total calories calculated by product of randomly generated multiplier and weight used
     */
    public int startExercise(){
        int multiplier = (int)(Math.random() * 3) + 1;
        return multiplier * lbs;
    }

    @Override
    /**
     * Returns a formatted String for a Strength workout
     */
    public String toString(){
        String output = "";
        output += "Workout #" + super.getWorkoutNumber() + "\t\tLifting\t\t" + super.getDuration();

        return output;
    }
}
