package main.java;

import main.java.planets.Planet;
import main.java.robots.RobotForm1;
import main.java.robots.RobotForm2;
import main.java.robots.RobotForm3;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int r = random.nextInt(12) + 1;
        System.out.println(r);

        if (r <= 3) {
            RobotForm1 robotForm1 = new RobotForm1("GTI", "ircle", 2001);
            System.out.println(robotForm1.toString());
            robotForm1.power();

        } else if (r <= 8) {
            RobotForm2 robotForm2 = new RobotForm2("robot policeman");
            System.out.println(robotForm2.toString());
            robotForm2.Robot();

        } else {
            RobotForm3 robotForm3 = new RobotForm3("MachineGun");
            System.out.println(robotForm3.toString());
            robotForm3.SuperRobot();
        }

        char c = (char) (random.nextInt(3) + 'A');
        System.out.println((char) c);

        if (c == 'A') {
            Planet planet = Planet.SEA;
            System.out.println(planet.getSwim());

        } else if (c == 'B') {
            Planet planet1 = Planet.SUN;
            System.out.println(planet1.getHeatResistance());

        } else {
            Planet planet2 = Planet.WIND;
            System.out.println(planet2.getWindProtection());
        }
    }
}
