package array_class;
import java.util.Arrays;
public class L_3_pack {
    public static void main(String[] args) {
        int[] array = {56,1,24,53,63,32};
        //sort methord in the util arrays
//        Arrays.sort(array);
//        for(int i:array){
//            System.out.println(i);
//        }
        //binary search array methord
        //binarysearch(the array,first index,last index, item to be searched)
        System.out.println(Arrays.binarySearch(array,0,array.length,4));
        int[] array1 = array.clone();
        //equall methord to find wheater 2 arrays are equall or not
        System.out.println(Arrays.equals(array,array1));
    }
}
