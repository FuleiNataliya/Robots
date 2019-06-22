public class RobotForm1 {
    private String shout;
    private String shoot;
    private String move;

    public RobotForm1() {
    }

    public RobotForm1(String shout, String shoot, String move) {
        this.shout = shout;
        this.shoot = shoot;
        this.move = move;
    }

    public void power() {
        System.out.println("Power");
    }

    public void setShout(String shout) {
        this.shout = shout;
    }

    public void getShoot(String shoot) {
        this.shoot = shoot;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getShout() {
        return shout;
    }

    public String getShoot() {
        return shoot;
    }

    public String getMove() {
        return move;
    }

    @Override
    public String toString() {
        return "RobotForm1{" +
                "shout='" + shout + '\'' +
                ", shoot='" + shoot + '\'' +
                ", move='" + move + '\'' +
                '}';
    }
}
