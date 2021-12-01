package Unit6_Arrays.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExampleContinued {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("scheduleData.txt");
        Scanner in = new Scanner(myFile);

        int numStudents = in.nextInt();

        in.nextLine();

        Student[] students = new Student[numStudents];

        int i = 0;

        while(in.hasNextLine()){
            if (!in.hasNextLine()){
                break;
            }
            String studentName = in.nextLine();

            Course[] tempCourses = new Course[8];

            for (int j = 0; j < 8; j++) {
                String teacherName = in.nextLine();

                String courseName = in.nextLine();

                String letterGrade = in.nextLine();

                int period = in.nextInt();

                if (in.hasNextLine()){
                    in.nextLine();
                }

                Course tempCourse = new Course(courseName, teacherName, letterGrade, period);
                tempCourses[j] = tempCourse;

            }
            Student tempStudent = new Student(studentName, tempCourses);
            students[i] = tempStudent;
            i++;
        }

        printAllStudentSchedules(students);
    }

    public static void printAllStudentSchedules(Student[] allStudents){
        for (Student s1:allStudents){
            if (s1 != null) {
                System.out.println(s1.toString() + "\n");
            }
        }
    }
}
