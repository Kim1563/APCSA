package Unit5_Classes.homework.PartnerProject;

import java.util.*;

public class Parent {

    private String name;
    private ArrayList<Student> myStudents;

    public Parent(String name, ArrayList<Student> myStudents) {
        this.name = name;
        this.myStudents = myStudents;
    }

    /**
     * For each student in the myStudents ArrayList, print all grades
     */
    public void viewGrades(){
        for (int i = 0; i < myStudents.size(); i++) {
            String myGrades = myStudents.get(i).getGrades();
            System.out.println(myStudents.get(i).getName() + ":");
            System.out.println(myGrades);
        }
    }

    /**
     * For each student in the myStudents ArrayList, print all personal info
     */
    public void viewInfo(){
        for (int i = 0; i < myStudents.size(); i++) {
            System.out.println(myStudents.get(i).getName() + ":");
            System.out.println("Address: " + myStudents.get(i).getAddress());
        }
    }

    public ArrayList<Student> getMyStudents() {
        return myStudents;
    }

    /**
     * Changes student info based on parent response
     * @param studentChange Student object for which the info will be changed
     */
    public void changeInfo(Student studentChange){
        Scanner changeStuff = new Scanner(System.in);
        System.out.println("What would you like to edit?\nOptions: Address, Parent Phone Number");
        String changeOption = changeStuff.nextLine();
        if (changeOption.equalsIgnoreCase("Address")){
            studentChange.setAddress(true);
        } else {
            System.out.println("That is not an option.");
        }
    }
    public String getName() {
        return name;
    }
}