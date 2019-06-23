public class RobotForm3 extends RobotForm2{

    private String weapon ;

    public RobotForm3() {
    }

    public RobotForm3(String model, String form, int year, String name, String weapon) {
        super(model, form, year, name);
        this.weapon = weapon;
    }
    public void SuperRobot(){
        System.out.println("robot policeman takes the weapon");

    }

    @Override
    public String toString() {
        return "RobotForm3{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
