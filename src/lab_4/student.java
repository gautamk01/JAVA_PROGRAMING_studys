package lab_4;

import java.util.Scanner;

public class student {
    int rollno;
    String name;
    int m, e, c;

    public student(int rollno, String name, int m, int e, int c) {
        this.rollno = rollno;
        this.name = name;
        this.m = m;
        this.e = e;
        this.c = c;
    }

    void ShowData() {
        System.out.print("Roll No = " + rollno + "  " + " Name = " + name);
        System.out.println(" Maths = " + m + " English = " + e + " Computers = " + c);
    }


    student[] sort(student[] obj) { //array of class object
        for (int i = 0; i < obj.length - 1; i++)
            if (obj[i].rollno > obj[i + 1].rollno) {
                student temp = obj[i];
                obj[i] = obj[i + 1];
                obj[i + 1] = temp;
            }
        return obj;
    }

    String grade() {
        if (m + e + c > 270)
            return "A+";
        else if (m + e + c > 240)
            return "A";
        else if (m + e + c > 210)
            return "B+";
        else if (m + e + c > 180)
            return "B";
        else
            return "C";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No of students : ");
        int size = in.nextInt();
        student[] obj = new student[size];

        int R;
        String S;
        int m, e, c;
        for (int i = 0; i < size; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the details of student " + (i + 1));
            System.out.print("Enter student Name :");
            S = sc.nextLine();
            System.out.print("Enter Rollno : ");
            R = sc.nextInt();
            System.out.print("Enter Maths Mark : ");
            m = sc.nextInt();
            System.out.print("Enter English Mark : ");
            e = sc.nextInt();
            System.out.print("Enter the Computer mark : ");
            c = sc.nextInt();
            obj[i] = new student(R, S, m, e, c);
        }

        obj = obj[0].sort(obj);
        System.out.println("Student details after sorting acc to RollNos");
        for (int i = 0; i < size; i++) {
            obj[i].ShowData();
            System.out.println("Grade = " + obj[i].grade());
        }
    }
}
