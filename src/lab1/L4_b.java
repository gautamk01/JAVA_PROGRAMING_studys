package lab1;

public class L4_b {
    public static void main(String[] args) {
     for(int i=0;i<5;i++)
     {
         for(int j=0;j<i;j+=1)
         {
             System.out.print(" ");
         }
         for (int j=5;j>(i);j--)
         {
             System.out.print("* ");
         }

         System.out.println();
     }
    }
}
