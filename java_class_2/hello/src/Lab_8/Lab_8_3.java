package Lab_8;

public class Lab_8_3 {
    public static void main(String[] args) {
        // Initializing String variable with null value
        String phone = "";
        // Checking if ptr.equals null or works fine.
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
