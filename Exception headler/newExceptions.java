
class Badtemp extends Exception {
    Badtemp(String reason) {
        super(reason);
    }
}

class toocold extends Badtemp {
    toocold() {
        super("default Message : Too cold");
    }

    toocold(String message) {
        super(message);
    }
}

class toohot extends Badtemp {
    toohot() {
        super("Default Message : Too Hot");
    }

    toohot(String Message) {
        super(Message);
    }

}

class tempobject {
    int temperature;

    tempobject(int temp) {
        temperature = temp;
    }

    void test() throws toocold, toohot {
        if (temperature > 70)
            throw new toohot("This is very hot");
        if (temperature < 0)
            throw new toocold("This is very cold");
    }
}

public class newExceptions {

    public static void temperatureReport(tempobject ob1) {
        try {
            ob1.test();
            System.out.println("The Temperature is perfect");
        } catch (Badtemp bt) {
            System.out.println(bt.getMessage());

        }
    }

    public static void main(String[] args) {
        temperatureReport(new tempobject(102));
    }
}
