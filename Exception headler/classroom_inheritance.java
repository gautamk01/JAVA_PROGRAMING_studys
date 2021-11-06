
class class_room {
    public String postion;
    public int number;
    public String Name;

    class_room(String p, int numb, String n) {
        postion = p;
        number = numb;
        Name = n;
    }
}

class teacher extends class_room {
    teacher() {
        super("Teacher", 23, "Gautam");
    }

    void display() {
        System.out.println(super.Name + super.number + super.postion);
    }

}

public class classroom_inheritance {
    public static void main(String[] args) {
        teacher ob1 = new teacher();
        ob1.display();

    }
}
