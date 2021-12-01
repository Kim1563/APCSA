package Unit5_Classes.homework.PartnerProject;

import java.util.*;

public class Tester {

    // Maps for each type of account
    static HashMap<String, Student> studentHashMap = new HashMap<String, Student>();
    static HashMap<String, Teacher> teacherHashMap = new HashMap<String, Teacher>();
    static HashMap<String, Parent> parentHashMap = new HashMap<String, Parent>();

    static ArrayList<Student> moonStudents = new ArrayList<Student>();
    static ArrayList<Student> higginsStudents = new ArrayList<Student>();
    static ArrayList<Student> grattoniStudents = new ArrayList<Student>();
    static ArrayList<Student> haysStudents = new ArrayList<Student>();

    static Teacher Teacher1 = new Teacher("Mr. Moon", moonStudents);
    static Teacher Teacher2 = new Teacher("Mr. Higgins", higginsStudents);
    static Teacher Teacher3 = new Teacher("Mr. Grattoni", grattoniStudents);
    static Teacher Teacher4 = new Teacher("Mr. Hays", haysStudents);


    // Terminal colors o.O
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) {

        String[] firstNames = Names.getFirstNames();
        String[] lastNames = Names.getLastNames();
        HashMap<String, ArrayList<Student>> stuLastNames = new HashMap<>();
        ArrayList<Parent> parentArrayList = new ArrayList<>();
        //Let's say there are 100 students
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Student empty = new Student(firstNames[(int)(Math.random()* firstNames.length)] + " " + lastNames[(int)(Math.random()* lastNames.length)],(int)(Math.random()*4+9),Names.randAdd());
            for (int j = 0; j < 7; j++) {
                double randGrade = Math.random() * 50 + 50;
                randGrade *= 100;
                randGrade = Math.round(randGrade);
                randGrade /= 100;

                Grade emptyGrade = new Grade(randGrade);
                empty.addGrade(emptyGrade);
            }
            String lN = empty.getName().substring(empty.getName().indexOf(" ")+1);
//            System.out.println(lN);
            if(stuLastNames.containsKey(lN)){
                stuLastNames.get(lN).add(empty);
            } else {
                ArrayList<Student> temp = new ArrayList<>();
                temp.add(empty);
                stuLastNames.put(lN, temp);
            }
            studentArrayList.add(empty);
            studentHashMap.put(empty.getName(),empty);
        }

        for (Map.Entry<String, ArrayList<Student>> entry : stuLastNames.entrySet()) {
            String key = entry.getKey();
            ArrayList<Student> value = entry.getValue();
            Parent p1 = new Parent(firstNames[(int)(Math.random()* firstNames.length)] + " " + key,value);
            parentArrayList.add(p1);
            parentHashMap.put(p1.getName(),p1);
        }
        for (int i = 0; i < 25; i++) {
            moonStudents.add(studentArrayList.get(i));
        }
        for (int i = 25; i < 50; i++) {
            higginsStudents.add(studentArrayList.get(i));
        }
        for (int i = 50; i < 75; i++) {
            grattoniStudents.add(studentArrayList.get(i));
        }
        for (int i = 75; i < 100; i++) {
            haysStudents.add(studentArrayList.get(i));
        }
        teacherHashMap.put("Mr. Moon",Teacher1);
        teacherHashMap.put("Mr. Higgins",Teacher2);
        teacherHashMap.put("Mr. Grattoni",Teacher3);
        teacherHashMap.put("Mr. Hays",Teacher4);

        // Making scanner to view input

        Scanner in = new Scanner(System.in);
        System.out.println(ANSI_PURPLE + "Welcome to the Limited Academia Universal Portal!" + ANSI_RESET);
        Scanner logina = new Scanner(System.in);
        String s = "";
        while(!s.equals("QUIT")){
            System.out.println("To login to your account, type login. To quit, type quit.");
            s = logina.nextLine();
            if(s.equalsIgnoreCase("login")){
                // Logging in, ask for name
                System.out.print("Enter name: ");
                String name = in.nextLine();
                Scanner command = new Scanner(System.in);
                while (!command.equals("QUIT")) {
                    // Keep running until you break
                    if (studentHashMap.containsKey(name)) {
                        // Student found
                        Student Student1 = studentHashMap.get(name);
                        System.out.print(Student1.getName() + ", to view grades, type 0. To view the grading scale, type 1. To view personal information, type 2. Type logout to logout.\n");
                        String command1 = command.nextLine();
                        if (command1.equals("0")) {
                            System.out.println(Student1.getGrades());
                        } else if (command1.equals("1")) {
                            Grade.viewScale();
                        } else if (command1.equalsIgnoreCase("logout")) {
                            break;
                        } else if (command1.equalsIgnoreCase("2")) {
                            System.out.println("Address: " + Student1.getAddress());
                        }
                    } else if (teacherHashMap.containsKey(name)) {
                        // Teacher found
                        // Initialize first
                        boolean haveStudents = false;
                        Teacher Teacher1 = teacherHashMap.get(name);
                        System.out.println("Welcome to the Limited Academia teacher dashboard, " + Teacher1.getName() + ".");
                        System.out.print("To view student grades, type 0. To view the grading scale, type 1. To edit grades, type 2. Type logout to logout.\n");
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
                        }  else if (command1.equalsIgnoreCase("logout")) {
                            break;
                        }
                    } else if (parentHashMap.containsKey(name)) {
                        // Parent found
                        Parent Parent1 = parentHashMap.get(name);
                        System.out.println("Welcome to the Limited Academia parent dashboard, " + Parent1.getName() + ".");
                        Scanner commmand = new Scanner(System.in);
                        System.out.print("To view student grades, type 0. To view the grading scale, type 1. To edit info, type 2. Type 3 to view info. Type logout to logout.\n");
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
                        } else if (command1.equalsIgnoreCase("3")) {
                            Parent1.viewInfo();
                        } else if (command1.equalsIgnoreCase("logout")) {
                            break;
                        }
                    } else if(name.equalsIgnoreCase("sysadmin")){
                        Scanner commmand = new Scanner(System.in);
                        System.out.print("To view student names, type 0. To view parent names, type 1. To view teacher names, type 2. Type logout to logout.\n");
                        String com1 = commmand.nextLine();
//                            System.out.println(com1);
//                            System.out.println(com1.equals("logout"));
                        if(com1.equalsIgnoreCase("logout")){
                            break;
                        }
                        if (com1.equals("0")) {
                            for (int i = 0; i < studentArrayList.size(); i++) {
                                System.out.println(studentArrayList.get(i).getName() + " - " + studentArrayList.get(i).getGradeLevel());
                            }
                        } else if (com1.equals("1")) {
                            for (int i = 0; i < parentArrayList.size(); i++) {
                                System.out.println(parentArrayList.get(i).getName());
                            }
                        } else if (com1.equals("2")) {
                            System.out.println("Mr. Moon");
                            System.out.println("Mr. Higgins");
                            System.out.println("Mr. Grattoni");
                            System.out.println("Mr. Hays");
                        } else if (com1.equalsIgnoreCase("logout")) {
                            break;
                        }
                    } else {
                        // Not student, teacher, or parent
                        System.out.println("Looks like your account is not in the database. Contact system administrators.");
                        break;
                    }
                }
            } else if(s.equalsIgnoreCase("QUIT")){
                System.exit(0);
            } else {
                System.out.println("Not a valid command.");
            }
        }
    }
}