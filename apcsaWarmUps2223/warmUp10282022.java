package apcsaWarmUps2223;

public class warmUp10282022
{
    public static void main(String[] args)
    {
        //  even Counter

        int min = 0;
        int max = 100;
        int counterEven = 0;
        int counterOdd = 0;
        for(int i = min ; i<max ; i++)
        {
            if(i%2==0)
            {
                counterEven++;
            }
            else
            {
                counterOdd++;
            }
        }
        System.out.println("There are "+counterEven+" even numbers, and "+ counterOdd+" odd numbers");

    }
}
