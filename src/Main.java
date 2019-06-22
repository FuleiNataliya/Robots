import java.util.Random;

public class Main {
    
    public static void main(String[] args) {

        RobotForm1 robotForm1 = new RobotForm2();
        RobotForm2 robotForm2 = new RobotForm2();
        RobotForm3 robotForm3 = new RobotForm3();

        robotForm1.power();
        robotForm2.Robot();
        robotForm3.SuperRobot();

        Random random = new Random();
        int r = random.nextInt(12);
        System.out.println(r);
        if (r<=3) {
            System.out.println(robotForm1.toString());
        } else if (r>3 && r<=8) {
            System.out.println(robotForm2.toString());
        } else if (r>9 && r<=12) {
            System.out.println(robotForm3.toString());
        }
    }
}
