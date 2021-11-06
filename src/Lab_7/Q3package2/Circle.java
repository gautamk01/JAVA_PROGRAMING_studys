package Lab_7.Q3package2;
import Lab_7.Q3package1.*;

public class Circle extends Shapes {
 public int radii;
 private double result;
 public void cal_A_cir(int radii){
  this.radii=radii;
  result = 3.14*radii*radii;
  System.out.println("Area of Circle : "+ result);
 }
 public void cal_p_cir(){
  System.out.println("Perimeter of Circle :"+(2*3.14*radii));
 }
}
