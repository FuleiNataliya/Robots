package main.java.robots;

public class RobotForm2 extends RobotForm1 {

    private String name = "robot-policman";

    public RobotForm2() {
        super();
    }

    public RobotForm2(String name) {
        this.name = name;
    }

    public void Robot() {
        System.out.println("Says Stop" + name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
