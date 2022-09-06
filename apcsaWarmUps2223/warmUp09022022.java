package apcsaWarmUps2223;

import java.util.Scanner;

public class warmUp09022022
{
    public static void main(String[] args)
    {
        System.out.println("Enter 3 numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("the minimum number of 3 entry is "+Math.min(Math.min(a,b),Math.min(b,c)));
        System.out.println("the maximum number of 3 entry is "+Math.max(Math.max(a,b),Math.max(b,c)));

        if(Math.min(Math.min(a,b),Math.min(b,c))==a)
        {
            if(Math.max(Math.max(a,b),Math.max(b,c))==b)
            {
                System.out.println("mid number is "+c);
            }
        }
        if(Math.min(Math.min(a,b),Math.min(b,c))==a)
        {
            if(Math.max(Math.max(a,b),Math.max(b,c))==c)
            {
                System.out.println("mid number is "+b);
            }
        }
        if(Math.min(Math.min(a,b),Math.min(b,c))==b)
        {
            if(Math.max(Math.max(a,b),Math.max(b,c))==c)
            {
                System.out.println("mid number is "+b);
            }
        }


        if(Math.min(Math.min(a,b),Math.min(b,c))==b)
        {
            if(Math.max(Math.max(a,b),Math.max(b,c))==a)
            {
                System.out.println("mid number is "+c);
            }
        }
        if(Math.min(Math.min(a,b),Math.min(b,c))==c)
        {
            if(Math.max(Math.max(a,b),Math.max(b,c))==a)
            {
                System.out.println("mid number is "+b);
            }
        }
        if(Math.min(Math.min(a,b),Math.min(b,c))==c)
        {
            if(Math.max(Math.max(a,b),Math.max(b,c))==b)
            {
                System.out.println("mid number is "+b);
            }
        }


    }
}
