package queue;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        queue q = new queue();
        int choice = 1, data;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\t\tCar Service Center\n\t\t\tMAX SIZE OF queue = 100");
        do
        {
            System.out.println("\n1. Register    2. Display    3. Delete      4. Who's Next");
            choice = input.nextInt();
            switch(choice)
            {
                case 1: 
                    System.out.print("Enter the data (type->integer; only one number at a time) you wish to enter: ");
                    data = input.nextInt();
                    q.register(data);
                    break;
                
                case 2:
                    q.displayqueue();
                    break;
                
                case 3:
                    q.delete();
                    break;
                
                case 4: 
                    q.whonext();
                    break;
                
                default: System.out.println("Invalid Choice");
            }
            System.out.println("\nDo you want to exit the program ? (Yes->1 | No->0)");
            choice = input.nextInt();
        }while(choice!=1);
        input.close();
    }
}