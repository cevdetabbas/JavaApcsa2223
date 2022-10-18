package apcsaProjects2223;

import java.util.ArrayList;
import java.util.Arrays;

public class projectCombinedArrays10182022
{
    public static void main(String[] args)
    {
        //arr1 ==> [1,2,3]
        //		arr2 ==> [4,5,6,7];
        //
        //		arr3 ==> [1,2,3,4,5,6,7]

        String[] arr1 = {"1","2","3","666","777","888"};
        String[] arr2 = {"4","5","6"};
        ArrayList<String> combined2 = new ArrayList<>(Arrays.asList(arr1));
        combined2.addAll(Arrays.asList(arr2));
        System.out.println(combined2);

//        int[] combined = new int[arr1.length+arr2.length];
//        for(int i = 0 ; i<arr1.length ; i++)
//        {
//            combined[i]=arr1[i];
//        }
//        System.out.println(Arrays.toString(combined));
//
//        for(int i = arr1.length ,a=0 ;i<arr1.length+arr2.length;i++,a++)
//        {
//            combined[i]=arr2[a];
//        }
//        System.out.println(Arrays.toString(combined));



    }
}
