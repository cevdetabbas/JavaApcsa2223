package apcsaWarmUps2223;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmUp11012022
{
    public static void main(String[] args)
    {
        String[] arr = new String[4];
        arr[0]="Kris";
        arr[1]="Alex";
        arr[2]="Trent";
        arr[3]="Ethan";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add("Sebastian");
        Collections.reverse(list);

        System.out.println(Arrays.toString(arr));
        System.out.println(list);



    }
}
