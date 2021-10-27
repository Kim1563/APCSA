package Unit5_Classes.examples.HeroVillainExample;

public class Power {
    private String powerName;
    private double powerStrength;

    public Power(String powerName, double powerStrength) {
        this.powerName = powerName;
        this.powerStrength = powerStrength;
    }

    public String getPowerName() {
        return powerName;
    }

    public double getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(double powerStrength) {
        this.powerStrength = powerStrength;
    }

    public String toString() {
        return "Power: " + this.powerName + "\nPower strength: " + this.powerStrength;
    }
}
