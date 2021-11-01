package Unit5_Classes.homework.PartnerProject;

import java.util.*;

public class Student {
    private String name;
    private int gradeLevel;
    private ArrayList<Grade> grades;
    private String address;
    private String parentPhoneNumber;
    private String SSNumber;
    public Student(String name, int gradeLevel, String address, String parentPhoneNumber, String SSNumber) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        grades = new ArrayList<Grade>();
        this.address = address;
        this.parentPhoneNumber = parentPhoneNumber;
        this.SSNumber = SSNumber;
    }

    public String getName() {
        return name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public String getGrades() {
        String returnStr = "";
        for (Grade grade : grades) {
            returnStr += grade.getGrade() + "\t---\t" + grade.getLetterGrade() + "\n";
        }
        return returnStr;
    }

    public void addGrade(Grade newGrade){
        grades.add(newGrade);
    }

    public void setAddress(boolean isParentViewing) {
        if(isParentViewing) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What do you want to change the address to?");
            String newAddress = scanner.nextLine();
            this.address = newAddress;
        }
    }

    public void setParentPhoneNumber(boolean isParentViewing) {
        if(isParentViewing){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What do you want to change the parent phone number to?");
            String newPhone = scanner.nextLine();
            this.parentPhoneNumber = newPhone;
        }
    }

    public String getAddress() {
        return address;
    }

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public String getSSNumber() {
        return SSNumber;
    }

    public void setSSNumber(boolean isParentViewing) {
        if(isParentViewing){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What do you want to change the social security number to?");
            String newPhone = scanner.nextLine();
            this.parentPhoneNumber = newPhone;
        }
    }
    public void changeEnglish(){
        grades.get(0).setGrade(true,"English");
    }
    public void changeMath(){
        grades.get(1).setGrade(true, "Math");
    }
    public void changeHistory(){
        grades.get(2).setGrade(true,"History");
    }
    public void changeComputerScience(){
        grades.get(3).setGrade(true,"Computer Science");
    }
    public void changeChemistry(){
        grades.get(4).setGrade(true,"Chemistry");
    }
    public void changePE(){
        grades.get(5).setGrade(true,"PE");
    }
    public void changeBand(){
        grades.get(6).setGrade(true,"Band");
    }

}
