package main.java.robots;

public class RobotForm3 extends RobotForm2 {

    private String weapon;

    public RobotForm3(String weapon) {
        this.weapon = weapon;
    }

    public void SuperRobot() {
        System.out.println("robot policeman takes the weapon" + weapon);
    }

    @Override
    public String toString() {
        return "main.java.robots.RobotForm3{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
