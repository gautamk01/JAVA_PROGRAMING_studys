package lab_5.Q_2;

public class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle is: " + length * breadth);
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle is: " + 2 * (length + breadth));
    }
}
