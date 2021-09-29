package Lab2;

import java.util.Scanner;

public class OddAndEven {
    int countOfOdd ;
    int countOfEven ;

    void addNumber(int x)
    {
        if(x%2==0)
        {
            countOfEven++;
        }
        else
        {
            countOfOdd++;
        }
    }

    public String toString(){

        return String.format("Number of Odd: %d, Number of Even: %d",countOfOdd,countOfEven);
    }


}


