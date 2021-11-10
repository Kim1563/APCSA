package Unit5_Classes.examples.HeroVillainExample;

public class Villain {
    private String villainName;
    private Power superPower;
    private static int numVillains = 0;
    private static double totalVillainPower = 0.0;

    public Villain(String villainName, Power superPower) {
        numVillains++;
        totalVillainPower += superPower.getPowerStrength();
        this.villainName = villainName;
        this.superPower = new Power (superPower.getPowerName(), superPower.getPowerStrength());
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

    public static int getNumVillains() {
        return numVillains;
    }

    public static double getTotalVillainPower() {
        return totalVillainPower;
    }

    public static double getAverageStrength(){
        return totalVillainPower / getNumVillains();
    }
}
