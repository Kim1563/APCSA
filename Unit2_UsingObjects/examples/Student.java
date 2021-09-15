package Unit2_UsingObjects.examples;

public class Student {
    // Instance variables
    private String name;
    private int gradeLevel;
    private double gpa;

    // Constructor with name, grade level, and gpa
    public Student(String name, int gradeLevel, double gpa){
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    // Constructor with only name: gradeLevel is defaulted to 9 (freshman) and gpa is defaulted to -1.0
    public Student(String name){
        this.name = name;
        gradeLevel = 9;
        gpa = -1.0;
    }
}
