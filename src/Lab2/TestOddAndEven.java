package Lab2;

import java.util.*;


public class TestOddAndEven {
    public static void main(String[] args) {
        String value;
        Scanner in = new Scanner(System.in);
        OddAndEven ob1 = new OddAndEven();
        int k=0;
        while (k==0)
        {
            System.out.print("Enter any values : ");
            value = in.nextLine();
            if (value.contains("Q") || value.contains("q"))
            {
                k=1;
            }
            else
            {
                int i = Integer.parseInt(value);
                ob1.addNumber(i);
                System.out.println(ob1.toString());
            }
        }
        in.close();
    }
}
