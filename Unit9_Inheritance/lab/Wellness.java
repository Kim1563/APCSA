package Unit9_Inheritance.lab;

public class Wellness extends Workout{
    private int numStretches;

    public Wellness(String name, int workoutNumber, int duration, int numStretches) {
        super(name, workoutNumber, duration);
        this.numStretches = numStretches;
    }

    public int getNumStretches() {
        return numStretches;
    }

    public void setNumStretches(int numStretches) {
        this.numStretches = numStretches;
    }

    @Override
    /**
     * Returns calculated total calories burned based on product of randomly generated calories burned and number of stretches
     */
    public int startExercise(){
        int calsBurned = (int)(Math.random() * 6) + 5;
        return calsBurned * numStretches;
    }

    @Override
    /**
     * Returns a formatted String for a Wellness workout
     */
    public String toString(){
        String output = "";
        output += "Workout #" + super.getWorkoutNumber() + "\t\tStretching\t\t" + super.getDuration();

        return output;
    }
}
