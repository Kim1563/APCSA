package Unit6_Arrays.examples;

import java.io.*;
import java.util.*;

public class FileReadExample {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("courseData.txt");
        Scanner in = new Scanner(myFile);

        String teacherName = in.nextLine(); // Vlaming
        System.out.println(teacherName);

        String courseName = in.nextLine(); // Basketball PE
        System.out.println(courseName);

        int period = in.nextInt(); // 1
        System.out.println(period);
        in.nextLine();

        String letterGrade = in.nextLine(); // A
        System.out.println(letterGrade);


    }
}
