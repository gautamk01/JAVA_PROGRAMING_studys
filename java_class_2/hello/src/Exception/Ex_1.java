package Exception;

// class temp extends Exception {

//     temp(String s) {
//         super(s);
//     }
// }

public class Ex_1 {
    static int k = 2;

    public static void play() {

        if (k > 0) {
            throw new ArithmeticException("This is bad");
        }

    }

    public static void main(String[] args) {
        try {
            play();
            System.out.println("Try is successfully completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
