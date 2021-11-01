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
            hv++;
        else if (ch == 2)
            mv++;
        else if (ch == 3)
            tv++;
    }

    public static void Npaid(int ch) {
        if (ch == 1)
            nhv++;
        else if (ch == 2)
            nmv++;
        else if (ch == 3)
            ntv++;
    }
    public static void paidornotpaid(int value) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.paid");
        System.out.println("2.Not paid");
        System.out.print("Enter your choice : ");
        int key = in.nextInt();
        if (key == 1) {
            paid(value);
        } else {
            Npaid(value);
        }
    }
    public static void list(){
        System.out.println("1.Heavy vehicles");
        System.out.println("2.Medium vehicles");
        System.out.println("3.Two wheelers");
        System.out.println("4.Exist");
        System.out.print("Enter your choice : ");

    }
    public static void numberVehicles() {
        System.out.println("Number of Heavy vehicles = " + (Toll_booth.getHv() + Toll_booth.getNhv()));
        System.out.println("Number of Medium vehicles = " + (Toll_booth.getMv() + Toll_booth.getNmv()));
        System.out.println("Number of 2-Wheelers = " + (Toll_booth.getTv() + Toll_booth.getNtv()));
    }
    public  static  void Amount_from_vechicles(){
        System.out.println("Amount collected from Heavy Vehicles = " + (Toll_booth.getHv() * 50));
        System.out.println("Amount collected from Medium Vehicles = " + (Toll_booth.getMv() * 20));
        System.out.println("Amount collected from 2-Wheelers = " + (Toll_booth.getTv() * 10));

    }
    public  static void TotalAmount(){
        int Ta=(Toll_booth.getTv() * 10) + (Toll_booth.getMv() * 20) + (Toll_booth.getHv() * 50);
        System.out.println("Total amount collected = " + Ta);
    }
    public  static  void LossAmount(){
        int l=(Toll_booth.getNtv() * 10) + (Toll_booth.getNmv() * 20) + (Toll_booth.getNhv() * 50);
        System.out.println("Loss amount  = " + l);
    }
    public static void Totalcar(){
        int Tc = (Toll_booth.getHv() + Toll_booth.getMv()
                + Toll_booth.getTv() + Toll_booth.getNhv()
                + Toll_booth.getNmv() + Toll_booth.getNtv());
        System.out.println("Total vehicles passed = " + Tc);
    }
    public static void Vnotpaid(){
        int VNP = (Toll_booth.getNhv() + Toll_booth.getNmv() + Toll_booth.getNtv());
        System.out.println("Vehicles passed without paying = " + VNP);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean key =true;
        while (key){
            Toll_booth.list();
            int choice = in.nextInt();
            System.out.println();
            switch (choice) {
                case 1 -> paidornotpaid(1);
                case 2 -> Toll_booth.paidornotpaid(2);
                case 3 -> Toll_booth.paidornotpaid(3);
                case 4 -> key=false;
                default -> System.out.println("Wrong choice");
            }
        }
        Toll_booth.Totalcar();
        Toll_booth.TotalAmount();
        Toll_booth.Vnotpaid();
        Toll_booth.numberVehicles();
        Toll_booth.Amount_from_vechicles();
        Toll_booth.LossAmount();

    }

}


