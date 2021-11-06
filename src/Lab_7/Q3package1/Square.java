package Lab_7.Q3package1;

public class Square extends Shapes {

    private int side_length;
    private int result;
    public void setSides(int sides) {
        super.setSides(sides);
    }

    public int getSides() {
        return super.getSides();
    }

    public void cal_A_sq(int side_length){
        this.side_length=side_length;
        result = side_length*side_length;
        System.out.println("Area of Square : "+ result);
    }
    public void cal_p_sq(){
        System.out.println("Perimeter of Square :"+getSides()*side_length);

    }

}
