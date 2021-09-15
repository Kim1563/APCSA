package Unit2_UsingObjects.examples;
import java.util.*;

public class CarTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the car name: ");
        String carName = in.next();
        carName += in.nextLine();

        System.out.print("Enter the car model year: ");
        int modelYear = in.nextInt();


        Car car1 = new Car(modelYear, carName);
        car1.displayInfo();

        Car Highlander = new Car(2020, "Highlander");
        Car TLX = new Car(2015, "TLX");

        Car Ferrari = new Car("Ferrari");

        Highlander.setModelYear(2019);

    }
}
