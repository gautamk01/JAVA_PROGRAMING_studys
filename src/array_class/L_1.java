package array_class;

import java.util.Scanner;

public class L_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//call the scanner object
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();
        double[] array1 = new double[size];//initalize the array
        System.out.println("Enter the Items into arrray ");
        for(int i=0;i<size;i++){
            array1[i]=in.nextDouble();
        }
        System.out.println("The Array items :");
        for(int i=0;i<size;i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println("\nThe sum of the array");
        double temp = 0;
        for(int i=0;i<size;i++){
            temp = array1[i]+temp;
        }
        System.out.println("Result : "+ temp);
        System.out.println("The Max number in array ");
        double max = array1[0];
        for(int i=1;i<size;i++){
            if(array1[i]>max){
                max = array1[i];
            }
        }
        System.out.println("Max number is : "+ max);
    }
}
