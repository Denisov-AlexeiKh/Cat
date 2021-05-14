public class Master {
    private String name, secondName;
    private double money;

    public Master(String name, String secondName, double money) {
        this.name = name;
        this.secondName = secondName;
        this.money = money;
    }

    public double money() {
        return money;
    }

    public void decreaseMoney(double credits) {

        money -= credits;

    }

    public void increaseMoney(double credits) {
        money += credits;
    }

}
