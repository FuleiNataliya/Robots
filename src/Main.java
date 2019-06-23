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

        Random rand = new Random();
        char c = (char)(rand.nextInt(3) + 'A');
        System.out.println((char)c);

        if (c=='A') {
           /* Planet planetSea = new Planet();
            System.out.println(planetSea.getSwim());*/
            Planet planet = Planet.SEA;
            System.out.println(planet.getSwim());

        } else if (c=='B') {
            /*Planet planetSun = new Planet();
            System.out.println(planetSun.getHeatResistance());*/
            Planet planet1 = Planet.SUN;
            System.out.println(planet1.getHeatResistance());

        } else if (c=='C'){
           /* Planet planetWind = new Planet();
            System.out.println(planetWind.getWindProtection());*/
            Planet planet2 = Planet.WIND;
            System.out.println(planet2.getHeatResistance());

        }

/*
        switch (planet){
            case SEA:
                System.out.println("It`s a planetSea");
                break;
            case SUN:
                System.out.println("It`s a planetSun");
                break;
            case WIND:
                System.out.println("It`s a planetWind");
                break;

        }*/

    }
}
