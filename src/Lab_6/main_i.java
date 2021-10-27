package Lab_6;

public class main_i {
        public static void main(String[] args) {
            payable p[] = new payable[2];
            p[0] = new invoice("275","Mount",2,100);
            p[1] = new salariedemployee("Gautam", "Krishna M", "275", 100,32);

            System.out.println("Invoices");
            p[0].display();
            System.out.println("\n\nSalaried Employees");
            p[1].display();
        }
}
