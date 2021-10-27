package Lab2;

import java.util.*;

public class Address_book {
    public static void main(String[] args) {
        Mailbook P1 = new Mailbook();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : ");
        P1.name = input.nextLine();
        System.out.print("Enter Street Address : ");
        P1.street_add = input.nextLine();
        System.out.print("Enter City : ");
        P1.City = input.nextLine();
        System.out.print("Enter State : ");
        P1.state = input.nextLine();
        System.out.print("Enter ZIP : ");
        P1.ZIP = input.nextInt();

        P1.add(P1.name, P1.street_add, P1.City, P1.state, P1.ZIP);

        P1.printer();

        input.close();

    }
}
