public class RobotForm3 extends RobotForm2{

    private String weapon ;

    public RobotForm3() {
    }

    public RobotForm3(String shout, String shoot, String move, String name, String weapon) {
        super(shoot, move, shout, name);
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
