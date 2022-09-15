package apcsaProjects2223;

import java.util.Scanner;

public class projectMonthConverter09152022
{
    public static void main(String[] args)
    {
        System.out.println("enter the number of the mounth");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a==2){System.out.println("28/29 days ");}
        else if(a==1||a==3||a==5||a==7||a==8||a==10||a==12){System.out.println("31 days");}
        else if(a==4||a==6||a==9||a==11){System.out.println("30 days");}


    }
}
