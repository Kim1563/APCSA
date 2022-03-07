package Unit9_Inheritance.examples;

public class AnimalTester
{
    public static void main(String[] args)
    {
        Animal[] barn = new Animal[6];
        // 1. What data type does this array hold?

        // Animal objects


        barn[0] = new Animal("Murphy");
        barn[1] = new Cow("Daisy", "Dairy");
        barn[2] = new Pig("Wilbur", false);
        barn[3] = new Cow("Billy", "Beef");
        barn[4] = new Animal("Maggie");
        barn[5] = new Pig("Max", true);

        // 2. Did I ONLY store Animal objects in this array?  If not, why do you
        //    think this was allowed?

        // No; these are subclasses of the Animal class that are also Animal objects (polymorphism)

        for (Animal a: barn) {
            a.speak();
        }

        // 3. What method is getting called here?  The speak method of the Animal class?

        // Specialized speak method depending on hierarchy (Cow, Pig or Animal depending on how specific the method is)
    }

}