package Unit3_BooleansAndConditionals.examples;

public class PizzaTester {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Domino's", 16, 3, true);
        Pizza pizza2 = new Pizza("Domino's", 16, 3, false);
        Pizza pizza3 = new Pizza("Lou Malnatis", 12, 1, false);

        pizza1.printInfo();

        String pizza2Info = pizza2.toString();
        System.out.println(pizza2Info);

        System.out.println(pizza3); // Java automatically calls the toString function and outputs the String

        if (pizza1.equals(pizza2)){
            System.out.println("Pizza1 and Pizza2 are from the same store");
        } else {
            System.out.println("Pizza and Pizza2 are from different stores");
            // Leo's bad
        }

    }

}
