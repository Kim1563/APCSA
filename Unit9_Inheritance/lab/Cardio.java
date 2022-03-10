package Unit9_Inheritance.lab;

public class Cardio extends Workout{
    private double distance, speed;

    public Cardio(String name, int workoutNumber, int duration, double speed) {
        super(name, workoutNumber, duration);
        this.speed = speed;
        this.distance = speed * (double) duration / 60;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    /**
     * Calculates and returns the total amount of calories burned based on product of random number and distance (miles)
     */
    public int startExercise(){
        int calsBurned = (int) (Math.random() * 61) + 80;
        return (int) (calsBurned * distance);
    }

    @Override
    /**
     * Returns a formatted String for a Cardio workout
     */
    public String toString(){
        String output = "";
        output += "Workout #" + super.getWorkoutNumber() + "\t\tRunning\t\t" + super.getDuration();

        return output;
    }
}
