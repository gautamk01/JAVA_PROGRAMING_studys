public class divisionexception1 {
    public static int divisior(int total_people, int total_sum) {
        int q = -1;
        try {
            q = total_sum / total_people;
        } catch (Exception e) {
            System.out.println("The Exception " + e.getMessage());
        } finally {
            if (q != -1) {
                System.out.println("The result is : " + q);
            } else {
                System.out.println("There is a big error ");
                return q;
            }

        }
        return q;

    }

    public static void main(String[] args) {
        System.out.println(divisior(0, 23));

    }
}
