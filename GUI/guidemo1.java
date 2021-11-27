interface inter {
    void methodone();
}

abstract class Abstr implements inter {
    public void methodTwo() {
        System.out.println(" Methrod");

    };// This is abstract
}

class Test extends Abstr {
    public void methodTwo() {
        System.out.println("This is Method 2");

    }

    public void methodone() {
        System.out.println("Methord 1");

    }

    void methordthree() {
        System.out.println("Methord 3");

    }
}

public class guidemo1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.methodone();
        t.methodTwo();
        t.methordthree();
    }
}