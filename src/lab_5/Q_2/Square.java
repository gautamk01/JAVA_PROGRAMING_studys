package lab_5.Q_2;

public class Square extends Rectangle {
        Square(int s) {
            super(s, s);
        }

        void area() {
            System.out.println("Area of Square is: " + length * breadth);
        }

        void perimeter() {
            System.out.println("Perimeter of Square is: " + 4 * length);
        }
}
