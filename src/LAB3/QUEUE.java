package LAB3;

import java.util.*;
import java.lang.*;
public class QUEUE {
    int Q_array[] = new int[10];
    int front = 0;
    int rear = 0;
    int size = 0;

    public void INSERT(int x) {  //This is the part where we insert an item in Queue
        Q_array[rear] = x;
        rear++;
        size++;
    }

    public void DISPLAYQUEUE(){
        System.out.print("QUEUE STATUS :");
        for (int i=0;i<size;i++){
            System.out.print(Q_array[front+i]+" ");
        }
    }

    public int DELETE(){
        int temp_data;
        temp_data = Q_array[front];
        front++;
        size --;
        return  temp_data;
    }

    public  void WHONEXT(){
        System.out.println(Q_array[front]);
    }


    public static void main(String[] args) {
        QUEUE Q1= new QUEUE();
        Scanner input = new Scanner(System.in);
        int key;
        for(int i=0;i<10;i++)
        {
            System.out.println("\n1.REGISTER");
            System.out.println("2.WHONEXT");
            System.out.println("3.Display");
            System.out.println("4.DELETE");
            System.out.println("5.Exite");
            System.out.print("Enter the Choice : ");
            key = input.nextInt();
            switch (key){
                case 1:
                    System.out.print("Enter the Number to be inserted : ");
                    int data = input.nextInt();
                    Q1.INSERT(data);
                    System.out.println("Inserted "+data+ " at the end of queue");
                    break;
                case 2:
                    Q1.WHONEXT();
                    break;
                case 3:
                    Q1.DISPLAYQUEUE();
                    break;
                case 4:
                    System.out.print("The DELETED Element is ->");
                    System.out.println(Q1.DELETE());
                    break;
                case 5:
                    System.out.println("Thank you :)");
                    System.exit(0);
                    break;
            }
        }

    }
}
