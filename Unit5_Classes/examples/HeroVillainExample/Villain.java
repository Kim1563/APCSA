package Unit5_Classes.examples.HeroVillainExample;

public class Villain {
    private String villainName;
    private Power superPower;

    public Villain(String villainName, Power superPower) {
        this.villainName = villainName;
        this.superPower = superPower;
    }

    public String getVillainName() {
        return villainName;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

    public String toString() {
        return "\nVillain name: " + this.getVillainName() + "\n" + superPower.toString();
    }
}
