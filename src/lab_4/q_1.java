package lab_4;
class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // adding getters for real and imaginary properties
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}

public class q_1 {
    public float ADD(float a, float b) {
        return a + b;
    }

    public static ComplexNumber ADD(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {

        double sumReal = complexNumber1.getReal() + complexNumber2.getReal();
        double sumImaginary = complexNumber1.getImaginary() + complexNumber2.getImaginary();

        return new ComplexNumber(sumReal, sumImaginary);
    }
    void ADD(int x1,int Y1,int x2,int Y2){
        System.out.println("Vector 1 : <"+x1+","+Y1+">");
        System.out.println("Vector 2 : <"+x2+","+Y2+">");
        int r1 = x1+x2;
        int r2 = Y1+Y2;
        System.out.println("Resultant Vecotor : <"+r1+","+r2+">");
    }


    public static void main(String[] args) {
        q_1 ob1 = new q_1();
//a) Add two floating point numbers
        float a = 12.23f;
        float b = 1.24f;
        float k = ob1.ADD(a,b);
        System.out.println(k);
//b) Add two complex numbers
        ComplexNumber c1 = new ComplexNumber(12,12);
        ComplexNumber c2 = new ComplexNumber(53,52);
        ComplexNumber result =  ob1.ADD(c1,c2);
        System.out.println("After adding two complex numbers: " + result.getReal() + " + i" + result.getImaginary());

        //c) Two Vector addition
        ob1.ADD(3,4,5,-1);
    }
}
