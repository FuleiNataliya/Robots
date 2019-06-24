public class RobotForm1 {
    private String model;
    private String form;
    private int year;

    public RobotForm1() {
    }

    public RobotForm1(String model, String form, int year) {
        this.model = model;
        this.form = form;
        this.year = year;
    }

    public void power() {
        System.out.println("Power");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void getForm(String form) {
        this.form = form;
    }

    public void setYear(String move) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getForm() {
        return form;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "RobotForm1{" +
                "model='" + model + '\'' +
                ", form='" + form + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

}
