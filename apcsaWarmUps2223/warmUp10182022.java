package apcsaWarmUps2223;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class warmUp10182022
{
    public static void main(String[] args)
    {
        //Create an ArrayList which contains name of students in the classs.
        //Print the ArrayList
        //Sort the List and Print on screen.

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Kris","Chris","Nat","Alex"));
        System.out.println(list);
        list.add("Nathen");
        list.add("sebastian");
        list.add("Trent");
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

    }
}
