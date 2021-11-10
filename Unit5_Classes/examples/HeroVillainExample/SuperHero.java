package Unit5_Classes.examples.HeroVillainExample;

public class SuperHero {
    private String heroName;
    private Power superPower;
    private static int numHeroes = 0;
    private static double totalHeroPower = 0.0;

    public SuperHero(String heroName, Power superPower) {
        numHeroes++;
        totalHeroPower += superPower.getPowerStrength();
        this.heroName = heroName;
        this.superPower = new Power (superPower.getPowerName(), superPower.getPowerStrength());
    }

    public String getHeroName() {
        return heroName;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

    public String toString() {
        return "\nHero name: " + this.getHeroName() + "\n" + superPower.toString();
    }

    public static int getNumHeroes() {
        return numHeroes;
    }

    public static double getTotalHeroPower() {
        return totalHeroPower;
    }

    public static double getAverageStrength(){
        return totalHeroPower / getNumHeroes();
    }
}
