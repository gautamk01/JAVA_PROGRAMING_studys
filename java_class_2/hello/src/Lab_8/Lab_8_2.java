package Lab_8;

import java.util.Scanner;

public class Lab_8_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = input.nextInt();
        int[] a = new int[n];

        try {
            System.out.println("Insert the values to array ");
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(input.next());
            }
            System.out.println("Enter array index : ");
            int num = input.nextInt();
            System.out.println(a[num]);

        } catch (NumberFormatException e) {
            System.out.println("(NumberFormatException Occures");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "You are trying to access any item of an array at an index which is not present in the array - ArrayIndexOutOfBoundsException ");

        } finally {
            System.out.println("BYE");

        }

        input.close();

    }

}
