package Unit9_Inheritance.lab;

public class Account {
    private String name;
    private int totalCalsBurned, totalMinsExercise, numWorkoutsCompleted;

    public Account(String name){
        this.name = name;
        this.totalCalsBurned = 0;
        this.totalMinsExercise = 0;
        this.numWorkoutsCompleted = 0;
    }

    public Account(){
        this.name = "Anonymous";
        this.totalCalsBurned = 0;
        this.totalMinsExercise = 0;
        this.numWorkoutsCompleted = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNumWorkoutsCompleted() {
        return numWorkoutsCompleted;
    }

    public void setNumWorkoutsCompleted(int numWorkoutsCompleted) {
        this.numWorkoutsCompleted = numWorkoutsCompleted;
    }
}
