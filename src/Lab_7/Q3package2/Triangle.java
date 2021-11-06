package Lab_7.Q3package2;
import Lab_7.Q3package1.*;


public class Triangle extends Shapes {
    public int base,height;
    private double result;
    public void setSides(int sides) {
        super.setSides(sides);
    }
    public int getSides() {
        return super.getSides();
    }
    public void cal_A_Tri(int base,int height){
        this.base = base;
        this.height = height;
        result =0.5*base*height;
        System.out.println("Area of Triangle : "+ result);
    }
    public void cal_p_cir(int a,int b,int c){
        System.out.println("Perimeter of Triangle :"+(a+b+c));
    }
}
