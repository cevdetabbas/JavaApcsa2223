package apcsaWarmUps2223;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp10272022
{
    public static void main(String[] args)
    {
        //Write a program that can print out the unique values from a String Array
        //            Ex:
        //                if arr -> {"A", "A", "B", "C", "C"}
        //                output: B
        //
        //                if arr -> {"A", "B", "B", "C"}
        //                output:  A
        //                         C

        //  first create a string array
        String[] arr = {"A","A","B","C","C"};

        //  turn it into an arraylist
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(arr));

        //  I will create an empty list and for loop is going to erase current item in each iteration
        ArrayList<String> arr2 = new ArrayList<>();

        for(int i = 0 ; i<arr1.size(); i++)
        {
            // in each iteration in order to find a value is duplicated or not I will use contains method
            arr2=arr1; //  I wont touch arr1 but arr2 is going to change on each iteration.
            String a = arr2.get(i);  //  I got the value of current item
            arr2.remove(i);                         //  I erase it frome the array
            if(arr2.contains(a))  //  if the rest of the array contains removed value that means it is at least duplicated
            {
                //System.out.println("value "+a+" is duplicated");
            }
            else
            {
                System.out.println("value "+a+" is not duplicated which is unique");
            }
        }
    }
}
