package apcsaLessons2223;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Java18_ArraysVsArrayLists10182022
{
    public static void main(String[] args)
    {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
        ARRAYS                                              ARRAYlISTS
        -array size fixed                               -size is dynamic
        -supports only primitives                       -supports only objects
        -Arrays can be multiDimentional                 -is ordered in Collection
                                                        -you can add/remove with methods
                                                        -arraylist does not skip index
                                                        -does not support multidimentinal

 */

        //  manually turn the following array to arrayList
        int[] arr = {111,2,3,4,5,6,7,8,9};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i<arr.length ; i++)
        {
            list.add(arr[i]);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
