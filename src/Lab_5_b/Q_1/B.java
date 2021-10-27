package Lab_5_b.Q_1;

public class B extends Mark {
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
