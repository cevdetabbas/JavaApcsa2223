package apcsaProjects2223;

import java.util.ArrayList;
import java.util.Arrays;

public class projectErase5s10202022
{
    public static void main(String[] args)
    {
        // 1,2,3,4,5,6,5,6,5,6,5,6,8,9,0,10 erase 5s

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,5,6,5,6,5,6,8,9,0,10));
        // one way to do it
        for(int i =0 ; i<list.size();i++)
        {
            if(list.get(i)==5)
            {
                list.remove(i);
            }
        }
        System.out.println(list);
        //  another way to do it but i replace 5 with 6 since there is not 5 in the list anymore.
        list.removeAll(Arrays.asList(6));
        System.out.println(list);
    }
}
