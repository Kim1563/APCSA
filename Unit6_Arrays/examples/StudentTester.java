package Unit6_Arrays.examples;

public class StudentTester {
    public static void main(String[] args) {
        Course per1 = new Course("Physical Education", "Sponsel", "A+", 1);
        Course per2 = new Course("Spanish 3", "Lernor", "A", 2);
        Course per3 = new Course("Orchestra 4", "Caballero", "A", 3);
        Course per4 = new Course("AP US History", "Reagan", "A", 4);
        Course per5 = new Course("AP Computer Science A", "Moon", "A+", 5);
        Course per6 = new Course("Chemistry", "Teberg", "A", 6);
        Course per7 = new Course("AP Calculus BC", "Higgins", "A+", 7);
        Course per8 = new Course("English", "Weathers-Weidig", "A", 8);
        Course per9 = new Course("Lunch", 9);

        Course[] schedule = {per1, per2, per3, per4, per5, per6, per7, per8, per9};

        Student alex = new Student("Alex", schedule);

        Student joey = new Student("Joey");

        System.out.println(alex);

        System.out.println(joey);
    }
}
