package apcsaWarmUps2223;

import java.util.Scanner;

public class warmUp09152022
{
    public static void main(String[] args)
    {
        System.out.println("1-7 enter a number for matching weekday");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a==1){System.out.println("monday");}
        if(a==2){System.out.println("tuesday");}
        if(a==3){System.out.println("wednesday");}
        if(a==4){System.out.println("thursday");}
        if(a==5){System.out.println("friday");}
        if(a==6){System.out.println("saturday");}
        if(a==7){System.out.println("sunday");}
        if(a<1){System.out.println("invalid");}
        if(a>7){System.out.println("invalid");}


    }
}
