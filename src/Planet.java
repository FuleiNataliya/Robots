public enum Planet {
    SEA, SUN, WIND;

    private String swim;
    private String heatResistance;
    private String windProtection;


    Planet() {
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
    public  String getWindProtection() {
            return windProtection;
    }
}
