package apcsaWarmUps2223;

public class warmUp09272022
{
    public static void main(String[] args)
    {
        // write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5

        for(int i = 0 ; i<=100 ;i++)
        {
            if(i%2==1)
            {
                if(i%3==0&&i%5==0) // if(i%15==0)
                {
                    System.out.println(i);
                }
            }
        }

    }
}
