package Lab_7.Q3package1;

public class Rectangle extends Shapes {
    private int length;
    private int breadth;

    private int result;
    public void setSides(int sides) {
        super.setSides(sides);
    }

    public int getSides() {
        return super.getSides();
    }

    public void cal_A_rec(int len,int bre){
        length = len;
        breadth = bre;
        result = len*bre;
        System.out.println("Area of rectangle : "+ result);
    }
    public void cal_p_rec() {
        System.out.println("Perimeter of Sequare :" + getSides() * (length + breadth));

    }

}