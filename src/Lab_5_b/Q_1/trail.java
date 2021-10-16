import java.util.Scanner;

abstract class Mark{
    abstract void getPercentage();
}

class A extends Mark{
   private int phy;
   private int chem;
   private int math;
   public A(int p,int c,int m){
       this.phy = p;
       this.chem = c;
       this.math = m;
   }
    public void getPercentage(){
       float r = ((phy+chem+math)/300.0f)*100;
        System.out.println("percentage of marks of student A " + r+"%");
    }
}
class B extends Mark{
    private int phy;
    private int chem;
    private int math;
    private int bio;
    public B(int p,int c,int m,int B){
        this.phy = p;
        this.chem = c;
        this.math = m;
        this.bio = B;
    }
    void getPercentage(){
        float r = ((phy+chem+math+bio)/400.0f)*100;
        System.out.println("percentage of marks of Student B "+r+"%");
    }
}

class Test_Marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student A Marks");
        System.out.print("Physics Mark : ");
        int p = sc.nextInt();
        System.out.print("Chemistry Mark : ");
        int c = sc.nextInt();
        System.out.print("Math Mark : ");
        int m = sc.nextInt();
        A ob1 = new A(p,c,m);
        ob1.getPercentage();

        System.out.println("Enter the Student B Marks");
        System.out.print("Physics Mark : ");
         p = sc.nextInt();
        System.out.print("Chemistry Mark : ");
         c = sc.nextInt();
        System.out.print("Math Mark : ");
        m = sc.nextInt();
        System.out.print("Biology Mark : ");
        int b = sc.nextInt();
        B ob2 = new B(p,c,m,b);
        ob2.getPercentage();
    }
}