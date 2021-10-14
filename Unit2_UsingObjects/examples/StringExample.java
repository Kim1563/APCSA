package Unit2_UsingObjects.examples;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";

        System.out.println(s1.toUpperCase());
        // toUpperCase() makes String fully upper case

        System.out.println(s1);
        // Strings are immutable (toUpperCase()) does not affect original

        System.out.println(s2.indexOf("u"));
        // Returns index of String

        System.out.println(s2.indexOf("x"));
        // Returns -1 if character is not found in String

        System.out.println(s1.substring(4));
        // Returns substring from index 4 to end

        System.out.println(s1.substring(2, 5));
        // Returns substring from index 2 to before index 5 (index 4)

        System.out.println(s1.length());
        // Returns integer describing length of String 1

        System.out.println(s2.length());
        // Returns integer describing length of String 2

        boolean isEqual = s1.equals("VACATION");
        // Returns false since different capitalization (use equalsIgnoreCase instead)

        System.out.println(isEqual);

        isEqual = s1.equals("Vacation");
        // Returns true since value and capitalization of the strings are equal

        System.out.println(isEqual);

        isEqual = s1.toUpperCase().equals("VACATION");
        // Returns true, s1 is first made fully upper case, which matches the target capitalization

        System.out.println(isEqual);

        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";

        System.out.println(s3.compareTo(s4));
        // Returns negative integer because s3 is lexicographically lower than s4

        System.out.println(s3.compareTo(s3));
        // Returns 0 since they are lexicographically equal

        System.out.println(s4.compareTo(s3));
        // Returns a positive integer because s4 is lexicographically higher than s3

        System.out.println(s5.compareTo(s3));
        // Returns a negative integer because s5 is lexicographically lower than s3 (Capital letter, lower Unicode value)

        System.out.println("I love " + "M" + "3" + "5" + "9");
        // Concatenates into "I love M359"
        System.out.println("I love " + "M" + (3 + 5 + 9));
        // Arithmetic expression (3+5+9) is evaluated first, resulting 17 is concatenated into I love M17

        System.out.println(24 + 56 + " Days of School");
        // Arithmetic expression 24+56 is evaluated first, resulting 80 is concatenated into 80 Days of School
        System.out.println("Days of School: " + 24 + 56);
        // 24 is casted to a String before the 56 is added, 56 is then concatenated, total String is Days of School: 2456

    }
}
