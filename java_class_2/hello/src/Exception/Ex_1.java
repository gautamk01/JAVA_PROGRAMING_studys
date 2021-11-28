package Exception;

public class Ex_1 {

    public static void main(String[] args) {
        int i, j;
        float k = 0;
        i = 20;
        j = 0;
        try {
            k = i / j;
        } catch (Exception e) {
            System.out.println("Division not possible");
        }
        System.out.println(k);

    }
}
