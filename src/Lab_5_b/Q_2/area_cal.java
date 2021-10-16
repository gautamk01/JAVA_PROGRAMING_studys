import java.util.Scanner;

abstract class shape {
    abstract void RectangleArea(int l, int b);

    abstract void SquareArea(int s);

    abstract void CircleArea(int c);
}

class Area extends shape {

    public void RectangleArea(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of rectangle " + result);
    }

    public void SquareArea(int side) {
        int result = side * side;
        System.out.println("Area of Square " + result);
    }

    public void CircleArea(int radii){
        float result = 3.14f*radii*radii;
        System.out.println("Area of circle "+ result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area ob1 = new Area();
        System.out.print("Enter the length : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int b = sc.nextInt();
        ob1.RectangleArea(l,b);
        System.out.print("Enter the side : ");
        int s = sc.nextInt();
        ob1.SquareArea(s);
        System.out.print("Enter the circle radii : ");
        int r=sc.nextInt();
        ob1.CircleArea(r);

    }
}