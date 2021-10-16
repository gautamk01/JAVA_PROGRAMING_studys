

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
        A ob1 = new A(79,83,78);
        B ob2 = new B(89,90,34,78);

        ob1.getPercentage();
        ob2.getPercentage();
    }
}