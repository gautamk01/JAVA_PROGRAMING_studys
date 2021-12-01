package Exception;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        int n = 1, j = 1;
        boolean correction = true;
        float k = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("A/B");

        try {
            System.out.print("Enter the value of A : ");
            n = input.nextInt();
            System.out.print("Enter the value of B : ");
            j = input.nextInt();
            k = n / j;
        } catch (Exception e) {
            System.out.println(" Exception found : " + e.getMessage());
            correction = false;
        } finally {
            if (correction) {
                System.out.println("Result");
                System.out.println(k);
            }
            System.out.println("BYE");

        }

        input.close();
    }
}
