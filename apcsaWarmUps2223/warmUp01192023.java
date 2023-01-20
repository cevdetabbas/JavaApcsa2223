package apcsaWarmUps2223;

public class warmUp01192023
{
    public static String front3repead(String str, int a)
    {
        String lastString = "";
        for(int i = 0 ; i<a+1 ; i++)
        {
            lastString+=str.substring(0,3);
        }
        lastString+=str.substring(3,str.length());
        return lastString;
    }

    public static void main(String[] args) {
        System.out.println(front3repead("nathaniel",3));
    }
}
