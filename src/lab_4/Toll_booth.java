package lab_4;

import java.util.Scanner;

public class Toll_booth {
    private static int hv, mv, tv, nhv, nmv, ntv;

    public Toll_booth() {
        hv = mv = tv = nhv = nmv = ntv = 0;
    }

    public static int getHv() {
        return hv;
    }

    public static int getMv() {
        return mv;
    }

    public static int getTv() {
        return tv;
    }

    public static int getNhv() {
        return nhv;
    }

    public static int getNmv() {
        return nmv;
    }

    public static int getNtv() {
        return ntv;
    }

    public static void paid(int ch) {
        if (ch == 1)
            ++hv;
        else if (ch == 2)
            ++mv;
        else
            ++tv;
    }

    public static void dnp(int ch) {
        if (ch == 1)
            ++nhv;
        else if (ch == 2)
            ++nmv;
        else
            ++ntv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Enter 1 if it is a Heavy vehicle");
            System.out.println("Enter 2 if it is a Medium vehicle");
            System.out.println("Enter 3 if it is a 2-Wheeler");
            System.out.println("Enter 4 to call it a day and exit and display stats");
            ch = sc.nextInt();
            if (ch == 4)
                break;
            System.out.println("Enter 1 if the driver paid, 2 if they didn't");
            int c = sc.nextInt();
            if (c == 1)
                Toll_booth.paid(ch);
            else
                Toll_booth.dnp(ch);
        } while (true);
        System.out.println("Total vehicles passed = " + (Toll_booth.getHv() + Toll_booth.getMv()
                + Toll_booth.getTv() + Toll_booth.getNhv() + Toll_booth.getNmv() + Toll_booth.getNtv()));
        System.out.println("Total amount collected = " + ((Toll_booth.getTv() * 10) + (Toll_booth.getMv() * 20)
                + (Toll_booth.getHv() * 50)));
        System.out.println("Vehicles passed without paying = " + (Toll_booth.getNhv() + Toll_booth.getNmv()
                + Toll_booth.getNtv()));
        System.out.println("Number of Heavy vehicles = " + (Toll_booth.getHv() + Toll_booth.getNhv()));
        System.out.println("Number of Medium vehicles = " + (Toll_booth.getMv() + Toll_booth.getNmv()));
        System.out.println("Number of 2-Wheelers = " + (Toll_booth.getTv() + Toll_booth.getNtv()));
        System.out.println("Amount collected from Heavy Vehicles = " + (Toll_booth.getHv() * 50));
        System.out.println("Amount collected from Medium Vehicles = " + (Toll_booth.getMv() * 20));
        System.out.println("Amount collected from 2-Wheelers = " + (Toll_booth.getTv() * 10));
        System.out.println("Loss amount  = " + ((Toll_booth.getNtv() * 10) + (Toll_booth.getNmv() * 20)
                + (Toll_booth.getNhv() * 50)));
    }
}