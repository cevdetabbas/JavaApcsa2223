package apcsaProjects2223;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class project5to5510202022
{
    public static void main(String[] args)
    {
        //replace values of 5 with 55 with program.
        //
        //1,2,3,4,5,6,5,6,5,6,5,6,8,9,0,10

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,5,6,5,6,5,6,8,9,0,10));
        //  shortcut
        Collections.replaceAll(list,5,55);
        System.out.println(list);
        //  longcut
        for(int i =0 ; i<list.size();i++)
        {
            if(list.get(i)==6)
            {
                list.set(i,66);
            }
        }
        System.out.println(list);

    }
}
