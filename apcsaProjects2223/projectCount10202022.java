package apcsaProjects2223;

import java.util.ArrayList;
import java.util.Arrays;

public class projectCount10202022
{
    public static void main(String[] args)
    {
        //how many 5 are the in the given list. write a program.
        //
        //1,2,3,4,5,6,5,6,5,6,5,6,8,9,0,10

        // first we will turn the number list given to an arraylist
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,5,6,5,6,5,6,8,9,0,10));
        System.out.println(list );
        //  now we will need to count how many 5 are there so we check each value
        int counter = 0;
        for(int i = 0 ; i<list.size();i++)
        {
            if(list.get(i)==5)
            {
                counter++;
            }
        }
        System.out.println("this much 5 are there "+counter);
    }
}
