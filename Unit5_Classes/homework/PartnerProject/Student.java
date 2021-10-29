package Unit5_Classes.homework.PartnerProject;

import java.util.*;

public class Student {
    private String name;
    private int gradeLevel;
    private ArrayList<Grade> grades;

    public Student(String name, int gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
        grades = new ArrayList<Grade>();
    }
    
    
    public void addGrades(double grade){
        grades.add(grade);
    }
    
    
    
}
