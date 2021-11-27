package Exam;

import java.util.Scanner;

public class U4CSE20325 implements Inter {
    public int vowel_count(String str){
        int count=0;
        int len = str.length();
        for(int i=0; i<len; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
              count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String name;
        int age;
        int count;
        Scanner input = new Scanner(System.in);
        U4CSE20325 ob1 = new U4CSE20325();
        name = input.nextLine();
        age = input.nextInt();
        count = ob1.vowel_count(name);
        String[] parts = name.split("\\.");
        System.out.println(count);
        for(int i =0 ;i<parts.length;i++){
            String k;
            if(i>0){
                System.out.print(parts[i]);
                System.out.print(".");
            }

        }


    }
}
