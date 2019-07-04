package main.java.robots;

public class RobotForm1 {
    private String model;
    private int year;


    public RobotForm1(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public RobotForm1() {

    }

    public void power() {
        System.out.println(model + year + "of start");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
