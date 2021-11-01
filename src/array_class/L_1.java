package array_class;

import java.util.Scanner;



public class L_1 {
    public static int[] reverser(int[] array){
        int[] result = new int[array.length];
        for(int i=0,j=array.length-1;i<array.length;i++,j--){
            result[i]=array[j];
        }
        return  result;
    }
    public static void array_caller(int[] array){
        int size_array = array.length;
        for(int i=0;i<size_array;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//call the scanner object
//        System.out.print("Enter the size of the array : ");
//        int size = in.nextInt();
//        double[] array1 = new double[size];//initalize the array
//        System.out.println("Enter the Items into arrray ");
//        for(int i=0;i<size;i++){
//            array1[i]=in.nextDouble();
//        }
//        System.out.println("The Array items :");
//        for(double i : array1){
//            System.out.println(i);
//        }
//        System.out.println("\nThe sum of the array");
//        double temp = 0;
//        for(int i=0;i<size;i++){
//            temp = array1[i]+temp;
//        }
//        System.out.println("Result : "+ temp);
//        System.out.println("The Max number in array ");
//        double max = array1[0];
//        for(int i=1;i<size;i++){
//            if(array1[i]>max){
//                max = array1[i];
//            }
//        }
//        System.out.println("Max number is : "+ max);
        System.out.println("array function calling");
        int[] array2 = {1,2,4};
        array_caller(array2);
        System.out.println("calling the reverse function and returning the array ");
        for(int i:reverser(array2)){
            System.out.println(i);
        }
    }
}
