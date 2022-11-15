package apcsaProjects2223;

public class projectPicnic11152022
{

    //  write a method with two boolean values weather and weekend
    //  if the weather is good and is weeked set the final value to true
    //  if weekday set the final value to false
    //  if weekend but bad weather set the final value to false
    public static boolean goToPicnic(boolean weekend, boolean weather)
    {
        if(weather==true&&weather==true)
        {
            return true;
        }
        else {return false;}
    }

    public static void main(String[] args)
    {
        System.out.println(goToPicnic(true,true));

    }
}
