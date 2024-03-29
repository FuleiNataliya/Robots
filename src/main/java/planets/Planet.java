package main.java.planets;

public enum Planet {

    SEA("swim", "heatResistance", "windProtection"),
    SUN("swim", "heatResistance", "windProtection"),
    WIND("swim", "heatResistance", "windProtection");

    private String swim;
    private String heatResistance;
    private String windProtection;

    Planet(String swim, String heatResistance, String windProtection) {
        this.swim = swim;
        this.heatResistance = heatResistance;
        this.windProtection = windProtection;
    }

    public String getSwim() {
        return swim;
    }

    public String getHeatResistance() {
        return heatResistance;
    }

    public String getWindProtection() {
        return windProtection;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
