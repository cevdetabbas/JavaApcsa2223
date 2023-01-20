package apcsaWarmUps2223;

public class warmUp01122023
{
    public static void everyOther(String str)
    {
        for(int i = 0 ; i<str.length() ;i+=2)
        {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        everyOther("nathaniel");
    }
}
