package Lab_7.Q3package1;

public class driver1 {
    public static void main(String[] args) {
        Square ob1 = new Square();
        ob1.setSides(4);
        ob1.cal_A_sq(2);
        ob1.cal_p_sq();
        Rectangle ob2 = new Rectangle();
        ob2.setSides(2);
        ob2.cal_A_rec(3,5);
        ob2.cal_p_rec();
    }
}
