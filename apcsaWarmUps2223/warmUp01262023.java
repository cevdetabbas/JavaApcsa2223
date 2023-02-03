package apcsaWarmUps2223;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp01262023
{
    public static boolean front4check9(ArrayList<Integer> arr)
    {
        boolean result = false;
        for(int i =0  ; i<4 ; i++)
        {
            if(arr.get(i)==9)
            {
                result=true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,2,9,1,1,1,1,1));
        System.out.println(front4check9(myList));
    }
}
