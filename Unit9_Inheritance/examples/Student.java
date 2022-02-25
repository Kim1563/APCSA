package Unit9_Inheritance.examples;

public class Student extends Person{
    private int grade;
    private double GPA;

    public Student(String name, String birthday, int grade, double GPA){
        super (name, birthday);
        this.grade = grade;
        this.GPA = GPA;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
