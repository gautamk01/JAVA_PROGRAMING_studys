package Lab_7.Q3package2;
public class driver2 {
    public static void main(String[] args) {
        Circle ob1 = new Circle();
        Triangle ob2 = new Triangle();
        ob1.setSides(0);
        ob1.cal_A_cir(2);
        ob1.cal_p_cir();
        ob2.cal_A_Tri(3,5);
        ob2.cal_p_cir(2,35,2);
    }
}
