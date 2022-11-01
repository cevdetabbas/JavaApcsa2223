package apcsaProjects2223;

import java.util.Arrays;

public class projectReverseTheArray10272022
{
    public static void main(String[] args)
    {
        //  write a program that can reverse the array

        int[] arr = {1,2,3,4,5,6,7,8,9};
        //  reverse the array.

        int[] reverseArr = new int[arr.length];

        for(int i = arr.length , a=0 ; i>0  ;  i--,a++ )
        {
            reverseArr[a] = i;

        }
        System.out.println(Arrays.toString(reverseArr));

        int b = 3;
        b=5;  //  reassigning


    }
}
