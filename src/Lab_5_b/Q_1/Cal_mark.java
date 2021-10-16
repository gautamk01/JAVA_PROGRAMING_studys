package Lab_5_b.Q_1;

import java.util.Scanner;

public class Cal_mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student A Marks");
        System.out.print("Physics Mark : ");
        int p = sc.nextInt();
        System.out.print("Chemistry Mark : ");
        int c = sc.nextInt();
        System.out.print("Math Mark : ");
        int m = sc.nextInt();
        A ob1 = new A(p,c,m);
        ob1.getPercentage();

        System.out.println("Enter the Student B Marks");
        System.out.print("Physics Mark : ");
        p = sc.nextInt();
        System.out.print("Chemistry Mark : ");
        c = sc.nextInt();
        System.out.print("Math Mark : ");
        m = sc.nextInt();
        System.out.print("Biology Mark : ");
        int b = sc.nextInt();
        B ob2 = new B(p,c,m,b);
        ob2.getPercentage();
    }
}
