public class PlanetWind {
    private String windProtection;
    private String strength;

    public PlanetWind() {

    }

    public PlanetWind(String windProtection, String strength) {
        this.strength = strength;
        this.windProtection = windProtection;
    }
     public void RobotWind() {
         System.out.println("I'm on the planet Wind");
     }

    @Override
    public String toString() {
        return "PlanetWind{" +
                "windProtection='" + windProtection + '\'' +
                ", strength='" + strength + '\'' +
                '}';
    }
}


