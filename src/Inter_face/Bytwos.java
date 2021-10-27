package Inter_face;

public class Bytwos implements Series {
    int x;
    Bytwos(){
        x=0;
    }

    public int getNext(){
        x +=2;
        return x;
    }


}
