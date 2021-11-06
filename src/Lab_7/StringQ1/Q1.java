package Lab_7.StringQ1;

import java.util.Scanner;

class String_input{
    private String String_a;
    private String String_b;
    private int length_of_pre_suffix;
    public String_input(){
        String_a = "Hello";
        String_b = "world";
        length_of_pre_suffix = 3;
    }

    public String getString_a() {
        return String_a;
    }
    public String getString_b() {
        return String_b;
    }
    public int getLength_of_pre_suffix() {
        return length_of_pre_suffix;
    }

    public void setLength_of_pre_suffix(int length_of_pre_suffix) {
        this.length_of_pre_suffix = length_of_pre_suffix;
    }

    public void setString_a(String string_a) {
        String_a = string_a;
    }

    public void setString_b(String string_b) {
        String_b = string_b;
    }
}


class driver{
    public static void main(String[] args) {
        String_input ob1 = new String_input();


        Scanner input = new Scanner(System.in);
        System.out.print("Enter String A  : ");
        ob1.setString_a(input.nextLine());
        System.out.print("Enter String B  : ");
        ob1.setString_b(input.nextLine());
        int len = ob1.getString_b().length();
        System.out.print("length of pre/suffix(l) : ");
        ob1.setLength_of_pre_suffix(input.nextInt());
        String Letter1 = ob1.getString_a().substring(0, ob1.getLength_of_pre_suffix());
        String Letter2 = ob1.getString_b().substring(len-ob1.getLength_of_pre_suffix(),len);
        System.out.println(Letter1+Letter2);
    }
}