package Default;

public class Driver {

    public static void main(String[] args) {
        double vol1, vol2, vol3;
        Box mybox1 = new Box();
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 30;
        vol1 = mybox1.volume();
        System.out.println("Volume is " + vol1);

        Box mybox2 = new Box();
        mybox2.width = 100;
        mybox2.height = 200;
        mybox2.depth = 300;
        vol2 = mybox2.volume();
        System.out.println("Volume is " + vol2);

        Box mybox3 = new Box();
        mybox3.setDim(23, 5, 6);
        vol3 = mybox3.volume();
        System.out.println("Volume is " + vol3);

        //Constructor Invoking
        double vol4;
        System.out.println("\n");
        Box mybox4 = new Box();
        vol4 = mybox4.volume();
        System.out.println("volume is " + vol4);

        double vol5;
        Box mybox5 = new Box(500,20,20);
        vol5 = mybox5.volume();
        System.out.println("volume is " + vol5);

    }

}

