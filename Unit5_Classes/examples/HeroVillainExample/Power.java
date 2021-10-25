package Unit5_Classes.examples.HeroVillainExample;

public class Power {
    private String powerName;
    private int powerStrength;

    public Power(String powerName, int powerStrength) {
        this.powerName = powerName;
        this.powerStrength = powerStrength;
    }

    public String getPowerName() {
        return powerName;
    }

    public int getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(int powerStrength) {
        this.powerStrength = powerStrength;
    }

    public String toString() {
        return "Power: " + this.powerName + "\nPower strength: " + this.powerStrength;
    }
}
