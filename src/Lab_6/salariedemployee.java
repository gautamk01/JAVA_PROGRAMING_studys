package Lab_6;

public class salariedemployee extends Employee {
    double weeklysalary;
    int Noweek;

    //getter and setter
    public double getWeeklysalary() {
        return weeklysalary ;
    }
    public double getnoweek() {
        return Noweek;
    }



    public void setWeeklysalary(double weeklysalary) {
        this.weeklysalary = weeklysalary;
    }
    public  void setNoweek(int noweek){
        this.Noweek = noweek;
    }



    //constructor
    public salariedemployee(String FN, String LN, String SSN, double WS, int nw) {
        super(FN, LN, SSN);
        setNoweek(nw);
        setWeeklysalary(WS);
    }

    public double getPaymentAmount() {
        return getnoweek() * getWeeklysalary();
    }

    public void display() {
        super.display();
        System.out.println("Number of weeks : " + getnoweek());
        System.out.println("weekly salary : " + getWeeklysalary());
        System.out.println("Payment Amount : "+getPaymentAmount());
    }

}
