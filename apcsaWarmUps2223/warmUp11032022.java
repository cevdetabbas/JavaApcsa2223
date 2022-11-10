package apcsaWarmUps2223;

import java.util.ArrayList;

public class warmUp11032022
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alex"); // 0 index
        list.add("Kris");
        list.add("Trent");
        list.add("Nathnail");
        list.add("Ethan");
        list.add("ahmet");
        System.out.println("steven".endsWith("s"));

        System.out.println(list);

        if(list.contains("Trent"))
        {
            System.out.println("yes it contains Trent");
        }
        else {System.out.println("it does not ");}

        boolean torf = false;
        for(int i = 0 ; i<list.size(); i++)
        {
            if(list.get(i).equalsIgnoreCase("trent"))
            {
                torf=true;
            }
            //else {System.out.println("it does not ");}
        }
        if(torf){System.out.println("it does contain trent");}
        else{System.out.println("it does not");}


    }
}
