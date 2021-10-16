package Lab_5_b.Q_1;

public class A extends mark {
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
