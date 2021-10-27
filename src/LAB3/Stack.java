package LAB3;

import java.util.*;

public class Stack {
    int size;
    int sarray[];
    int top = 0;

    Stack(int size) {
        this.size = size;
        sarray = new int[size];
    }

    public void INSERT(int x) {

        if (top < size) {
            sarray[top] = x;
            top++;
        } else {

            System.out.println("The STACK is Overflowing !!!");
        }
    }

    public void DISPLAY() {
        if (top == 0) {
            System.out.println("STACK is underflow !!");
        } else {
            System.out.print("DECK STATUS :");
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(sarray[i] + " ");
            }
            System.out.print("\n");
        }
    }

    public  void DELETE() {
        if (top == 0) {
            System.out.println("The STACK is Empty");
        }
        else{
            top--;
            int data;
            data = sarray[top];
            sarray[top]=0;
            System.out.println("The Deleted element is : " + data );
        }

    }
    public void PEEP() {
        if (top == 0) {
            System.out.println("The STACK is Empty");
        } else {
            System.out.println("Element seen when peeped in is " + sarray[top - 1]);
        }

    }

    public static void main(String[] args) {
        Stack S1 = new Stack(5);
        Scanner input = new Scanner(System.in);
        int key;
        do {
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.PEEP");
            System.out.println("5.Exite");
            System.out.print("Enter the Choice : ");
            key = input.nextInt();
            switch (key){
                case 1:
                    System.out.print("Enter the Number to be inserted : ");
                    int data = input.nextInt();
                    S1.INSERT(data);
                    break;
                case 2:
                    S1.DELETE();
                    break;
                case 3:
                    S1.DISPLAY();
                    break;
                case 4:
                    S1.PEEP();
                    break;
                case 5:
                    System.out.println("Thank you :)");
                    break;
            }
        }while (key!=5);

    }
}