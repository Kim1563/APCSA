package Unit6_Arrays.examples;

public class Student {
    private String name;
    private Course[] myClasses;

    public Student(String name) {
        this.name = name;
        this.myClasses = new Course[8]; // 8-period day with empty classes
    }

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses; // Fully set-up schedule
    }

    // toString method that returns 1. Student's name, 2. Student classes
    public String toString(){
        String returnStr = "";
        returnStr += name;
        if (myClasses[0] == null){
            return name + "\nNo classes added";
        } else {
            for (Course c : myClasses) {
                returnStr += "\n" + c.toString();
            }
        }
        return returnStr;
    }
}
