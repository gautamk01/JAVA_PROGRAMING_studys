package Lab_8_Exception;

import java.util.Scanner;

class myException extends Exception {
    myException(String k) {
        super(k);
    }
}

public class Lab_8_4 {

    public static void prouctCheck(int weight) throws myException {
        if (weight < 100) {
            throw new myException("Product invalid");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            prouctCheck(input.nextInt());
            System.out.println("weight is ok");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Thank you");

        }
        input.close();
    }
}
