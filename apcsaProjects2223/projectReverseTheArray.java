package apcsaProjects2223;

import java.util.Arrays;

public class projectReverseTheArray
{
    public static void main(String[] args)
    {
        String[] str = {"Trent","Alex","Muammer","Ethan","Sebastian","Christopher"};
        //  to reverse the array we start from the last index number and go to the zero
        //  we can find the last index number arr.length-1  since last index number is 1 less than the length
        String[] strReversed = new String[str.length];
        for(int i = 0 ; i<str.length ;i++)
        {
            strReversed[i]=str[str.length-1-i];

        }
        System.out.println(Arrays.toString(strReversed));




    }
}
