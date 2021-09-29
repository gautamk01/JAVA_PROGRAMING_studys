package Lab2;

import java.util.*;

public class catMouseDemo {
    public static void main(String[] args) {
        int i=0;
        while(i<3)
        {
            animal A1 = new animal();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Cat A Position : ");
            A1.cat_A = input.nextInt();
            System.out.print("Enter Cat B Position : ");
            A1.cat_B = input.nextInt();
            System.out.print("Enter Mouse Position : ");
            A1.mouse = input.nextInt();
            System.out.println(A1.catAndMouse());
            i++;
        }



    }
}
