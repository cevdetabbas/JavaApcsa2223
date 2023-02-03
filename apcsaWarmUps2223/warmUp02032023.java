package apcsaWarmUps2223;

public class warmUp02032023
{
    public static String removeXs(String str)
    {
        String finalString = str.substring(1,str.length()-1).replaceAll("x","");
        finalString=str.charAt(0)+finalString+str.charAt(str.length()-1);
        return finalString;
    }

    public static void main(String[] args)
    {
        System.out.println(removeXs("xtremexSports"));

    }
}
