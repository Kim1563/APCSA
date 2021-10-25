package Unit5_Classes.examples.HeroVillainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        Power power1 = new Power("Flight", 10);
        Power power2 = new Power("Strength", 100);

        SuperHero Hi = new SuperHero("Hi", power1);
        Villain Bye = new Villain("Bye", power2);
        System.out.println(power1.toString());
        System.out.println(Hi.toString());
        System.out.println(Bye.toString());

        Hi.getSuperPower().setPowerStrength(100000);
    }
}
