package apcsaWarmUps2223;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class warmUp01102023
{
    public static ArrayList<Integer> uniqueListMethod(ArrayList<Integer> myList)
    {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for(int i =0 ; i<myList.size() ; i++)
        {
            int count =0;
            if(myList.contains(myList.get(i)))
            {
                count+=1;
            }
        }
        return uniqueList;

    }
    public static void main(String[] args)
    {
        //write a method that can return the unique objects from a anArray List of Integers
        //            Ex:
        //                list: {1,1,2,3,4,5,5}
        //                sout(list); ==> {2,3,4};

        ArrayList<Integer> asdf = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,1,1,2,2,6));
        System.out.println(uniqueListMethod(asdf));

    }
}
