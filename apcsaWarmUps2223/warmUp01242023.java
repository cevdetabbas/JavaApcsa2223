package apcsaWarmUps2223;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp01242023
{
    public static int count9(ArrayList<Integer> arr)
    {
        int count = 0;

        for(int i =0 ; i < arr.size() ; i++)
        {
            if(arr.get(i)==9)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,39,9,9,9));
        System.out.println(count9(a));
    }
}
