package learning;

interface A {
    void take();
}

interface B {
    void take();

    void show();
}

public class t_1 implements A, B {
    public void take() {
        System.out.println("From Interface A and B");
    }

    public void show() {
        System.out.println("From interface B");

    }

    public static void main(String[] args) {
        t_1 obj = new t_1();
        obj.take();
        obj.show();

    }

}
