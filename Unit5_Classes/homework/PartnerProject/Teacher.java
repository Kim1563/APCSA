package Unit5_Classes.homework.PartnerProject;

import java.util.*;

public class Teacher {
    private String name;
    private ArrayList<Student> myStudents;
    public Teacher(String name, ArrayList<Student> myStudents) {
        this.name = name;
        this.myStudents = myStudents;
    }
    public void viewGrades(){
        for (int i = 0; i < myStudents.size(); i++) {
            System.out.println(myStudents.get(i).getName() + ":");
            String myGrades = myStudents.get(i).getGrades();
            System.out.println(myGrades);
        }
        System.out.println('\n');
    }
    public void viewInfo(){
        for (int i = 0; i < myStudents.size(); i++) {
            System.out.println("Address: " + myStudents.get(i).getAddress());
            System.out.println("Parent phone number: " + myStudents.get(i).getParentPhoneNumber());
            System.out.println("Social Security Number: " + myStudents.get(i).getSSNumber() + '\n');
        }
    }
    public void changeGrades(Student studentChange){
        Scanner changeStuff = new Scanner(System.in);
        System.out.println("What grade would you like to change?\nOptions: English, Math, History, Computer Science, Chemistry, PE, Band");
        String changeOption = changeStuff.nextLine().toLowerCase();
        if(changeOption.equals("english")){
            studentChange.changeEnglish();
        } else if(changeOption.equals("math")) {
            studentChange.changeMath();
        } else if(changeOption.equals("history")) {
            studentChange.changeHistory();
        } else if(changeOption.equals("computer science")) {
            studentChange.changeComputerScience();
        } else if(changeOption.equals("chemistry")) {
            studentChange.changeChemistry();
        } else if(changeOption.equals("pe")) {
            studentChange.changePE();
        } else if(changeOption.equals("band")) {
            studentChange.changeBand();
        } else {
            System.out.println("That is not a valid option.");
        }
    }
}
