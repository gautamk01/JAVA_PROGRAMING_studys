package lab1;

public class L2 {
    public static void main(String[] args) {
        System.out.println("Control Statement");
        System.out.println("Conditional Control Statement");
        System.out.println("\nif statement Example");
        int age_1 = 13;
        if (age_1 > 18)
            System.out.println("Can vote");
        else
            System.out.println("cannot vote");

        System.out.println("\nSwitch Cases Example ");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednessday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("This Number is incorrect");

        }
        System.out.println();
        System.out.println("Loops");
        //For Loop

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //while loop
        int i_1 = 10;
        while (i_1 >= 1) {
            System.out.print(i_1 + " ");
            i_1--;
        }
        System.out.println();
        //Do while loop
        int i_2 = 10;
        do {
            System.out.print(i_2 + " ");
            i_2--;
        } while (i_2 > 0);

        //Break or Continue
        System.out.println();
        int i = 0;
        while (true) {
            System.out.print(i + " ");
            i++;
            if (i == 3) {
                i += 1;
                continue;
            }
            if (i > 5) {
                break;
            }


        }

    }
}
