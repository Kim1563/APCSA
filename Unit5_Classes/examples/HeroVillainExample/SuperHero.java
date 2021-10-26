package Unit5_Classes.examples.HeroVillainExample;

public class SuperHero {
    private String heroName;
    private Power superPower;

    public SuperHero(String heroName, Power superPower) {
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


}
