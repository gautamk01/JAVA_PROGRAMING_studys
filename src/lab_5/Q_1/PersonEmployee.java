package lab_5.Q_1;

import java.util.Scanner;

public class PersonEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Employee No. - " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter employee ID: ");
            int emId = sc.nextInt();
            System.out.print("Enter hourly pay: ");
            double hourlyPay = sc.nextDouble();
            Employee e = new Employee(name, age, emId, hourlyPay);
            System.out.println("Raise: " + e.getRaise());

            System.out.println("\n---Info---");
            System.out.println("Id:" + e.getEmid());
            System.out.println("Hourly Pay:" + e.getHourlypay());
            System.out.println("After Raise 15%:" + e.getRaise());
            System.out.print("No of hours worked:");
            int hours = sc.nextInt();
            e.payday(hours);

            System.out.println("\n\nFinal Info:");
            System.out.println(e.toString());
            System.out.println("----------------\n");
        }
        sc.close();
    }
}