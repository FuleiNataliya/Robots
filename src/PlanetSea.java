public class PlanetSea {
    private String swim;
    private String breatheUnderWater;

    public PlanetSea() {

    }

    public PlanetSea(String swim, String breatheUnderWater) {
        this.breatheUnderWater = breatheUnderWater;
        this.swim = swim;
    }
    public void RobotSea() {
        System.out.println("I'm on the planet Sea");
    }

    @Override
    public String toString() {
        return "PlanetSea{" +
                "swim='" + swim + '\'' +
                ", breatheUnderWater='" + breatheUnderWater + '\'' +
                '}';
    }
}
