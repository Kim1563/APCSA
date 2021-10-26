package Unit5_Classes.examples.HeroVillainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        Power power1 = new Power("Flight", 10);

        SuperHero Hi = new SuperHero("Hi", power1);
        Villain Bye = new Villain("Bye", power1);
        System.out.println(power1.toString());
        System.out.println(Hi.toString());
        System.out.println(Bye.toString());

        Hi.getSuperPower().setPowerStrength(100000);
        Bye.getSuperPower().setPowerStrength(1);

        System.out.println(Hi);
        System.out.println(Bye);
    }
}
