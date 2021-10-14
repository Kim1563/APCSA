package Unit3_BooleansAndConditionals.examples;

public class StudentDriver {
    public static void main(String[] args) {
        Student Alex = new Student("Alex", "Kim", 1231);
        Student Joey = new Student("Joey", "Jiang", 1232);

        System.out.println(Alex.equals(Joey));
        System.out.println(Alex.compareTo(Joey));

    }
}
