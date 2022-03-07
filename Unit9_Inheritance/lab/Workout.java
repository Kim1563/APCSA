package Unit9_Inheritance.lab;

public class Workout {
    private String name;
    private int workoutNumber;
    private int duration;

    public Workout(String name, int workoutNumber, int duration) {
        this.name = name;
        this.workoutNumber = workoutNumber;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkoutNumber() {
        return workoutNumber;
    }

    public void setWorkoutNumber(int workoutNumber) {
        this.workoutNumber = workoutNumber;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * General startExercise for the Workout class
     * @return 0
     */
    public int startExercise(){
        System.out.println("Starting a workout");
        return 0;
    }

    @Override
    /**
     * Returns a generalized, formatted toString for the Workout class
     */
    public String toString(){
        String output = "";
        output += "Workout #" + workoutNumber + "\t\t" + name + "\t\t" + duration;

        return output;
    }
}
