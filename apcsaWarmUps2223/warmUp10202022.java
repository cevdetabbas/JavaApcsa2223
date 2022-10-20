package apcsaWarmUps2223;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp10202022
{
    public static void main(String[] args)
    {
        //  write a program that can return the average number from an array of integers
        //            ex:
        //                [1,2,3]
        //                average: 2

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        int sum = 0 ;

        for(int i = 0 ; i<list.size(); i++)
        {
            sum+=list.get(i);
        }
        System.out.println(sum/list.size());



    }
}
