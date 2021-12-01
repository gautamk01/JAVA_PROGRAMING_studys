package Lab_8_array;

import java.util.Scanner;

class Employee {
    private int empid;
    private String name;
    private int age;
    private String designation;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Employee(int id, String name, int age, String des, double sala) {
        setEmpid(id);
        setName(name);
        setAge(age);
        setDesignation(des);
        setSalary(sala);
    }

    public void printDetails(int i) {
        System.out.println("Employee Details " + (i + 1));
        System.out.println("ID : " + empid);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
        System.out.println();

    }

    public void salaryBonus() {

        if (designation == "Manager") {
            salary = salary + salary * (30 / 100.0);
        } else if (designation == "Supervisor") {
            salary = salary + salary * (20 / 100);
        } else if (designation == "Worker") {
            salary = salary + salary * (10 / 100);
        }
    }

    public boolean searchDetails(int eid, Employee[] em) {
        int key = 0;
        for (int i = 0; i < em.length; i++) {
            if (eid == em[i].empid) {
                key = 1;
            }
        }
        if (key == 1) {
            return true;

        } else {
            return false;
        }
    }
}

public class Q_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Employee : ");
        int n = input.nextInt();

        Employee[] em1 = new Employee[n];
        boolean check = true;
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("Enter your Emid : ");
            int em = input.nextInt();
            System.out.print("Enter your Name :  ");
            String na = input.next();
            System.out.print("Enter your  Age : ");
            int ag = input.nextInt();
            System.out.print("Enter your designation : ");
            String des = input.next();

            System.out.print("Enter your Salary : ");
            double sa = input.nextDouble();

            em1[i] = new Employee(em, na, ag, des, sa);
        }

        while (check) {
            System.out.println();
            System.out.println("Employee Menu");
            System.out.println("1. Print");
            System.out.println("2. Calculate bonus");
            System.out.println("3. Search");
            System.out.println("4. Exit");

            System.out.print("Enter your Choice : ");
            int key = input.nextInt();

            switch (key) {
                case 1:
                    for (int i = 0; i < em1.length; i++) {
                        em1[i].printDetails(i);
                    }
                    break;
                case 2:
                    for (int i = 0; i < em1.length; i++) {
                        em1[i].salaryBonus();
                        System.out.println("New Salary for " + em1[i].getEmpid() + " is - " + em1[i].getSalary());
                    }
                    break;
                case 3:
                    int s_id;
                    System.out.print("Enter the Eid to search : ");
                    s_id = input.nextInt();
                    if (em1[0].searchDetails(s_id, em1)) {
                        System.out.println("This Employee is working here ");
                    } else {
                        System.out.println("No Employee is found !!!");
                    }

                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("Wrong Choice ");
                    break;
            }
        }

        input.close();

    }
}
