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
        } else if (grade >= 88 && grade < 90){
            this.letterGrade = "B+";
        } else if (grade >= 83 && grade < 88){
            this.letterGRade = "B";
        } else if (grade >= 80 && grade < 83){
            this.letterGrade = "B-";
        } else if (grade >= 78 && grade < 80){
            this.letterGrade = "C+";
        }
    }
}
