package lab_5.Q_2;

import java.util.Scanner;

public class Rectangle_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the Rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle r = new Rectangle(l, b);
        r.area();
        r.perimeter();
        System.out.println("Enter the side of the Square: ");
        int s = sc.nextInt();
        Square sq = new Square(s);
        sq.area();
        sq.perimeter();
        sc.close();
    }
}
