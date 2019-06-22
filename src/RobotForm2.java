public class RobotForm2 extends RobotForm1{

    private String name = "robot policeman";

    public RobotForm2() {
    }

    public RobotForm2(String shout, String shoot, String move, String name) {
        super(shoot, move, shout);
        this.name = name;
    }
        public void Robot(){
            System.out.println("robot policeman says Stop");

    }

    @Override
    public String toString() {
        return "RobotForm2{" +
                "name='" + name + '\'' +
                '}';
    }
}
