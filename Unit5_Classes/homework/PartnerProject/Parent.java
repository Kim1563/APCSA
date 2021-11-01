package Unit5_Classes.homework.PartnerProject;

import java.util.*;

public class Parent {
    private String name;
    private ArrayList<Student> myStudents;
    public Parent(String name, ArrayList<Student> myStudents) {
        this.name = name;
        this.myStudents = myStudents;
    }
    public void viewGrades(){
        for (int i = 0; i < myStudents.size(); i++) {
            String myGrades = myStudents.get(i).getGrades();
            System.out.println(myGrades);
        }
    }
    public void viewInfo(){
        for (int i = 0; i < myStudents.size(); i++) {
            System.out.println("Address: " + myStudents.get(i).getAddress());
            System.out.println("Parent phone number: " + myStudents.get(i).getParentPhoneNumber());
            System.out.println("Social Security Number: " + myStudents.get(i).getSSNumber() + '\n');
        }
    }
    public void changeInfo(Student studentChange){
        Scanner changeStuff = new Scanner(System.in);
        System.out.println("What would you like to edit?\nOptions: Address, Parent Phone Number, Social Security Number");
        String changeOption = changeStuff.nextLine().toLowerCase();
        if(changeOption.equals("address")){
            studentChange.setAddress(true);
        } else if(changeOption.equals("parent phone number")){
            studentChange.setParentPhoneNumber(true);
        } else if(changeOption.equals("social security number")){
            studentChange.setSSNumber(true);
        } else {
            System.out.println("That is not an option.");
        }
    }
}
