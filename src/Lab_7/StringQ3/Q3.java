package Lab_7.StringQ3;
import java.util.*;
public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any words: ");
        String str = sc.nextLine();
        String[] stringArray = str.split("\\W+");
        String result = " ";
        for(int i = 0; i < stringArray.length;i++)
        {
            result = result + stringArray[i];
        }
        System.out.println("Result: " + result);
    }
}