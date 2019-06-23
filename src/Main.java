import java.util.Random;

public class Main {
    
    public static void main(String[] args) {

        Random random = new Random();
        int r = random.nextInt(12)+1;
        System.out.println(r);

        if (r>=1 & r<=3) {
            RobotForm1 robotForm1 = new RobotForm1("GTI", "ircle", 2001);
            System.out.println(robotForm1.toString());
            robotForm1.power();

        } else if (r>=4 & r<=8) {
            RobotForm2 robotForm2 = new RobotForm2();
            System.out.println(robotForm2.toString());
            robotForm2.Robot();

        } else {
            RobotForm3 robotForm3 = new RobotForm3();
            System.out.println(robotForm3.toString());
            robotForm3.SuperRobot();

        }
    }
}
