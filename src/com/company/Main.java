package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void print_java(){
        System.out.println("Hallo Java");
    }
    public static void sum_addition(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        //variable
        //primitive type
        //byte - 1
        //short -2
        //int - 4
        //long - 8
        //float - 4
        //double - 8
        //char - 2
        //boolean - true or false
        //Examples
        System.out.println("These are the few Examples of primitive type");
        System.out.println("byte,int,long,float,char,boolean");
        byte age = 30;
        int phone = 1234524;
        long phone1 = 12300000000l;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = false;
        System.out.println("");
        //Non-primitive types
        String name = "Gautam Krishna.M";
        System.out.println("These are the Few Exapmles of Non-primitive type");
        System.out.println(name);
        System.out.println(name.length());
        //Strings
        System.out.println("\nPlaying With Strings");
        //Concatenate
        String name1 = "Gautam";
        String name2 = "Krishna";
        String name3 = name1 + " " + name2;
        System.out.println(name3);
        //CharAt
        System.out.println(name.charAt(4));
        //Length
        System.out.println(name.length());
        //replace
        String copy_name = name.replace('G', 'g');
        System.out.println(copy_name);
        //substring
        System.out.println(name.substring(0, 6));//Strings are immutable adn (from 0 to , 6 but index 6 is not included)
        System.out.println("\nARRAY");


        //ARRAY
        int[] marks = new int[3];
        marks[0] = 53;
        marks[1] = 48;
        marks[2] = 95;
        System.out.println(marks[2]);

        //length
        System.out.println(marks.length);

        //sort
        System.out.println("");
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println();

        //we can also write the array in the form of
        int[] marks_1 = {36, 46, 24};//1-D Array
        int[][] Marks_2 = {{23, 43, 64}, {25, 73, 12}};
        System.out.println(Marks_2[0][2]);
        System.out.println();

        //casting
        double price = 100.00;
        double final_price = price + 18;
        System.out.println(final_price);

        int p = 100;
        int fp = p + (int) 19.25;
        System.out.println(fp);
        System.out.println();

        //Constant
        final float PI_1 = 3.14F;//Final - Const
        System.out.println(PI_1);

        //Operators
        //Arithamatic Operator - +,-,%,/,*
        int a = 1;
        int b = 2;
        double divi = (double) a / b;
        System.out.println(divi);
        System.out.println();

        //Assignment Operator -  +=, ++n, n++, -=
        int num = 1;
        System.out.println(num++);//add only after print
        System.out.println(++num);//add before print
        System.out.println();

        //Math Function
        System.out.println(Math.min(5, 3));
        System.out.println(Math.max(2, 46));
        System.out.println((int) (Math.random() * 10));


        //How to take input
        Scanner Input = new Scanner(System.in);//after intialisation we can add many time scan

//        System.out.print("Input your age : ");
////        int age_1 = Input.nextInt();
////        System.out.print("wow! Your age is ");
////        System.out.println(age_1);
////        System.out.print("Enter any float number : ");
////        float Fl = Input.nextFloat();
////        System.out.println(Fl);
//        String name_1 = Input.next();//This will only input a single word
//        System.out.println(name_1);
//        String name_2 = Input.nextLine();//This is Mainly used to input a line
//        System.out.println(name_2);

        //Comparision Operators
        //a == b
        //a != b
        //a <  b
        //a > b
        //a <= b
        //a >= b


        //condition statement
        boolean isSunup = true;
        if (isSunup == true)
            System.out.println("day");
        else
            System.out.println("Night");

        int age_1 = 3;
        if (age_1 > 18)
            System.out.println("Can vote");
        else
            System.out.println("cannot vote");

        System.out.println("Logical Operator");
        //logical Operator
        //&& AND Operator
        //|| OR Operator
        //! NOT Operator


        //Switch statement
//        System.out.println("switch Statement");
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter any Number : ");
//        int day = input.nextInt();
//
//        switch(day){
//            case 1 :
//                System.out.println("Monday");
//                break;
//            case 2 :
//                System.out.println("Tuesday");
//                break;
//            default:
//                System.out.println("wed - sunday");
//
//        }


        //Loops

        //For Loop

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //while loop
        int i_1 = 10;
        while (i_1 >= 1) {
            System.out.println(i_1);
            i_1--;
        }

        //Do while loop
        int i_2 = 10;
        do {
            System.out.println(i_2);
            i_2--;
        } while (i_2 > 0);

        System.out.println();

        //Break or Continue
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i == 3) {
                i += 1;
                continue;
            }
            if (i > 5) {
                break;
            }


        }
        print_java();
        print_java();
        sum_addition(3,5);

    }

}
