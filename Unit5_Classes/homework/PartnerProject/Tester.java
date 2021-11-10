package Unit5_Classes.homework.PartnerProject;

import java.util.*;

public class Tester {

    // Maps for each type of account
    static HashMap<String, Student> studentHashMap = new HashMap<>();
    static HashMap<String, Teacher> teacherHashMap = new HashMap<>();
    static HashMap<String, Parent> parentHashMap = new HashMap<>();

    static Student Student1 = new Student("Joey Jiang", 10, "620 Pancake Ave", "224-116-9420", "16198342");
    static Student Student2 = new Student("Alex Kim", 10, "870 Ha-Ha Boulevard", "630-111-1111", "81743896");
    static Student Student3 = new Student("Zhiwei Jiang", 12, "620 Pancake Ave", "224-116-9420", "16198343");
    static Student Student4 = new Student("Ryan Kim", 8, "870 Ha-Ha Boulevard", "630-111-1111", "81743897");

    static ArrayList<Student> moonStudents = new ArrayList<>();
    static ArrayList<Student> higginsStudents = new ArrayList<>();
    static ArrayList<Student> jiangStudents = new ArrayList<>();
    static ArrayList<Student> kimStudents = new ArrayList<>();


    static Teacher Teacher1 = new Teacher("Mr. Moon", moonStudents);
    static Teacher Teacher2 = new Teacher("Mr. Higgins", higginsStudents);


    static Parent Parent1 = new Parent("Mark Jiang", jiangStudents);
    static Parent Parent2 = new Parent("Jim Kim", kimStudents);

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            double randGrade = Math.random() * 51 + 50;
            randGrade *= 100;
            randGrade = Math.round(randGrade);
            randGrade /= 100;
            Grade joeyGrade = new Grade(randGrade);
            Student1.addGrade(joeyGrade);
            double randGrade1 = Math.random() * 51 + 50;
            randGrade1 *= 100; randGrade1 = Math.round(randGrade1); randGrade1 /= 100;
            Grade alexGrade = new Grade(randGrade1);
            Student2.addGrade(alexGrade);
            double randGrade2 = Math.random() * 51 + 50;
            randGrade2 *= 100; randGrade2 = Math.round(randGrade2); randGrade2 /= 100;
            Grade zhiweiGrade = new Grade(randGrade2);
            Student3.addGrade(zhiweiGrade);
            double randGrade3 = Math.random() * 51 + 50;
            randGrade3 *= 100; randGrade3 = Math.round(randGrade3); randGrade3 /= 100;
            Grade ryanGrade = new Grade(randGrade3);
            Student4.addGrade(ryanGrade);

        }

        {
            studentHashMap.put("Joey Jiang", Student1);
            studentHashMap.put("Alex Kim", Student2);
            studentHashMap.put("Zhiwei Jiang", Student3);
            studentHashMap.put("Ryan Kim", Student4);

            teacherHashMap.put("Mr. Moon", Teacher1);
            teacherHashMap.put("Mr. Higgins", Teacher2);

            parentHashMap.put("Mark Jiang", Parent1);
            parentHashMap.put("Jim Kim", Parent2);
            moonStudents.add(Student1);
            moonStudents.add(Student2);
            higginsStudents.add(Student3);
            higginsStudents.add(Student4);
            jiangStudents.add(Student1);
            jiangStudents.add(Student3);
            kimStudents.add(Student2);
            kimStudents.add(Student4);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Limited Academia Universal Portal!");
        System.out.print("Enter name: ");
        String name = in.nextLine();
        Scanner command = new Scanner(System.in);
        while (!command.equals("QUIT")) {
            if (studentHashMap.containsKey(name)) {
                Student Student1 = studentHashMap.get(name);
                // System.out.println("Welcome to the Limited Academia student dashboard, " + Student1.getName() + ".");
                System.out.print(Student1.getName() + ", to view grades, type 0. To view the grading scale, type 1. To view personal information, type 2. Type QUIT to exit.\n");
                String command1 = command.nextLine();
                if (command1.equals("0")) {
                    System.out.println(Student1.getGrades());
                } else if (command1.equals("1")) {
                    Grade.viewScale();
                } else if (command1.equalsIgnoreCase("QUIT")) {
                    System.exit(0);
                } else if (command1.equalsIgnoreCase("2")) {
                    System.out.println("Address: " + Student1.getAddress());
                    System.out.println("Parent phone number: " + Student1.getParentPhoneNumber());
                    System.out.println("SSN: " + Student1.getSSNumber());
                }
            } else if (teacherHashMap.containsKey(name)) {
                Teacher Teacher1 = teacherHashMap.get(name);
                System.out.println("Welcome to the Limited Academia teacher dashboard, " + Teacher1.getName() + ".");
                System.out.print("To view student grades, type 0. To view the grading scale, type 1. To edit grades, type 2. Type QUIT to exit.\n");
                String command1 = command.nextLine();
                if (command1.equals("0")) {
                    Teacher1.viewGrades();
                } else if (command1.equals("1")) {
                    Grade.viewScale();
                } else if (command1.equals("2")) {
                    Scanner stuChange = new Scanner(System.in);
                    System.out.println("Whose grades do you want to edit?");
                    String stuChange1 = command.nextLine();
                    ArrayList<Student> TeacherStudents = Teacher1.getMyStudents();
                    boolean flag = false;
                    Student studentChange = new Student();
                    for (int i = 0; i < TeacherStudents.size(); i++) {
                        if (TeacherStudents.get(i).getName().equals(stuChange1)) {
                            studentChange = TeacherStudents.get(i);
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        Teacher1.changeGrades(studentChange);
                    } else {
                        System.out.println("Not a valid student.");
                    }
                } else if (command1.equalsIgnoreCase("3")){
                    Teacher1.viewInfo();
                }  else if (command1.equalsIgnoreCase("QUIT")) {
                    System.exit(0);
                }
            } else if (parentHashMap.containsKey(name)) {
                Parent Parent1 = parentHashMap.get(name);
                System.out.println("Welcome to the Limited Academia parent dashboard, " + Parent1.getName() + ".");
                Scanner commmand = new Scanner(System.in);
                System.out.print("To view student grades, type 0. To view the grading scale, type 1. To edit info, type 2. Type 3 to view info. Type QUIT to exit.\n");
                String command1 = command.nextLine();
                if (command1.equals("0")) {
                    Parent1.viewGrades();
                } else if (command1.equals("1")) {
                    Grade.viewScale();
                } else if (command1.equals("2")) {
                    Scanner stuChange = new Scanner(System.in);
                    System.out.println("Whose info do you want to edit?");
                    String stuChange1 = command.nextLine();
                    ArrayList<Student> ParentStudents = Parent1.getMyStudents();
                    boolean flag = false;
                    Student studentChange = new Student();
                    for (int i = 0; i < ParentStudents.size(); i++) {
                        if (ParentStudents.get(i).getName().equals(stuChange1)) {
                            studentChange = ParentStudents.get(i);
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        Parent1.changeInfo(studentChange);
                    } else {
                        System.out.println("Not a valid student.");
                    }
                } else if (command1.equalsIgnoreCase("3")){
                    Parent1.viewInfo();
                } else if (command1.equalsIgnoreCase("QUIT")) {
                    System.exit(0);
                }
            } else {
                System.out.println("Looks like your account is not in the database. Contact system administrators.");
                break;
            }
        }
    }
}