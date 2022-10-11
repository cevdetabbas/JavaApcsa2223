package apcsaWarmUps2223;

import java.awt.*;
import java.util.Scanner;

public class warmUp10112022
{
    public static void main(String[] args)
    {
        //. write a program that can ask the user "enter a number" five times and return the maximum number
        //hint: you will nedd for loop and if statement

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int[] arr = {a,b,c,d,e};
        int max = a;
        for(int i = 1 ; i<arr.length ;i++)
        {

            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        System.out.println("max "+ max);

    }
}
