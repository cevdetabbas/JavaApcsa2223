package apcsaWarmUps2223;

public class warmUp01172023 {
    //wirte a method which replicates the string given time.
    //
    //
    //
    //stringReplicate("Hello",2)--->HelloHello
    //
    //stringReplicate("Hi,4)--->HiHiHiHi

    public static String stringReplicate(String str, int a)
    {
        String finalString = "";
        for(int i = 0 ; i<a ; i++)
        {
            finalString=finalString+str;
        }
        return finalString;
    }

    public static void main(String[] args) {
        System.out.println(stringReplicate("hi",3));
    }
}
