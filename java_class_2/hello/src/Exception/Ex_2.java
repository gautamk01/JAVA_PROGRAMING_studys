package Exception;

public class Ex_2 {
    public static void main(String[] args) {
        int n, j;
        int array[] = new int[5];
        float k = 0;
        n = 20;
        j = 4;
        try {
            k = n / j;
            for (int i = 0; i <= 3; i++) {
                array[i] = i + 1;
            }
            for (int i : array) {
                System.out.print(i + " ");
            }
        } catch (ArithmeticException e) {
            System.out.println("Division not possible");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array size is 4");
        }
        System.out.println();

        System.out.println(k);

    }
}
