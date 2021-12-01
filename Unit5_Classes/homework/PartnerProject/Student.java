package Unit5_Classes.homework.PartnerProject;

import java.util.*;

public class Student {
    private String name;
    private int gradeLevel;
    private ArrayList<Grade> grades;
    private String address;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public Student(){
        this.name = "";
        this.gradeLevel = 0;
        grades = new ArrayList<Grade>();
        this.address = "";
    }

    public Student(String name, int gradeLevel, String address) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        grades = new ArrayList<Grade>();
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    /**
     * For each Grade object in grades ArrayList, print a formatted version of the grade with
     *  percentage and letter grade
     * @return Formatted String with every grade and corresponding letter grade
     */
    public String getGrades() {
        String returnStr = "";
        ArrayList<String> gradeOrder = new ArrayList<String>();
        gradeOrder.add("English");
        gradeOrder.add("Math");
        gradeOrder.add("History");
        gradeOrder.add("Comp Sci");
        gradeOrder.add("Chemistry");
        gradeOrder.add("PE");
        gradeOrder.add("Band");
        for (int i = 0; i < grades.size(); i++) {
            returnStr += gradeOrder.get(i) + "\n  " + grades.get(i).getGrade() + "\t---\t " + grades.get(i).getLetterGrade() + "\n";
        }
        return returnStr;
    }

    /**
     * Adds a specified Grade object to the grades ArrayList
     * @param newGrade Grade object to be added
     */
    public void addGrade(Grade newGrade){
        grades.add(newGrade);
    }

    /**
     * If parent, allows the parent to change the student's address
     * @param isParentViewing Determines whether a parent account is acccessing the student's account
     */
    public void setAddress(boolean isParentViewing) {
        if (isParentViewing) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What do you want to change the address to?");
            String newAddress = scanner.nextLine();
            this.address = newAddress;
        }
    }


    public String getAddress() {
        return address;
    }


    // Classes for grades
    public void changeEnglish(){
        grades.get(0).setGrade(true, "English");
    }
    public void changeMath(){
        grades.get(1).setGrade(true, "Math");
    }
    public void changeHistory(){
        grades.get(2).setGrade(true, "History");
    }
    public void changeComputerScience(){
        grades.get(3).setGrade(true, "Computer Science");
    }
    public void changeChemistry(){
        grades.get(4).setGrade(true, "Chemistry");
    }
    public void changePE(){
        grades.get(5).setGrade(true, "PE");
    }
    public void changeBand(){
        grades.get(6).setGrade(true, "Band");
    }

}