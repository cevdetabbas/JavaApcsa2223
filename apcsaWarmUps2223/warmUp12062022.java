package apcsaWarmUps2223;

public class warmUp12062022
{
    public static String addNot(String str)
    {
        if(str.startsWith("not "))
        {
            return str;
        }
        else {return "not "+str;}
    }

    public static void main(String[] args) {
        System.out.println(addNot("not alex"));
        System.out.println(addNot("nathaniel "));
        System.out.println(addNot("nothaniel "));
        System.out.println(addNot("not haniel "));
    }
}
