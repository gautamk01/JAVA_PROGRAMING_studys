package Lab_8_Exception;

import java.util.Scanner;

public class Lab_8_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the Array : ");
            int n = input.nextInt();
            int[] a = new int[n];
            System.out.println("The size of Array is " + a.length);
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative Array size is found");
        } finally {
            System.out.println("BYE");

        }

        input.close();

    }

}
