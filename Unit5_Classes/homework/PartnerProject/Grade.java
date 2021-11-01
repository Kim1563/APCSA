package Unit5_Classes.homework.PartnerProject;

import java.util.*;

public class Grade {
    private double grade;
    private String letterGrade;
    /* Order:
       English,
       Math,
       History,
       Computer Science,
       Chemistry,
       PE,
       Band
     */
    public Grade(double grade){
        this.grade = grade;
        this.letterGrade = getLetterGrade(grade);
    }

    private String getLetterGrade(double grade){
        if (grade >= 98){
            this.letterGrade = "A+";
        } else if (grade >= 93 && grade < 98){
            this.letterGrade = "A";
        } else if (grade >= 90 && grade < 93){
            this.letterGrade = "A-";
        } else if (grade >= 88 && grade < 90){
            this.letterGrade = "B+";
        } else if (grade >= 83 && grade < 88){
            this.letterGrade = "B";
        } else if (grade >= 80 && grade < 83){
            this.letterGrade = "B-";
        } else if (grade >= 78 && grade < 80){
            this.letterGrade = "C+";
        } else if (grade >= 73 && grade < 78){
            this.letterGrade = "C";
        } else if (grade >= 70 && grade < 73){
            this.letterGrade = "C-";
        } else if (grade >= 68 && grade < 70){
            this.letterGrade = "D+";
        } else if (grade >= 63 && grade < 68){
            this.letterGrade = "D";
        } else if (grade >= 60 && grade < 63){
            this.letterGrade = "D-";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }

    public double getGrade() {
        return grade;
    }

    public String getLetterGrade() {
        return letterGrade;
    }
    public void setGrade(boolean isTeacherViewing, String gradeChanged){
        if(isTeacherViewing){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What do you want to change the " + gradeChanged + " grade to?");
            double newGrade = scanner.nextDouble();
            this.grade = newGrade;
        }
    }
}
