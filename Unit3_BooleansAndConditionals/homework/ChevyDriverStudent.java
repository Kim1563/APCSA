package Unit3_BooleansAndConditionals.homework;
import java.text.DecimalFormat;
public class ChevyDriverStudent {
    public static void main(String[] args)
    {
        // Create objects
        DecimalFormat f = new DecimalFormat("##.00");
        Chevy traxBase = new Chevy();
        Chevy traxLux = new Chevy();
        Chevy corvetteSport = new Chevy(2020, 1500, 18.5, 58900, "Corvette (Sport)", "Fire Red", true, false, true);
        Chevy corvetteClassic = new Chevy(1963, 123500, 13.5, 61500, "Corvette (Classic)", "Fire Red", true, false, false);

        // *** UTILIZE SETTER METHODS TO COMPLETE THE FOLLOWING: ***
        // Set traxBase mileage to 15
        traxBase.setMileage(15);

        // Set traxLux mileage to 175 with both a luxury and 4WD package
        traxLux.setMileage(175);
        traxLux.setLuxury(true);
        traxLux.setFourWD(true);

        // Printouts
        System.out.println("*** VEHICLE PRINTOUTS ***");
        System.out.println(traxBase);
        System.out.println(traxLux);
        System.out.println(corvetteClassic);
        System.out.println(corvetteSport);

        // Display price comparison
        System.out.println("*** COMPARE BY PRICE ***");
        System.out.println("\tClassic Corvette vs. Sport Corvette");
        System.out.print("\tLowest price:\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***
        if (corvetteClassic.compareTo(corvetteSport) < 0)
            System.out.println("Classic Corvette at $" + f.format(corvetteClassic.getPrice()));
        else if (corvetteClassic.compareTo(corvetteSport) > 0)
            System.out.println("Sport Corvette at $" + f.format(corvetteSport.getPrice()));
        else
            System.out.println("Tie at $" + f.format(corvetteClassic.getPrice()));

        // Display equality
        System.out.println("\n*** CHECK EQUALITY ***");
        System.out.println("\tBase Trax vs. Luxury Trax");
        System.out.print("\tStatus:\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***
        if (traxBase.equals(traxLux))
            System.out.println("Same car");
        else
            System.out.println("Not same car");
    }
}
