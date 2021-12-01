package Lab_8_array;

import java.util.Scanner;

public class Q_1 {
    static int[] array;
    static int[] newarray;
    static int length = 0;

    // min function which returns the min value
    public static int min(int array[]) {
        int value = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                continue;
            }
            if (array[i] < value) {
                value = array[i];
            }

        }
        return value;
    }

    // For Displaying the array
    public static void Display(int[] array) {
        System.out.println("Array list");

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

    }

    // This function will help to delete '0' in the array
    public static void Maker() {
        length = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                length++;
            }
        }
        newarray = new int[length];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newarray[j] = array[i];
                j++;

            }
        }
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = newarray[i];
        }
        if (length != 0) {
            System.out.println((length));
        }

    }

    public static void subber(int m, int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - m;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        array = new int[input.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        Maker();
        while (length != 1) {
            subber(min(array), array);
            Maker();
            if (length == 0) {
                break;
            }

        }
        input.close();
    }

}
