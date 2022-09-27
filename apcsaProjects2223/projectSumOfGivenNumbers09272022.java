package apcsaProjects2223;

import java.util.Scanner;

public class projectSumOfGivenNumbers09272022
{
    public static void main(String[] args)
    {
        System.out.println("enter number to cllect from 0 to it");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("sum = "+ (a*(a+1))/2 );
        int sum = 0;
        for(int i = 0 ; i<=a ; i++)
        {
            sum=sum+i; // sum+=i;
        }
        System.out.println(sum);

        char aa = 37;
        System.out.println(aa);

    }
}
