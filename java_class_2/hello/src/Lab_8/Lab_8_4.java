package Lab_8;

class myException extends Exception {
    myException(String k) {
        super(k);
    }

}

public class Lab_8_4 {

    public static void prouctCheck(int weight) throws myException {
        if (weight < 100) {
            throw new myException("Product invalid");
        }
    }

    public static void main(String[] args) {
        try {
            prouctCheck(12);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
