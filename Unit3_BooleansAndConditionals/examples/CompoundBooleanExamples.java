package Unit3_BooleansAndConditionals.examples;

public class CompoundBooleanExamples {
    public static void main(String[] args) {
        String day = "Monday";
        int numHwAssignments = 2;

        if (day.equalsIgnoreCase("Saturday") || numHwAssignments == 0){
            System.out.println("Yay, video games!");
        } else {
            System.out.println("I guess I'll have to wait :(");
        }

        if (day.equalsIgnoreCase("Monday") && numHwAssignments <= 2){
            System.out.println("Yay, coding club!");
        } else {
            System.out.println("Today is a sad day :(");
        }

        if (!day.equalsIgnoreCase("Saturday") && !day.equalsIgnoreCase("Sunday")) {
            int randomNum = (int) (Math.random() * 10) + 1;
            if (numHwAssignments == 0) {
                if (randomNum <= 8) {
                    System.out.println("Exercise");
                } else {
                    System.out.println("No exercise");
                }
            } else {
                if (randomNum <= 3) {
                    System.out.println("Exercise");
                } else {
                    System.out.println("No exercise");
                }
            }
        } else {
            System.out.println("Exercise");
        }
    }
}
