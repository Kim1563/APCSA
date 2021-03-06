package Unit5_Classes.homework.PartnerProject;

import java.util.*;

public class Grade {
    private double grade;
    private String letterGrade;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
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

    /**
     * Finds the letter grade given a double grade
     * @param grade double that represents the grade percentage
     * @return letter grade String that represents the letter grade earned by the percentage
     */
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
        } else if (grade > 50 && grade < 60){
            letterGrade = "F";
        } else {
            letterGrade = "Fremd 50";
        }
        return letterGrade;
    }

    public String getGrade() {
        if(grade<=100 && grade>90){
            return ANSI_GREEN + grade + ANSI_RESET;
        }
        if(grade<=90 && grade > 80){
            return ANSI_YELLOW + grade + ANSI_RESET;
        }
        if(grade <=80 && grade > 70) {
            return ANSI_BLUE + grade + ANSI_RESET;
        }
        return ANSI_RED + grade + ANSI_RESET;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    /**
     * Changes a certain grade based on whether account is a teacher account
     * @param isTeacherViewing If true, allows teacher to edit grade
     * @param gradeChanged String that describes the subject in which the grade is changed
     */
    public void setGrade(boolean isTeacherViewing, String gradeChanged){
        if(isTeacherViewing){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What do you want to change the " + gradeChanged + " grade to?");
            double newGrade = scanner.nextDouble();
            this.grade = newGrade;
            this.letterGrade = getLetterGrade(grade);
        }
    }

    /**
     * Displays the grading scale
     */
    public static void viewScale(){
        System.out.println("98+ = A+\n" +
                "93-98 = A\n" +
                "90-93 = A-\n" +
                "88-90 = B+\n" +
                "83-88 = B\n" +
                "80-83 = B-\n" +
                "78-80 = C+\n" +
                "73-78 = C\n" +
                "70-73 = C-\n" +
                "68-70 = D+\n" +
                "63-68 = D\n" +
                "60-63 = D-\n" +
                "50-60 - F\n" +
                "0-50 = Fremd 50");
    }
}