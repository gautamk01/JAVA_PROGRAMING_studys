package lab_5.Q_1;

public class Employee extends person {
    private int emid;
    private double hourlypay;

    //constructor
    public Employee(String name, int age, int emid, double hourlypay) {
        super(name, age);
        this.emid = emid;
        this.hourlypay = hourlypay;
    }

    //setter for emid
    public void setEmid(int emid) {
        this.emid = emid;
    }

    //getter for emid
    public int getEmid() {
        return emid;
    }

    //setter for hourlypaid
    public void setHourlypay(double hourlypay) {
        this.hourlypay = hourlypay;
    }

    //getter for hourlypaid
    public double getHourlypay() {
        return hourlypay;
    }

    public double getRaise() {
        double newhourlypay;
        newhourlypay = getHourlypay() + getHourlypay() * 0.15;
        return newhourlypay;
    }

    public void payday(int hours) {
        if (hours >= 40) {
           hourlypay = 40 * hourlypay + ((hourlypay - 40) * 1.5);
        }
        else {
            hourlypay = hourlypay * hours;
        }

        System.out.println("Pay:" + hourlypay);
    }
    public String toString() {
        return super.toString() + "\nEmployee ID: " + emid + "\nHourly Pay: " + hourlypay;
    }

}
