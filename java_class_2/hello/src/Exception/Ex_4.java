package Exception;

class temp extends Exception {
    temp(String k) {
        super(k);
    }
}

class value {

}

public class Ex_4 {

    public static void test(int k) throws temp {
        if (k > 0) {
            throw new temp("Very Bad");
        }
    }

    public static void main(String[] args) {
        try {
            test(23);
            System.out.println("Working fine");

        } catch (temp k) {
            System.out.println(k.getMessage());

        }
    }

}
