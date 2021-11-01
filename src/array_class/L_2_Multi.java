package array_class;

public class L_2_Multi {
    public static void main(String[] args) {
        int[][] multi_array = new int [3][2];
        //there are 3 row and 2 column
        int multi_array2[][] ={{1,2},{3,4},{5,6}};
        int k=0;
        for(int i[]:multi_array2){

            System.out.println("The value of "+k);
            for(int em: i){
                System.out.print(em + " ");
            }
            System.out.println();
            k++;
        }
        int[] array1 = {1,2,3};
        //cloning an array1
        int[] clone_array1 = array1.clone();
        for(int i: clone_array1){
            System.out.println(i);
        }

    }
}
