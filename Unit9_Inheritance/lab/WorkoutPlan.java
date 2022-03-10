package Unit9_Inheritance.lab;

public class WorkoutPlan {
    public final int NUM_DAYS_PER_WEEK = 7;
    private int workoutNum = 0;
    private int numWorkoutsCompleted, numWorkoutsSkipped, currentWorkoutWeek, totalCalsBurned, totalMinsExercise;
    private Workout[][] workouts;

    public WorkoutPlan(int numWeeks){
        this.workouts = makePlan(numWeeks);
        this.numWorkoutsCompleted = 0;
        this.numWorkoutsSkipped = 0;
        this.currentWorkoutWeek = 0;
        this.totalCalsBurned = 0;
        this.totalMinsExercise = 0;
    }

    public int getWorkoutNum() {
        return workoutNum;
    }

    public void setWorkoutNum(int workoutNum) {
        this.workoutNum = workoutNum;
    }

    public int getNumWorkoutsCompleted() {
        return numWorkoutsCompleted;
    }

    public void setNumWorkoutsCompleted(int numWorkoutsCompleted) {
        this.numWorkoutsCompleted = numWorkoutsCompleted;
    }

    public int getNumWorkoutsSkipped() {
        return numWorkoutsSkipped;
    }

    public void setNumWorkoutsSkipped(int numWorkoutsSkipped) {
        this.numWorkoutsSkipped = numWorkoutsSkipped;
    }

    public int getCurrentWorkoutWeek() {
        return currentWorkoutWeek;
    }

    public void setCurrentWorkoutWeek(int currentWorkoutWeek) {
        this.currentWorkoutWeek = currentWorkoutWeek;
    }

    public int getTotalCalsBurned() {
        return totalCalsBurned;
    }

    public void setTotalCalsBurned(int totalCalsBurned) {
        this.totalCalsBurned = totalCalsBurned;
    }

    public int getTotalMinsExercise() {
        return totalMinsExercise;
    }

    public void setTotalMinsExercise(int totalMinsExercise) {
        this.totalMinsExercise = totalMinsExercise;
    }

    public Workout[][] getWorkouts() {
        return workouts;
    }

    public void setWorkouts(Workout[][] workouts) {
        this.workouts = workouts;
    }

    @Override
    /**
     * Returns formatted String for one week of workouts
     */
    public String toString(){
        String output = "";

        for (int i = 0; i < workouts.length; i++) {
            output += "*** Week #" + (i + 1) + " ***\n";
            output += "WORKOUT NUM\t\tNAME\t\tMINUTES\n";

            for (Workout w : workouts[i]){
                output += w.toString();
                output += "\n";
            }

            output += "\n\n";
        }
        return output;
    }

    /**
     * Displays skipped workouts and updates instance variables
     */
    public void workoutNextWeek(){
        System.out.println("\nSkipped Workouts: ");
        for (Workout w : workouts[this.getCurrentWorkoutWeek()]){
            int randNum = (int)(Math.random() * 5) + 1;
            if (randNum == 1){
                System.out.println("You skipped workout #" + w.getWorkoutNumber());
                this.numWorkoutsSkipped ++;
            } else {
                this.numWorkoutsCompleted++;
                this.totalCalsBurned += w.startExercise();
                this.totalMinsExercise += w.getDuration();
            }
        }
        this.currentWorkoutWeek++;
    }

    /**
     * Prints formatted progress (all data for the week)
     */
    public void printProgress(){
        System.out.println("Number of workouts completed:\t" + this.numWorkoutsCompleted);
        System.out.println("Number of workouts skipped:\t\t" + this.numWorkoutsSkipped);
        System.out.println("Total minutes of exercise:\t\t" + this.totalMinsExercise);
        System.out.println("Total calories burned:\t\t\t" + this.totalCalsBurned);
    }

    /**
     * Makes a plan of Workouts
     * @param numWeeks Number of weeks influences how many rows of the array should be initialized
     * @return Returns the 2D array of all the Workouts in a plan
     */
    private Workout[][] makePlan(int numWeeks){
        Workout[][] output = new Workout[numWeeks][NUM_DAYS_PER_WEEK];
        for (int i = 0; i < output.length; i++){
            for (int j = 0; j < output[0].length; j++){
                int randNum = (int)(Math.random() * 3) + 1;

                // Randomly generates each workout per day
                if (randNum == 1){
                    output[i][j] = addCardioWorkout() ;
                }
                if (randNum == 2){
                    output[i][j] = addStrengthWorkout() ;
                }
                if (randNum == 3){
                    output[i][j] = addWellnessWorkout() ;
                }
            }
        }

        return output;
    }

    /**
     * Creates a single Cardio workout
     * @return Returns a Cardio workout with randomly generated duration and speed
     */
    private Cardio addCardioWorkout(){
        String name = "Running";
        int time = (int)(Math.random() * 31) + 10;
        int speed = (int)(Math.random() * 7) + 1;
        workoutNum++;
        return new Cardio(name, workoutNum, time, speed);
    }

    /**
     * Creates a single Strength workout
     * @return Returns a Strength workout with randomly generated duration and weight
     */
    private Strength addStrengthWorkout(){
        String name = "Lifting";
        int time = (int)(Math.random() * 46) + 15;
        int weight = (int)(Math.random() * 131) + 95;
        workoutNum++;
        return new Strength(name, workoutNum, time, weight);
    }

    /**
     * Creates a single Wellness workout
     * @return Returns a Wellness workout with randomly generated duration and number of stretches
     */
    private Wellness addWellnessWorkout(){
        String name = "Stretching";
        int time = (int)(Math.random() * 31) + 30;
        int numStretches = (int)(Math.random() * 5) + 8;
        workoutNum++;
        return new Wellness(name, workoutNum, time, numStretches);
    }
}
