package Unit2_UsingObjects.examples;

import java.math.BigInteger;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Wrapper class for int and double
        Integer x = new Integer(17);
        Double y = new Double(17.0);

        // Extract underlying value (primitives)
        int xVal = x.intValue();
        double yVal = y.doubleValue();

        // Print the values
        System.out.println(xVal);
        System.out.println(yVal);

        // Print the wrapper classes (auto-unboxing)
        System.out.println(x);
        System.out.println(y);

        // Autoboxing demo
        Integer currentYear = 2021;
        // Same as Integer currentYear = new Integer(2021);
        System.out.println(currentYear);
        // Auto-unboxing

        // 1. Double variable using autoboxing and then print value with auto-unboxing
        Double gpa = 5.0;
        System.out.println("Current gpa: " + gpa);

        //  2. Print min/max Integer values (use labels)
        System.out.println("The minimum Integer value: " + Integer.MIN_VALUE);
        System.out.println("The maximum Integer value: " + Integer.MAX_VALUE);


    }
}
