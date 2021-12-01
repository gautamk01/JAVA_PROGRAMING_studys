package Lab_8_Exception;

public class Lab_8_3 {
    public static void main(String[] args) {

        String phone = "";

        try {
            if (phone.equals("apple"))
                System.out.println("Same smartphone");
            else
                System.out.println("Different smartphone");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Caught");
        } finally {
            System.out.println("My smartphone is - " + phone);

        }
    }
}
