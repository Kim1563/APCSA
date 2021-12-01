package Unit6_Arrays.examples;

public class Course {
    private String subject;
    private String teacherName;
    private String currentGrade;
    private int period;

    // Constructor with all parameters
    public Course(String subject, String teacherName, String currentGrade, int period) {
        this.subject = subject;
        this.teacherName = teacherName;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    // Constructor for courses without teacher/grade (lunch, study hall, etc.)
    public Course(String subject, int period) {
        this.subject = subject;
        this.period = period;
        this.teacherName = "None";
        this.currentGrade = "None";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    // toString on one line
    public String toString(){
        return "\tSubject: " + subject + "\t\t\t\tTeacher: " + teacherName + "\t\t Current grade: " + currentGrade + "\t\t\t\tPeriod: " + period;
    }
}
