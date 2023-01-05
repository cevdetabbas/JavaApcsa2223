package apcsaWarmUps2223;

public class warmUp01032023
{

    public static int near10(int a, int b)
    {
        int differnceAto10 = 10-a;
        int differenceBto10 = b-10;

        if((a+b)/2==10)
        {
            return 10;
        }
        else
        {
            if(differenceBto10>differnceAto10){return b;}
            if(differenceBto10<differnceAto10){return a;}
        }
        return a;
    }

    public static void main(String[] args)
    {
        System.out.println(near10(8,12));

    }
}
