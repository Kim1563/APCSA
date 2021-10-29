package Unit5_Classes.homework.PartnerProject;

public class Grade {
    private double grade;
    private String letterGrade;

    public Grade(double grade){
        this.grade = grade;
        letterGrade = setLetterGrade(grade);
    }
    
    private void setLetterGrade(double grade){
        if (grade >= 98){
            this.letterGrade = "A+";
        } else if (grade >= 93 && grade < 98){
            this.letterGrade = "A";
        } else if (grade >= 90 && grade < 93){
            this.letterGrade = "A-";
        }
}
