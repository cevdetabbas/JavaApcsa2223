package apcsaWarmUps2223;

public class warmUp12152022
{
    //write a method with name eraseDel which erases "del" string from from a string if it contins
    //
    //fx:
    //
    //eraseDel("adele")-->ae
    //
    //eraseDel("medeline")-->meine
    //
    //eraseDel("adese")-->adese

    public static String eraseDel(String str)
    {
        if(str.contains("del"))
        {
            return str.replaceAll("del","");

        }
        return str;

    }

    public static void main(String[] args)
    {
        System.out.println(eraseDel("adeladelaa"));

    }
}
