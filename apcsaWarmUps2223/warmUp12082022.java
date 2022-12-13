package apcsaWarmUps2223;

public class warmUp12082022
{
    public static void main(String[] args)
    {
;
        System.out.println(firstLastExchange("aa"));
    }
    public static String firstLastExchange(String str)
    {
        char firstCharacter = str.charAt(0);
        char lastCharacter = str.charAt(str.length()-1);
        String newStr = lastCharacter+str.substring(1,str.length()-1)+firstCharacter;
        return newStr;
    }
}
