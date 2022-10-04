package apcsaProjects2223;

import java.util.Scanner;

public class projectCheckWords09302022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 words");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        int a = str1.length();
        int b = str2.length();
        int c = str3.length();

//        if(a==b&&b==c)              {System.out.println("same");}
//        else if(a==b&&a!=c&&b!=c)   {System.out.println("just 2 of them same");}
//        else if(a==c&&a!=b&&b!=c)   {System.out.println("just 2 of them same");}
//        else if(b==c&&a!=b&&a!=c)   {System.out.println("just 2 of them same");}
//        else                        {System.out.println("none same");}

        if(a==b&&b==c)              {System.out.println("all same");}
        else if (a!=b&&b!=c&&a!=b)  {System.out.println("none same");}
        else                        {System.out.println("two of them same");}


    }
}
